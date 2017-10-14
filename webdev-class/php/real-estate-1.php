<?php

// distruct all input
// ^ that was a typo but also a Freudian slip, of sorts
// "distrust" all input
// here is simple form sanitation

// init sanitiation vars

$clean = array();
$html = array();

// validate input: only allow alpha numeric posted text data less than 20 chars from form
if (ctype_alpha($_POST['firstname_text']) AND strlen($_POST['firstname_text']) <= 20)
{
    // accept the allowable posted data into a clean array for further processing
    $clean['firstname_text'] = $_POST['firstname_text'];
    // sanitize the cleaned input array for output to HTML client
    $html['firstname_text'] = htmlentities($clean['firstname_text'], ENT_QUOTES, 'UTF-8');
    // sanitize the variable data that will be sent off to the database
    print "<p>Hi " . $html['firstname_text'] . ", we got your contact information ...</p>";
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