<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<title>Using Select</title>
	<link rel="stylesheet" type="text/css" href="css/basic_2.css" />
</head>

<body>

<h3>Job Report</h3>

<?php
	$name = $_POST['name'];
	$job = $_POST['job'];

	print "<p>You are <span class='textblue'> $name</span> and ";
	print "your position at the college is: <span class='textblue'> $job </span></p>";
?>

</body>
</html>
