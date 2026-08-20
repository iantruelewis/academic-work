<?php
// IanPalindrome.php

function isPalindrome($str) {
    // Converts to lowercase
    $str = strtolower($str);

    // Removes spaces and punctuation
    $clean = "";
    for ($i = 0; $i < strlen($str); $i++) {
        $char = $str[$i];
        // Keeps only letters and numbers
        if (($char >= 'a' && $char <= 'z') || ($char >= '0' && $char <= '9')) {
            $clean .= $char;
        }
    }

    // Reverses cleaned string
    $reversed = "";
    for ($i = strlen($clean) - 1; $i >= 0; $i--) {
        $reversed .= $clean[$i];
    }

    // Checks if cleaned string equals reversed string
    if ($clean == $reversed) {
        return true;
    } else {
        return false;
    }
}

// Test strings - 3 palindromes and 3 not
$testStrings = [
    "Racecar",
    "A man a plan a canal Panama",
    "Madam",
    "Hello World",
    "Example",
    "Test String"
];

foreach ($testStrings as $string) {
    echo "Original: $string\n";
    // Reverses display
    $reverseDisplay = strrev($string);
    echo "Reversed: $reverseDisplay\n";

    if (isPalindrome($string)) {
        echo "Result: Palindrome\n";
    } else {
        echo "Result: Not a palindrome\n";
    }
    echo "------------------------\n";
}
?>