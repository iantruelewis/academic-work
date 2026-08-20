$fruits = ["apple", "banana", "cherry"];

// in_array
if (in_array("banana", $fruits)) {
    echo "Banana is in the list.\n";
}

// array_search
$key = array_search("cherry", $fruits);
if ($key !== false) {
    echo "Cherry is at index $key.\n";
}
