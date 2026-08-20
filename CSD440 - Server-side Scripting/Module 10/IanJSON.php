<!DOCTYPE html>
<html>
<head>
    <title>Ian's JSON Result</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            padding: 40px;
        }
        .result-box {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 8px;
            max-width: 600px;
            margin: auto;
        }
        pre {
            background-color: #eee;
            padding: 10px;
            border-radius: 5px;
            overflow-x: auto;
        }
        h2 {
            margin-top: 0;
        }
    </style>
</head>
<body>
<div class="result-box">
<?php
// Checks if form was submitted using POST
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    // Defines fields expected from form
    $fields = ['first_name', 'last_name', 'email', 'age', 'city', 'country', 'favorite_color', 'hobby'];
    
    $data = [];        
    $missing = false;

    // Loops over each expected field
    foreach ($fields as $field) {
        // Checks if field was submitted and is not empty
        if (isset($_POST[$field]) && $_POST[$field] !== '') {
            // Stores value, escaping it to be safe
            $data[$field] = htmlspecialchars($_POST[$field]);
        } else {
            $missing = true;
        }
    }

    // If no fields are missing, encodes data to JSON and displays it
    if (!$missing) {
        $json = json_encode($data, JSON_PRETTY_PRINT);
        echo "<h2>Your submitted data in JSON format:</h2>";
        echo "<pre>$json</pre>";
    } else {
        // Redirect to the error page if any field is missing
        header("Location: IanError.php");
        exit;
    }
} else {
    // If page was accessed directly, shows an error
    echo "<h2>Error: Invalid request.</h2>";
}
?>
</div>
</body>
</html>
