<?php
// IanForm.php
// Displays form to add new death metal albums and processes input

// If form submitted, inserts into DB
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");
    if ($mysqli->connect_error) {
        die("Connection failed: " . $mysqli->connect_error);
    }

    // Gets form data safely
    $album_title = $_POST['album_title'];
    $band_name = $_POST['band_name'];
    $release_year = $_POST['release_year'];
    $genre = $_POST['genre'];
    $rating = $_POST['rating'];

    $stmt = $mysqli->prepare("INSERT INTO death_metal_albums (album_title, band_name, release_year, genre, rating) VALUES (?, ?, ?, ?, ?)");
    $stmt->bind_param("ssisd", $album_title, $band_name, $release_year, $genre, $rating);
    $stmt->execute();
    $stmt->close();
    $mysqli->close();

    echo "<p>Album added successfully!</p>";
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Add New Death Metal Album</title>
</head>
<body style="font-family: Arial; margin: 2rem;">
    <h1>Add a New Album</h1>
    <form method="POST" action="IanForm.php">
        <label>Album Title: <input type="text" name="album_title" required></label><br><br>
        <label>Band Name: <input type="text" name="band_name" required></label><br><br>
        <label>Release Year: <input type="number" name="release_year" required></label><br><br>
        <label>Genre: <input type="text" name="genre"></label><br><br>
        <label>Rating: <input type="number" step="0.1" name="rating"></label><br><br>
        <button type="submit">Add Album</button>
    </form>

    <p><a href="IanIndex.php">Back to Index</a></p>
</body>
</html>
