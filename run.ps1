param(
    [string]$Class = "AirlineSystem.FlightInfo"
)

$ErrorActionPreference = "Stop"

$ProjectRoot = Split-Path -Parent $MyInvocation.MyCommand.Path
$BinDir = Join-Path $ProjectRoot "bin"
$SrcDir = Join-Path $ProjectRoot "src"
$RsXmlJar = "d:\J2EE\Lib\rs2xml.jar"
$MysqlJar = "d:\J2EE\Lib\mysql-connector-j-8.0.33.jar"

# Build classpath, only including jars that exist
$Classpath = @()
if (Test-Path $RsXmlJar) { $Classpath += $RsXmlJar }
if (Test-Path $MysqlJar) { $Classpath += $MysqlJar }
$Classpath += $BinDir
$ClasspathStr = $Classpath -join ";"

# Check if bin directory exists
if (-not (Test-Path $BinDir)) {
    Write-Host "Compiling project..."
    javac -cp "$ClasspathStr;." -d $BinDir "$SrcDir\AirlineSystem\*.java"
}

# Run the specified class
Write-Host "Running $Class..."
Write-Host "Classpath: $ClasspathStr"
java --add-modules ALL-SYSTEM -cp "$ClasspathStr" $Class
