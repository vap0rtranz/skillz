<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<title>0504_Write File</title>
	<link rel="stylesheet" type="text/css" href="css/basic.css" />
</head>

<body>

<h3>Write to File</h3>

<?php

	$DOCUMENT_ROOT = $_SERVER['DOCUMENT_ROOT'];

	//************************************
	//  Write to File  (Overwrite)
	//************************************

	print "<h4>Writing to File<b/h4>>";

	$filename = $DOCUMENT_ROOT.'data/'.'glist_1.txt';

	$fp = fopen($filename, 'w');   //opens the file for writing

	$cntr = 1;

	while(true)
	{
		$item_html_name = 'item'.$cntr;

		$item = $_POST[$item_html_name];

		if (empty($item))
		{
			break;
		}

		$cntr++;

		print "Item: ".$item."<br />";

		$output_line = $item."\n";

		fwrite($fp, $output_line);

	}


	fclose($fp);


	//************************************
		//  Write to File  (Append)
	//************************************

	print "<h4>Appending File<b/h4>>";

	$filename = $DOCUMENT_ROOT.'data/'.'glist_2.txt';

		$fp = fopen($filename, 'a');   //opens the file for appending

		$cntr = 1;

		while(true)
		{
			$item_html_name = 'item'.$cntr;

			$item = $_POST[$item_html_name];

			if (empty($item))
			{
				break;
			}

			$cntr++;

			print "Item: ".$item."<br />";

			$output_line = $item."\n";

			fwrite($fp, $output_line);

		}


?>

</body>
</html>
