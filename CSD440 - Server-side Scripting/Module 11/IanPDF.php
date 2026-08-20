<?php
// IanPDF.php
// Generates a PDF listing all death metal albums with description and data table

require('fpdf.php');

// Connects to database
$mysqli = new mysqli("localhost", "student1", "pass", "baseball_01");

if ($mysqli->connect_error) {
    die("Connection failed: " . $mysqli->connect_error);
}

// Fetches albums
$result = $mysqli->query("SELECT * FROM death_metal_albums");

$albums = [];
if ($result->num_rows > 0) {
    while ($row = $result->fetch_assoc()) {
        $albums[] = $row;
    }
}

$mysqli->close();

// Creates PDF
$pdf = new FPDF();
$pdf->AddPage();
$pdf->SetFont('Arial', 'B', 16);

// Title
$pdf->Cell(0, 10, 'Death Metal Albums Collection', 0, 1, 'C');
$pdf->Ln(5);

// General info text
$pdf->SetFont('Arial', '', 12);
$pdf->MultiCell(0, 8, "This document contains a curated list of influential death metal albums. It includes album titles, band names, release years, genres, and personal ratings. Death metal is an extreme subgenre of heavy metal known for its aggressive sound, complex riffs, and powerful themes.");
$pdf->Ln(5);

// Table header
$pdf->SetFont('Arial', 'B', 12);
$pdf->Cell(10, 8, 'ID', 1);
$pdf->Cell(50, 8, 'Album Title', 1);
$pdf->Cell(40, 8, 'Band Name', 1);
$pdf->Cell(20, 8, 'Year', 1);
$pdf->Cell(40, 8, 'Genre', 1);
$pdf->Cell(20, 8, 'Rating', 1);
$pdf->Ln();

// Table body
$pdf->SetFont('Arial', '', 12);
foreach ($albums as $album) {
    $pdf->Cell(10, 8, $album['id'], 1);
    $pdf->Cell(50, 8, $album['album_title'], 1);
    $pdf->Cell(40, 8, $album['band_name'], 1);
    $pdf->Cell(20, 8, $album['release_year'], 1);
    $pdf->Cell(40, 8, $album['genre'], 1);
    $pdf->Cell(20, 8, $album['rating'], 1);
    $pdf->Ln();
}

// Footer row
$pdf->SetFont('Arial', 'I', 10);
$pdf->Cell(0, 10, 'End of Death Metal Albums Table', 1, 1, 'C');

// Outputs PDF to browser
$pdf->Output('I', 'DeathMetalAlbums.pdf');
?>
