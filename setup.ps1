# Setup script: Download or configure MySQL JDBC driver

Write-Host "Airline Management System - Setup Helper"
Write-Host "========================================="
Write-Host ""

$LibDir = "d:\J2EE\Lib"
$MysqlJar = Join-Path $LibDir "mysql-connector-java-8.0.33.jar"

if (Test-Path $MysqlJar) {
    Write-Host "✓ MySQL JDBC driver found at: $MysqlJar"
} else {
    Write-Host "✗ MySQL JDBC driver NOT found at: $MysqlJar"
    Write-Host ""
    Write-Host "To fix this:"
    Write-Host "  1. Download mysql-connector-java-8.0.33.jar from:"
    Write-Host "     https://dev.mysql.com/downloads/connector/j/"
    Write-Host "  2. Extract and place mysql-connector-java-8.0.33.jar in:"
    Write-Host "     $LibDir"
    Write-Host ""
    Write-Host "Without the MySQL driver, database operations (Login, AddCustomer) will fail."
    Write-Host "FlightInfo will also fail if it tries to query the database."
}

Write-Host ""
Write-Host "Note: rs2xml.jar should be at: d:\J2EE\Lib\rs2xml.jar"
Write-Host ""
