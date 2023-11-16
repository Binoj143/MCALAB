<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
$name = $_POST["name"];
$email = $_POST["email"];
$password = $_POST["password"];
$confirmPassword = $_POST["confirm_password"];
// Basic client-side validation
if ($password !== $confirmPassword) {
echo "Passwords do not match. Please try again.";
} else {
// Server-side validation (you can add more validation logic here)
if (strlen($password) < 6) {
echo "Password must be at least 6 characters long.";
} else {
// Registration logic (insert data into the database, etc.) can be added here
echo "Registration successful! Welcome, " . $name . "!";
}
}}
?>
