<?php

// don't trust session input from clients
// just like validating HTML input from users
// "distrust" all input
// here is simple cookie & session sanitation

// init sanitiation vars

$clean = array();
$html = array();

// validate input: only allow alpha numeric posted text data less than 20 chars from form
if (ctype_alpha($_POST['firstname_text']) AND strlen($_POST['firstname_text']) <= 20) {
    // accept the allowable posted data into a clean array for further processing
    $clean['firstname_text'] = $_POST['firstname_text'];
    // sanitize the cleaned input array for output to HTML client
    $html['firstname_text'] = htmlentities($clean['firstname_text'], ENT_QUOTES, 'UTF-8');
    
    // this app will maintain information about the user while they're browsing based on firstname supplied
    // is there an HTTP cookie?
    if (! isset($_COOKIE['firstname_text'])) {
        setcookie('firstname_text', $clean['firstname_text'], time() + 5, '/', 'c9.io', 'TRUE', 'TRUE');
        print "<p>Hi " . $html['firstname_text'] . ", we haven't seen you before.  Your cookie is " . $_COOKIE['firstname_text'] . "</p>";
    } else {
        // create a hashed salted token to add another layer of identification to this user's session
        $token = hash('ripemd128', 'vap0r' . $clean['firstname_text'] . 'tranz');
        // sanitize the variable data that would be sent off to the database
        print "<p>Hi " . $html['firstname_text'] . ", we've seen you before. Your token is " . $token . "</p>";
    } 
} else {
    print "Sorry, invalid name.";
}
    
// validate input: only allow pre-defined posted input from form
switch($_POST['location_radio'])
{
    case 'Chicago':
    case 'St. Louis':
    case 'Orlando':
        $clean['location_radio'] = $_POST['location_radio'];
        print "<p>You're looking in the " .$clean['location_radio']. " area.</p>";
        break;
    default:
        print "Sorry, invalid location.";
}

switch($_POST['contact_select']) {
   case 'email': 
   case 'phone': 
        $clean['contact_select'] = $_POST['contact_select'];
        print "<p>Our locale agent will contact you via " .$clean['contact_select']. ".</p>";
        break;
    default:
        print "Sorry, invalid contact.";
}

// cleanup

?>