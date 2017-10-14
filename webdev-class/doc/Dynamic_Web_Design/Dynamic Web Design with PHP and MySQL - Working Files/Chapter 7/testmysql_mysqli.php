<?php
$db = mysqli_connect('localhost','root','', 'test');
if (!$db) {
	die('Could not connect to MySQL: ' . mysqli_connect_error());
}
echo 'Connection OK'; 
mysqli_close($db);
?>