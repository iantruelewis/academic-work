<?php
// IanPopulateTable.php
// Populates 'death_metal_albums' table with sample data using prepared statements

$mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");

// Checks database connection
if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
}

// Array of albums for table
$albums = [
    ["Altars of Madness", "Morbid Angel", 1989, "Death Metal", 9.5],
    ["Left Hand Path", "Entombed", 1990, "Swedish Death Metal", 9.0],
    ["None So Vile", "Cryptopsy", 1996, "Technical Death Metal", 8.8],
    ["Tomb of the Mutilated", "Cannibal Corpse", 1992, "Brutal Death Metal", 8.7],
    ["Pierced from Within", "Suffocation", 1995, "Technical Death Metal", 9.2]
];

// Loops through each album and inserts it into database
foreach ($albums as $album) {
    $stmt = $mysqli->prepare("INSERT INTO death_metal_albums (album_title, band_name, release_year, genre, rating) VALUES (?, ?, ?, ?, ?)");
    
    $stmt->bind_param("ssisd", $album[0], $album[1], $album[2], $album[3], $album[4]);

    $stmt->execute();

    $stmt->close();
}

echo "Table death_metal_albums populated successfully.";

// Closes connection
$mysqli->close();
?>
