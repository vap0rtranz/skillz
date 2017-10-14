<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<title>0615_Finding_Text_in_a_File</title>
	<link rel="stylesheet" type="text/css" href="css/basic.css" />
</head>

<body>

<h3>Finding Text in a File</h3>


<?php

	$find_city = $_POST['find_city'];

	if (empty($find_city))
	{
		$find_city = 'ALL';
	}


	$DOCUMENT_ROOT = $_SERVER['DOCUMENT_ROOT'];

	$dirname = $DOCUMENT_ROOT.'house_images';

	$dirhandle = opendir($dirname);


	if ($dirhandle)
	{
   		 while (false !== ($file = readdir($dirhandle)))
		 {
			if ($file != '.' && $file != '..')
			{
				displayPropertyInfo($file, $find_city);
			}
		 }

	}

	//*****************************************
	//**   Function Definitions
	//*****************************************

	function displayPropertyInfo($image_filename, $find_city)
	{
		//Get Image File

		$imagename = 'house_images/'.$image_filename;     // .jpg file
		$house_img = "<p><img src='".$imagename."'></p>";

		//Get Image Index Information

		$index_filename = str_replace('.jpg', '.txt', $image_filename);

		$filename = 'houses_indexed/'.$index_filename;   // .txt file

		$fp = fopen($filename, 'r');


		$show_house = 'Y';   //set default value


		while(true)
		{
			$line = fgets($fp);

			if (feof($fp))
			{
				break;
			}

			$pos = stripos($line, 'City:');

			if ($pos !== false)
			{
				$city = substr($line, 5);
				$city = trim($city);

				if ($find_city != 'ALL')
				{

					$subpos = stripos($city, $find_city);

					if($subpos === false)
					{
						$show_house = 'N';
						break;
					}

				}
			}

			$pos = stripos($line, 'Price:');

			if ($pos !== false)
			{
				$price = substr($line, 6);
				$price = trim($price);
			}

			$pos = stripos($line, 'Bedrooms:');

			if ($pos !== false)
			{
				$bedrooms = substr($line, 9);
				$bedrooms = trim($bedrooms);
			}

			$pos = stripos($line, 'Baths:');

			if ($pos !== false)
			{
				$baths = substr($line, 6);
				$baths = trim($baths);
			}

		}

		if ($show_house == 'Y')
		{
			print $house_img;

			print "City: ".$city."<br />";
			print "Bed/Baths: $bedrooms/ $baths<br />";
			print "Price: ".$price."<br /><br />";
		}

	}

?>

</body>
</html>
