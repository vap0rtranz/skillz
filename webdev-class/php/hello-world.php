<?php
// A simple web site in Cloud9 that runs through Apache
// Press the 'Run' button on the top to start the web server,
// then click the URL that is emitted to the Output tab of the console

echo 'Hello world from Cloud9!';

$inner="why?";
$outter="inner";

echo "<br>";
echo $$outter;

$snacks = array("chocolate", "chips", "nuts");
print_r($snacks);

if ($snacks[0]=="chocolate" AND $snacks[1]!="nuts") {
    echo "chocolate";
} else {
    echo "no chocolate";
}

?>
