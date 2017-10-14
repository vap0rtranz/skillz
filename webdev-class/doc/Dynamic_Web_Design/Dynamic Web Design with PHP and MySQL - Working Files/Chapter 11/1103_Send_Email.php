<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<title>Send eMail to Somebody</title>
</head>

<body>

<?php

$myFirstName = $_POST['firstname'];
$mySubject = $_POST['subject'];
$myMessage = $_POST['message'];
$TO_email = $_POST['to_email'];

sendEmailToSomebody($myFirstName, $mySubject, $myMessage, $TO_email);

print "<h4>An email has been sent to $myFirstName</h4>";



function sendEmailToSomebody($myFirstName, $mySubject, $myMessage, $TO_email)
{

	$to = $TO_email;

	$subject = "I have graded your $mySubject, ".$myFirstName;

	$body .= "Message:\n\n";
	$body .= "$myMessage";

	$from = 'From: "The Instructor" <stevetest@profperry.com>';

	$rtnto = '-steveclass@profperry.com';  //Can Specify a different Return-To email!

	mail($to, $subject, $body, $from, $rtnto);
}

?>


</body>
</html>
