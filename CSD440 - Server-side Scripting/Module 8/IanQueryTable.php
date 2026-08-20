<?php
// IanQueryTable.php
// Queries and displays all records from 'death_metal_albums' table

$mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");

// Checks database connection
if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
}

// Runs SQL query to select all albums
$result = $mysqli->query("SELECT * FROM death_metal_albums");

// If there are results, displays them in HTML list
if ($result->num_rows > 0) {
    echo "<h2>Top Death Metal Albums</h2><ul>";
    
    // Loops through each row and prints album info
    while ($row = $result->fetch_assoc()) {
        echo "<li><strong>{$row['album_title']}</strong> by <em>{$row['band_name']}</em> ({$row['release_year']}) – Genre: {$row['genre']}, Rating: {$row['rating']}</li>";
    }

    echo "</ul>";
} else {
    echo "No albums found.";
}

// Closes connection
$mysqli->close();
?>
