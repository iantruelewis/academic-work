<?php
// IanCustomers.php

// Create an array of customers
$customers = [
    ["first_name" => "Alice", "last_name" => "Johnson", "age" => 28, "phone" => "555-1111"],
    ["first_name" => "Bob", "last_name" => "Smith", "age" => 34, "phone" => "555-2222"],
    ["first_name" => "Charlie", "last_name" => "Brown", "age" => 22, "phone" => "555-3333"],
    ["first_name" => "Diana", "last_name" => "King", "age" => 29, "phone" => "555-4444"],
    ["first_name" => "Edward", "last_name" => "Stone", "age" => 40, "phone" => "555-5555"],
    ["first_name" => "Fiona", "last_name" => "Clark", "age" => 25, "phone" => "555-6666"],
    ["first_name" => "George", "last_name" => "Lee", "age" => 36, "phone" => "555-7777"],
    ["first_name" => "Hannah", "last_name" => "Adams", "age" => 30, "phone" => "555-8888"],
    ["first_name" => "Bill", "last_name" => "Miller", "age" => 19, "phone" => "555-9999"],
    ["first_name" => "Jasmine", "last_name" => "Nguyen", "age" => 45, "phone" => "555-0000"],
];

// Displays all customers
echo "<h2>All Customers</h2>";
foreach ($customers as $customer) {
    echo $customer['first_name'] . " " . $customer['last_name'] . ", Age: " . $customer['age'] . ", Phone: " . $customer['phone'] . "<br>";
}

// Finds and displays customers under 30
echo "<h2>Customers Under 30</h2>";
foreach ($customers as $customer) {
    if ($customer['age'] < 30) {
        echo $customer['first_name'] . " " . $customer['last_name'] . ", Age: " . $customer['age'] . ", Phone: " . $customer['phone'] . "<br>";
    }
}

// Finds and displays customers with last name "Smith"
$searchLastName = "Smith";
echo "<h2>Customers with Last Name: $searchLastName</h2>";
foreach ($customers as $customer) {
    if ($customer['last_name'] === $searchLastName) {
        echo $customer['first_name'] . " " . $customer['last_name'] . ", Age: " . $customer['age'] . ", Phone: " . $customer['phone'] . "<br>";
    }
}

// Finds and displays customers with phone number "555-0000"
$searchPhone = "555-0000";
echo "<h2>Customers with Phone Number: $searchPhone</h2>";
foreach ($customers as $customer) {
    if ($customer['phone'] === $searchPhone) {
        echo $customer['first_name'] . " " . $customer['last_name'] . ", Age: " . $customer['age'] . ", Phone: " . $customer['phone'] . "<br>";
    }
}
?>