<html>
<head>
  <title>0803_Adding_Rows_to_a_Table</title>
  <link rel="stylesheet" href="http://profperry.com/Classes/Main.css" type="text/css">

  <style>
	#addauthor {
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

<h2 style="background-color: #F5DEB3;">Adding Rows to a Table</h2>


<div id='addauthor'>
    <h3>Add Author</h3>

	<p>Enter SSN:<br>
		<input type='text' name='myssn' size='11' />
	</p>

	<p>Enter Last Name:<br>
		<input type='text' name='mylastname' size='20' />
	</p>

	<p>Enter First Name:<br>
		<input type='text' name='myfirstname' size='20' />
	</p>

	<br><input type="submit" name="addbutton" value="Add Author" />


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

if (isset($_POST['addbutton']))
{
	$myaddbutton = trim($_POST['addbutton']);
} else {
	$myaddbutton = '';
}

if ($myaddbutton == 'Add Author')
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
		$rtninfo = insertAuthor($db, $myssn, $mylastname, $myfirstname);

		if ($rtninfo == "NotAdded")
		{
			print "<p style='color: red'>Author Not Added</p>";
		} else {
			print "<p style='color: green'>Author $myfirstname $mylastname ($myssn) has been Added";
		}
	}
}
?>

</div>  <!-- End addauthor DIV -->

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

function insertAuthor($db, $myssn, $mylastname, $myfirstname)
{

	$statement 	= "insert into author (ssn, lastname, firstname) ";
	$statement .= "values (";
	$statement .= "'".$myssn."', '".$mylastname."', '".$myfirstname."'";
	$statement .= ")";

	$result = mysqli_query($db, $statement);

	if ($result)
	{
		return $myssn;
	} else {
	    $errno = mysqli_errno($db);

	    if ($errno == '1062') {
			echo "<p style='color: red'>Author with SSN of ".$myssn. " is already in Table ";
		} else {
			echo("<h4>MySQL No: ".mysqli_errno($db)."</h4>");
			echo("<h4>MySQL Error: ".mysqli_error($db)."</h4>");
			echo("<h4>SQL: ".$statement."</h4>");
			echo("<h4>MySQL Affected Rows: ".mysqli_affected_rows($db)."</h4>");
		}

		return 'NotAdded';
	}


}
?>