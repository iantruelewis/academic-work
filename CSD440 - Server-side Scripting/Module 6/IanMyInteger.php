<?php
// IanMyInteger.php

class IanMyInteger {
    private $value;

    // Constructor sets integer value
    public function __construct($value) {
        $this->value = $value;
    }

    // Getter method
    public function getValue() {
        return $this->value;
    }

    // Setter method
    public function setValue($value) {
        $this->value = $value;
    }

    // Static method to check if number is even
    public static function isEven($num) {
        return ($num % 2 == 0);
    }

    // Static method to check if number is odd
    public static function isOdd($num) {
        return ($num % 2 != 0);
    }

    // Method to check if stored value is prime
    public function isPrime() {
        $n = $this->value;

        if ($n <= 1) {
            return false;
        }

        // Check divisibility from 2 to n-1
        for ($i = 2; $i < $n; $i++) {
            if ($n % $i == 0) {
                return false;
            }
        }

        return true;
    }
}

// Createss two instances
$num1 = new IanMyInteger(17);
$num2 = new IanMyInteger(24);

// Test methods for num1
echo "Testing num1 (value = " . $num1->getValue() . "):<br>";
echo "Is even? " . (IanMyInteger::isEven($num1->getValue()) ? "Yes" : "No") . "<br>";
echo "Is odd? " . (IanMyInteger::isOdd($num1->getValue()) ? "Yes" : "No") . "<br>";
echo "Is prime? " . ($num1->isPrime() ? "Yes" : "No") . "<br><br>";

// Test methods for num2
echo "Testing num2 (value = " . $num2->getValue() . "):<br>";
echo "Is even? " . (IanMyInteger::isEven($num2->getValue()) ? "Yes" : "No") . "<br>";
echo "Is odd? " . (IanMyInteger::isOdd($num2->getValue()) ? "Yes" : "No") . "<br>";
echo "Is prime? " . ($num2->isPrime() ? "Yes" : "No") . "<br><br>";

// Changes value of num2 and test prime again
$num2->setValue(19);
echo "After setting num2 value to 19:<br>";
echo "Is prime? " . ($num2->isPrime() ? "Yes" : "No") . "<br>";
?>