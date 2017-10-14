<?php

function connectDatabase()
{
	//**********************************************
	//*
	//*  Connect to MySQL and Database
	//*
	//**********************************************

	$db = mysqli_connect('localhost','root','', 'test');

	if (!$db) {
		die('Could not connect to MySQL: ' . mysqli_connect_error());
	}

	return $db;
}

function selectResults($db, $statement)
{

	$output = "ERROR: ";
	$outputArray = array();

	$result = mysqli_query($db, $statement);

	if (!$result) {
		$output .= "<p style='color: red;'>MySQL No: ".mysqli_errno($db)."<br>";
		$output .= "MySQL Error: ".mysqli_error($db)."<br>";
		$output .= "<br>SQL: ".$statement."<br>";
		$output .= "<br>MySQL Affected Rows: ".mysqli_affected_rows($db)."</p>";

		array_push($outputArray, $output);

	} else {

		$numresults = mysqli_num_rows($result);

		array_push($outputArray, $numresults);

		for ($i = 0; $i < $numresults; $i++)
		{
			$row = mysqli_fetch_array($result);

			array_push($outputArray, $row);
		}
	}

	return $outputArray;
}


?>