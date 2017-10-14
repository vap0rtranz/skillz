<?php

$myData = $_POST['data'];  //This recieves the data passed

$myTable = "<table border='1'>";

$myTable .= "<tr>";
$myTable .= "<th>UserID</th>";
$myTable .= "<th>Password</th>";
$myTable .= "</tr>";


//*****************************************************
//Read Guestbook Information From File Into HTML table
//*****************************************************

$display = "";
$line_ctr = 0;

include "0811_common_functions.php";

$outputDisplay = '';


$statement  = "SELECT ";
$statement .= "userid, password ";
$statement .= "FROM validusers ";
$statement .= "ORDER BY userid ";

$sqlResults = selectResults($statement);

$error_or_rows = $sqlResults[0];

if (substr($error_or_rows, 0 , 5) == 'ERROR')
{
	$myTable .= "Error on DB";
	$myTable .= "$error_or_rows";
} else {

	for ($ii = 1; $ii <= $error_or_rows; $ii++)
	{
		$userid  	= $sqlResults [$ii] ['userid'];
		$password  	= $sqlResults [$ii] ['password'];

		$myTable .= "<tr>";
		$myTable .= "<td>".$userid."</td>";
		$myTable .= "<td>".$password."</td>";
		$myTable .= "</tr>\n";
	}

	print "</table>";

	print $myTable;
}

?>