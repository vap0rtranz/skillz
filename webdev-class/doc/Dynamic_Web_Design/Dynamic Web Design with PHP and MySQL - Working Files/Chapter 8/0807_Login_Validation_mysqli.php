<html>
<head>
  <title>0807_Login_Validation</title>
  <link rel="stylesheet" href="http://profperry.com/Classes/Main.css" type="text/css">

</head>

<body style="font-family: Arial, Helvetica, sans-serif; color: Blue; background-color: silver;">

<form id="myform" method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>" >


<h2 style="background-color: #F5DEB3;">Login Validation</h2>



<?php
//**********************************************
//*
//*  Get Userid and Password
//*
//**********************************************

if (isset($_POST['userid']))
{
	$userid = $_POST['userid'];
} else {
	$userid = '';
}

if (isset($_POST['password']))
{
	$password = $_POST['password'];
} else {
	$password = '';
}

if (isset($_POST['userid']))
{
	print "<input type='hidden' name='userid' size='11' value='".$userid."' /><br /> ";
	print "<input type='hidden' name='password' size='11' value='".$password."' /><br /> ";
} else {
	print "<h2>Enter UserId/Password to Login: </h2>";

	print "<table> ";

	print "<tr> ";
	print "<td>User ID</td><td><input type='text' name='userid' size='11' /><br /> ";
	print "</tr> ";

	print "<tr> ";
	print "<td>Password</td><td><input type='password' name='password' size='11' /></td> ";
	print "</tr> ";

	print "</table> ";

	print "<p><input type='submit' name='mysubmit' value='Login' /> ";

	print "</form></body></html>";

	exit;

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

$sql_statement  = "SELECT userid ";
$sql_statement .= "FROM validusers ";
$sql_statement .= "WHERE userid = '".$userid."' ";
$sql_statement .= "AND password = '".$password."' ";

$result = mysqli_query($db, $sql_statement);

$outputDisplay = "";
$myrowcount = 0;

if (!$result) {
	$outputDisplay .= "<p style='color: red;'>MySQL No: ".mysqli_errno($db)."<br>";
	$outputDisplay .= "MySQL Error: ".mysqli_error($db)."<br>";
	$outputDisplay .= "<br>SQL: ".$sql_statement."<br>";
} else {

	$numresults = mysqli_num_rows($result);

	if ($numresults == 0)
	{
		$outputDisplay .= "Invalid Login <br /> ";
		$outputDisplay .= "Please Go BACK and try again";
	} else {
		$outputDisplay .= doShowList($db);
	}
}

?>

<hr size="4" style="background-color: #F5DEB3; color: #F5DEB3;" />

<?php
	print $outputDisplay;
?>


</form>
</body>
</html>
<?php
function doShowList($db)
{
	$sql_statement  = "SELECT title, type ";
	$sql_statement .= "FROM book ";
	$sql_statement .= "ORDER BY title, type ";

	$result = mysqli_query($db, $sql_statement);

	$outputDisplay = "";
	$myrowcount = 0;

	if (!$result) {
		$outputDisplay .= "<p style='color: red;'>MySQL No: ".mysqli_errno($db)."<br>";
		$outputDisplay .= "MySQL Error: ".mysqli_error($db)."<br>";
		$outputDisplay .= "<br>SQL: ".$sql_statement."<br>";
	} else {

		$outputDisplay  = "<h3>Books</h3>\n";

		$outputDisplay .= '<table border=1 style="color: black;">'."\n";
		$outputDisplay .= '<tr><th>Title</th><th>Type</th></tr>' ."\n";

		$numresults = mysqli_num_rows($result);

		for ($i = 0; $i < $numresults; $i++)
		{
			if (!($i % 2) == 0)
			{
				 $outputDisplay .= "<tr style=\"background-color: #F5DEB3;\">\n";
			} else {
				 $outputDisplay .= "<tr style=\"background-color: white;\">\n";
			}

			$row = mysqli_fetch_array($result);

			$title  = $row['title'];
			$type = $row['type'];

			$outputDisplay .= "<td>".$title."</td>";
			$outputDisplay .= "<td>".$type."</td>";

			$outputDisplay .= "</tr>\n";

		}

		$outputDisplay .= "</table>\n";

	}


	return $outputDisplay;
}
?>