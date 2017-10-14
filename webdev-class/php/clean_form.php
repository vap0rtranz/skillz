<?php

// distruct all input
// ^ that was a typo but also a Freudian slip, of sorts
// "distrust" all input
// here is simple form sanitation

 //Connect to the database
    $host = "vap0rtranz-webdev-class-1544821";   //See Step 3 about how to get host name
    $user = "vap0rtranz";                     //Your Cloud 9 username
    $pass = "";                                 //Remember, there is NO password!
    $db = "webdev";                          //Your database name you want to connect to
    $port = 3306;                               //The port #. It is always 3306

    $db_connection = mysqli_connect($host, $user, $pass, $db, $port);
    if (!$db_connection) { 
	    die('Could not connect to MySQL: ' . mysqli_error()); 
    } else {
        print "<p>DB connection OK</p>";
    }

// init sanitiation vars

$clean = array();
$html = array();
$database = array();

// validate input: only allow alpha numeric posted data from form
if (ctype_alnum($_POST['username_text']))
{
    // accept the allowable posted data into a clean array for further processing
    $clean['username_text'] = $_POST['username_text'];
    // sanitize the cleaned input array for output to HTML client
    $html['username_text'] = htmlentities($clean['username_text'], ENT_QUOTES, 'UTF-8');
    // sanitize the variable data that will be sent off to the database
    $database['username_text'] = mysqli_real_escape_string($db_connection, $clean['username_text']);
    $query = "SELECT username FROM users WHERE username = '{$database['username_text']}'";
    $result = mysqli_query($db_connection, $query);
    while ($row = mysqli_fetch_assoc($result)) {
        if ( $row['username']==$clean['username_text'] ) {
           print "<p>Welcome back, " . $row['username'] ."</p>";
        } else {
           print "<p>Hello " . $html['username_text'] . ", I've not seen you before ...</p>";
        }
    } 
} else {
    print "Sorry, invalid username";
}

// validate input: only allow pre-defined posted input from form
switch($_POST['pet_select'])
{
    case 'Dog':
    case 'Cat':
    case 'Bird':
        $clean['pet_select'] = $_POST['pet_select'];
        print "<p>Pet selected correctly as " .$clean['pet_select']. "</p>";
        break;
    default:
        print "Sorry, invalid pet.";
}

// cleanup
mysqli_close($db_connection); 

?>