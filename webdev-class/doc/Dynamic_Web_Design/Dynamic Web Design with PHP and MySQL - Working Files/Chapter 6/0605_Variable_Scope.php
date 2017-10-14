<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<title>0605 Variable Scope</title>
	<link rel="stylesheet" type="text/css" href="css/basic.css" />
</head>

<body>

<h3>Variable Scope</h3>

<?php

	$institution = "Infinite Skills";

	$rtr_info = doStartUp();

	print "<br />Insitution: ".$institution;
	print "<br />Class: ".$class;
	print "<br />Class Type: ".$class_type;
	print "<br />rtr_info: ".$rtr_info;
	print "<br />Degree: ".$degree;


	function doStartUp()
	{
		$class = "PHPMySQL";

		$classInstructorInfo = getClassInstructorInfo($class);
		return $classInstructorInfo."*DEGREE: ".$degree;
	}

	function getClassInstructorInfo($a_class)
	{

		global $degree;

		$class_type = "Video";

		if ($a_class == 'PHPMySQL')
		{
			$instructor = 'Steve Perry';
			$degree = 'MAED';
		}

		return $instructor;

	}

?>

</body>
</html>
