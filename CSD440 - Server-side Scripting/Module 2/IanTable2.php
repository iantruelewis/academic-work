<!DOCTYPE html>
<html>
<head>
    <title>Random Number Table</title>
    <style>
        /* Basic styling for table */
        table {
            border-collapse: collapse;
        }
        td {
            border: 1px solid #333;
            padding: 10px;
            text-align: center;
            width: 50px;
        }
    </style>
</head>
<body>

<h2>5x5 Random Number Table</h2>

<!-- Start of table structure -->
<table>
<?php
// Defines number of rows and columns for table
$rows = 5;
$cols = 5;

// Outer loop: iterates through each row
for ($i = 0; $i < $rows; $i++) {
?>
    <tr>
    <?php
    // Inner loop: iterates through each column in current row
    for ($j = 0; $j < $cols; $j++) {
        // Generates a random number between 1 and 100
        $randomNumber = rand(1, 100);
    ?>
        <!-- Outputs random number inside table cell -->
        <td><?php echo $randomNumber; ?></td>
    <?php
    } // End of inner loop (columns)
    ?>
    </tr>
<?php
} // End of outer loop (rows)
?>
</table>

</body>
</html>