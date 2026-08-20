<?php
// IanDropTable.php
// Drops 'death_metal_albums' table from 'baseball_01' database

$mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");

// Checks connection
if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
}

// SQL command drops table if it exists
$sql = "DROP TABLE IF EXISTS death_metal_albums";

// Runs SQL query and checks if it succeeded
if ($mysqli->query($sql) === TRUE) {
    echo "Table death_metal_albums dropped successfully.";
} else {
    echo "Error dropping table: " . $mysqli->error;
}

// Closes connection
$mysqli->close();
?>
