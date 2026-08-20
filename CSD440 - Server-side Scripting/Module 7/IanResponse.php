<?php
// Get data safely
$name = trim($_POST["name"] ?? '');
$age = trim($_POST["age"] ?? '');
$email = trim($_POST["email"] ?? '');
$dob = trim($_POST["dob"] ?? '');
$gender = $_POST["gender"] ?? '';
$hobbies = $_POST["hobbies"] ?? [];
$bio = trim($_POST["bio"] ?? '');

// Initialize error messages
$errors = [];

if (empty($name)) $errors[] = "Name is required.";
if (empty($age) || !is_numeric($age)) $errors[] = "A valid age is required.";
if (empty($email) || !filter_var($email, FILTER_VALIDATE_EMAIL)) $errors[] = "A valid email is required.";
if (empty($dob)) $errors[] = "Date of birth is required.";
if (empty($gender)) $errors[] = "Gender is required.";
if (empty($hobbies)) $errors[] = "At least one hobby must be selected.";
if (empty($bio)) $errors[] = "Bio is required.";

?>

<!DOCTYPE html>
<html>
<head>
  <title>Ian's Response</title>
</head>
<body>
<?php if (!empty($errors)): ?>
  <h2>Form Submission Error</h2>
  <ul>
    <?php foreach ($errors as $error): ?>
      <li><?= htmlspecialchars($error) ?></li>
    <?php endforeach; ?>
  </ul>
  <a href="IanForm.php">Go Back</a>
<?php else: ?>
  <h2>Thank You for Submitting, <?= htmlspecialchars($name) ?>!</h2>
  <p><strong>Age:</strong> <?= htmlspecialchars($age) ?></p>
  <p><strong>Email:</strong> <?= htmlspecialchars($email) ?></p>
  <p><strong>Date of Birth:</strong> <?= htmlspecialchars($dob) ?></p>
  <p><strong>Gender:</strong> <?= htmlspecialchars($gender) ?></p>
  <p><strong>Hobbies:</strong> <?= implode(", ", array_map('htmlspecialchars', $hobbies)) ?></p>
  <p><strong>Bio:</strong><br><?= nl2br(htmlspecialchars($bio)) ?></p>
  <a href="IanForm.php">Submit Another Response</a>
<?php endif; ?>
</body>
</html>
