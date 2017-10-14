<html>
<head>
  <title>0805_Changing_Data_in_a_Table</title>
  <link rel="stylesheet" href="http://profperry.com/Classes/Main.css" type="text/css">

  <style>
	#changeauthor {
		position: absolute;
		top: 80px;
		left: 400px;
		width: 300px;
		height: 500px;
		padding: 10px;
		background-color: #CCCCFF;
	}

	#displayauthor {
		position: absolute;
		top: 80px;
		left: 10px;
		width: 300px;
		height: auto;
		padding: 10px;
		background-color: #CCCCFF;
	}
  </style>

</head>

<body style="font-family: Arial, Helvetica, sans-serif; color: Blue; background-color: silver;">

<form id="myform" method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>" >

<h2 style="background-color: #F5DEB3;">Changing Information in a Table</h2>


<div id='changeauthor'>
    <h3>Change Author Information</h3>

	<p>Enter Author's SSN:<br>
		<input type='text' name='myssn' size='11' />
	</p>

	<p>New Last Name:<br>
		<input type='text' name='mylastname' size='20' />
	</p>

	<p>New First Name:<br>
		<input type='text' name='myfirstname' size='20' />
	</p>

	<br><input type="submit" name="changebutton" value="Change Author" />


<?php


//**********************************************
//*
//*  Connect to MySQL and Database
//*
//**********************************************

$db = mysqli_connect('localhost','root','', 'test');

if (!$db)
{
	print "<h1>Unable to Connect to MySQL</h1>";
}


//**********************************************
//*
//*  Add Author to Table
//*
//**********************************************

if (isset($_POST['changebutton']))
{
	$mychangebutton = trim($_POST['changebutton']);
} else {
	$mychangebutton = '';
}

if ($mychangebutton == 'Change Author')
{

	if (isset($_POST['myssn']))
	{
		$myssn = trim($_POST['myssn']);
	} else {
		$myssn = '';
	}

	if (isset($_POST['mylastname']))
	{
		$mylastname = trim($_POST['mylastname']);
	} else {
		$mylastname = '';
	}

	if (isset($_POST['myfirstname']))
	{
		$myfirstname = trim($_POST['myfirstname']);
	} else {
		$myfirstname = '';
	}


	if (empty($myssn) || empty($mylastname) || empty($myfirstname))
	{
		print "<p style='color: red'>Must Fill Out All Fields</p>";
	} else {

		$rtninfo = updateAuthor($db, $myssn, $mylastname, $myfirstname);

		if ($rtninfo == "AuthorNotFound")
		{
			print "<p style='color: red'>Author Not Found - Check SSN</p>";
		} else {
			if ($rtninfo == "NotUpdated")
			{
				print "<p style='color: red'>Author Not Updated</p>";
			} else {
				print "<p style='color: green'>Author with SSN of $myssn <br>has been Changed to $myfirstname $mylastname";
			}
		}
	}
}
?>

</div>  <!-- End changeauthor DIV -->

<div id='displayauthor'>

<?php
//**********************************************
//*
//*  SELECT from table and display Results
//*
//**********************************************

$sql_statement  = "SELECT ssn, lastname, firstname ";
$sql_statement .= "FROM author ";
$sql_statement .= "ORDER BY lastname, firstname ";

$result = mysqli_query($db, $sql_statement);

$outputDisplay = "";
$myrowcount = 0;

if (!$result) {
	$outputDisplay .= "<p style='color: red;'>MySQL No: ".mysqli_errno($db)."<br>";
	$outputDisplay .= "MySQL Error: ".mysqli_error($db)."<br>";
	$outputDisplay .= "<br>SQL: ".$sql_statement."<br>";
	$outputDisplay .= "<br>MySQL Affected Rows: ".mysqli_affected_rows($db)."</font><br>";
} else {

	$outputDisplay  = "<h3>Author Table Data</h3>";

	$outputDisplay .= '<table border=1 style="color: black;">';
	$outputDisplay .= '<tr><th>SSN</th><th>Last Name</th><th>First Name</th></tr>';

	$numresults = mysqli_num_rows($result);

	for ($i = 0; $i < $numresults; $i++)
	{
		if (!($i % 2) == 0)
		{
			 $outputDisplay .= "<tr style=\"background-color: #F5DEB3;\">";
		} else {
			 $outputDisplay .= "<tr style=\"background-color: white;\">";
		}


		$myrowcount++;

		$row = mysqli_fetch_array($result);

		$ssn 	   = $row['ssn'];
		$lastname  = $row['lastname'];
		$firstname = $row['firstname'];

		$outputDisplay .= "<td>".$ssn."</td>";

		$outputDisplay .= "<td>".$lastname."</td>";
		$outputDisplay .= "<td>".$firstname."</td>";

		$outputDisplay .= "</tr>";
	}

	$outputDisplay .= "</table>";

}


$outputDisplay .= "<br><br><b>Number of Rows in Results: $myrowcount </b><br><br>";
print $outputDisplay;

?>

</div>  <!-- End displayauthor DIV -->

</form>
</body>
</html>

<?php

function updateAuthor($db, $myssn, $mylastname, $myfirstname)
{

    //First check if SSN exists

	$sql_statement  = "SELECT ssn ";
	$sql_statement .= "FROM author ";
	$sql_statement .= "WHERE ssn = '".$myssn."' ";

	$result = mysqli_query($db, $sql_statement);  // Run SELECT

	$numresults = mysqli_num_rows($result);


	// If SSN exists then Update the Author Info

	if ($numresults > 0)
	{

		$statement 	= "update author ";
		$statement .= " set lastname = '".$mylastname."', ";
		$statement .= "     firstname = '".$myfirstname."' ";
		$statement .= "where ssn = '".$myssn."' ";

		$result = mysqli_query($db, $statement);

		if ($result)
		{
			return $myssn;
		} else {
			$errno = mysqli_errno($db);

			echo("<h4>MySQL No: ".mysqli_errno($db)."</h4>");
			echo("<h4>MySQL Error: ".mysqli_error($db)."</h4>");
			echo("<h4>SQL: ".$statement."</h4>");
			echo("<h4>MySQL Affected Rows: ".mysqli_affected_rows($db)."</h4>");

			return 'NotUpdated';
		}
	} else {

		return 'AuthorNotFound';
	}
}
?>