<?php
$db = new mysqli("localhost", "root", "", "db");
if ($db->connect_error) {
    die("Connection failed: " . $db->connect_error);
}
$result = $db->query("SELECT * FROM users");
while ($row = $result->fetch_assoc()) {
    echo "Name: " . $row['NAME'] . "<br>";
}
$db->close();
?>

