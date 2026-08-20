<?php
// IanQuery.php
// Page with search form to find death metal albums by band or genre

$results = [];

if ($_SERVER["REQUEST_METHOD"] == "GET" && isset($_GET['search'])) {
    $mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");
    if ($mysqli->connect_error) {
        die("Connection failed: " . $mysqli->connect_error);
    }

    $search = "%" . $_GET['search'] . "%";

    $stmt = $mysqli->prepare("SELECT * FROM death_metal_albums WHERE band_name LIKE ? OR genre LIKE ?");
    $stmt->bind_param("ss", $search, $search);
    $stmt->execute();
    $result = $stmt->get_result();

    while ($row = $result->fetch_assoc()) {
        $results[] = $row;
    }

    $stmt->close();
    $mysqli->close();
}
?>

<!DOCTYPE html>
<html>
<head>
    <title>Search Death Metal Albums</title>
</head>
<body style="font-family: Arial; margin: 2rem;">
    <h1>Search Albums</h1>
    <form method="GET" action="IanQuery.php">
        <label>Search by Band or Genre: <input type="text" name="search" required></label>
        <button type="submit">Search</button>
    </form>

    <?php if (!empty($results)): ?>
        <h2>Results:</h2>
        <ul>
        <?php foreach ($results as $album): ?>
            <li><strong><?php echo htmlspecialchars($album['album_title']); ?></strong> by <em><?php echo htmlspecialchars($album['band_name']); ?></em> (<?php echo $album['release_year']; ?>) – <?php echo htmlspecialchars($album['genre']); ?> – Rating: <?php echo $album['rating']; ?></li>
        <?php endforeach; ?>
        </ul>
    <?php elseif (isset($_GET['search'])): ?>
        <p>No albums found for '<?php echo htmlspecialchars($_GET['search']); ?>'.</p>
    <?php endif; ?>

    <p><a href="IanIndex.php">Back to Index</a></p>
</body>
</html>
