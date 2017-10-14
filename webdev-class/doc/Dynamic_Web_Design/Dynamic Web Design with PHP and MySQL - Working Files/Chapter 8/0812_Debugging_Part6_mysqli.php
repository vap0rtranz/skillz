<html>
<head>
  <title>0812 Debugging Part 6</title>
  <link rel="stylesheet" href="http://profperry.com/Classes/Main.css" type="text/css">

</head>

<body style="font-family: Arial, Helvetica, sans-serif; color: Blue; background-color: silver;">

<form id="myform" method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>" >


<h2 style="background-color: #F5DEB3;">Pass data to a Select Statement</h2>

<p>Enter State Code to see Authors by State:
<input type='text' name='statecode' size='2' />
</p>

<?php
//**********************************************
//*
//*  Get Statecode
//*
//**********************************************

if (isset($_POST['statecode']))
{
	$statecode = $_POST['statecode'];

	if (empty($statecode))
	{
		$statecode = 'ALL';
	}
} else {
	$statecode = 'ALL';
}


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
//*  SELECT from table and display Results
//*
//**********************************************

$sql_statement  = "SELECT lastname, firtname, state ";
$sql_statement .= "FROM authors";

if ($statecode != 'ALL')
{
	$sql_statement .= "WHERE state = ".$statecode."' ";
}

$sql_statement .= "ORDER BY lastname, firstname ";

$result = mysqli_query($db, $sql_statement);

$outputDisplay = "";
$myrowcount = 0;

if (!$result) {
	$outputDisplay .= "<p style='color: red;'>MySQL No: ".mysqli_errno($db)."<br>";
	$outputDisplay .= "MySQL Error: ".mysqli_error($db)."<br>";
	$outputDisplay .= "<br>SQL: ".$sql_statement."<br>";
} else {

	if ($statecode == 'ALL')
	{
		$outputDisplay  = "<h3>Authors who live in All States</h3>";
	} else {
		$outputDisplay  = "<h3>Authors who live in ".$statecode."</h3>";
	}


	$outputDisplay .= '<table border=1 style="color: black;">';
	$outputDisplay .= '<tr><th>Last Name</th><th>First Name</th><th>State</th></tr>';

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

		$lastname  = $row['lastname'];
		$firstname = $row['firstname'];
		$state = $row['state'];

		$outputDisplay .= "<td>".$lastname."</td>";
		$outputDisplay .= "<td>".$firtname."</td>";
		$outputDisplay .= "<td>".$state."</td>";

		$outputDisplay .= "</tr>";

	}

	$outputDisplay .= "</table>";

}


?>

<br /><br /><input type="submit" value="Submit SQL Statements" />

<hr size="4" style="background-color: #F5DEB3; color: #F5DEB3;" />

<?php
	$outputDisplay .= "<br /><br /><b>Number of Rows in Results: $myrowcount </b><br /><br />";
	print $outputDisplay;
?>


</form>
</body>
</html>