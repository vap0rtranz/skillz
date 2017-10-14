<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<title>0503_Reading_File</title>

	<link rel="stylesheet" type="text/css" href="css/king_2.css" />

</head>

<body>

<h3>Reading From a File</h3>

	<?php
		$DOCUMENT_ROOT = $_SERVER['DOCUMENT_ROOT'];

		$filename = $DOCUMENT_ROOT.'data/'.'cities.txt';

		$lines_in_file = count(file($filename));

		$fp = fopen($filename, 'r');   //opens the file for reading

		for ($ii = 1; $ii <= $lines_in_file; $ii++)
		{
			$line = fgets($fp);  //Reads one line from the file
			$city = trim($line);

			print 'City: '.$city.'<br />';
		}

		fclose($fp);

	?>


</body>
</html>
