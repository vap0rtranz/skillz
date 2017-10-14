<html>
<head>
  <title>0806_Populate_a_Select_Option_List</title>
  <link rel="stylesheet" href="http://profperry.com/Classes/Main.css" type="text/css">

</head>

<body style="font-family: Arial, Helvetica, sans-serif; color: Blue; background-color: silver;">


<h2 style="background-color: #F5DEB3;">Populate a Select Option List</h2>

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
//*  SELECT from table and display Results
//*
//**********************************************

$sql_statement  = "SELECT name ";
$sql_statement .= "FROM city ";
$sql_statement .= "ORDER BY name ";

$result = mysqli_query($db, $sql_statement);

$outputDisplay = "";
$myrowcount = 0;

if (!$result) {
	$outputDisplay .= "<p style='color: red;'>MySQL No: ".mysqli_errno($db)."<br>";
	$outputDisplay .= "MySQL Error: ".mysqli_error($db)."<br>";
	$outputDisplay .= "<br>SQL: ".$sql_statement."<br>";
} else {

	$outputDisplay  = "<select>";

	$numresults = mysqli_num_rows($result);

	for ($i = 0; $i < $numresults; $i++)
	{
		$row = mysqli_fetch_array($result);

		$name  = $row['name'];

		$outputDisplay .= "<option value='".$name."'>".$name."</option>";
	}

	$outputDisplay .= "</select>";

}


?>

<?php
	print $outputDisplay;
?>

</body>
</html>