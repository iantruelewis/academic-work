<!DOCTYPE html>
<html>
<head>
    <title>Random Number Table with Function</title>
    <style>
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

<h2>5x5 Random Number Table (Using Function)</h2>

<!-- Includes external PHP file containing function -->
<?php include_once 'functions.php'; ?>

<table>
<?php
$rows = 5;
$cols = 5;

for ($i = 0; $i < $rows; $i++) {
?>
    <tr>
    <?php
    for ($j = 0; $j < $cols; $j++) {
        // Generates two random numbers
        $num1 = rand(1, 50);
        $num2 = rand(1, 50);

        // Uses external function to calculate sum
        $sum = addTwoNumbers($num1, $num2);
    ?>
        <td><?php echo $sum; ?></td>
    <?php
    }
    ?>
    </tr>
<?php
}
?>
</table>

</body>
</html>