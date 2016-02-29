<?php

$isMale = $_POST["isMale"];
$isGain = $_POST["isGain"];
$age = $_POST["age"];
$height = $_POST["height"];
$weight = $_POST["weight"];
$em = $_POST["Exercise"];






$servername = "localhost";
$username = "leanfitg_root";
$password = "LeanFit123";
$dbname = "leanfitg_database";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}


$sql = "INSERT INTO users_information (username, password, fullName, isMale, isGain, age, height, weight, activityAmount, weightGoal, share)
VALUES ('John', 'Doe', 'John Doe', '$isMale', '$isGain', '$age', '$height', '$weight', '$em' , '3', '1' )";


if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}

$conn->close();




?>
