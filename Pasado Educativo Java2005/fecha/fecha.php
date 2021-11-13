<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<?php
// se establece la zona horaria
date_default_timezone_set("America/Caracas");
$hoy = time(); // seg. desde 01/01/70 hasta hoy
echo "timestamp de hoy: $hoy <br>";
$fecha = date ("l d-F-Y h:i:s a",$hoy);
echo "la fecha de hoy es: $fecha <br>";

setLocale (LC_TIME,"esp"); // se establece el idioma
$fecha = strftime ("%A %d-%B-%Y %H:%M:%S",$hoy);
$fecha = utf8_encode ($fecha);
echo "la fecha de hoy es: $fecha <br>";

$fecha_bd = "1991-6-16";
$arreglo = explode ("-",$fecha_bd); // 1991 | 6 | 16
$cumple= mktime(0,0,0,$arreglo[1],$arreglo[2],$arreglo[0]);
$fecha = strftime ("%A %d-%B-%Y",$cumple);
$fecha = utf8_encode ($fecha);
echo "la fecha de cumple es: $fecha <br>";

?>
</body>
</html>