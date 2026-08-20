<?php
// IanCreateTable.php
// Creates 'death_metal_albums' table in 'baseball_01' database.

$mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");

// Checks connection to database
if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
}

// SQL statement creates table with 5 fields
$sql = "CREATE TABLE death_metal_albums (
    id INT AUTO_INCREMENT PRIMARY KEY,
    album_title VARCHAR(100) NOT NULL,
    band_name VARCHAR(100) NOT NULL,
    release_year YEAR NOT NULL,
    genre VARCHAR(50),
    rating FLOAT
)";

// Runs SQL query and checks if it succeeded
if ($mysqli->query($sql) === TRUE) {
    echo "Table death_metal_albums created successfully.";
} else {
    echo "Error creating table: " . $mysqli->error;
}

// Closes database connection
$mysqli->close();
?>
