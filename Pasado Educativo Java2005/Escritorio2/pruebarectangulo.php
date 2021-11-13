<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<body>
<?php 
//incluir la definicion de la clase
require ("clases/rectangulo.class.php");
//se crea el objeto
$rec1 = new Rectangulo (5,8);
//se invocan los metodos
$area =$rec1->area();
echo "el area de rec1 es: $area <br>";
$per = $rec1->perimetro();
 echo "el perimetro de rec1 es: $per <br>";
 //se crea el objeto
$rec1 = new Rectangulo (3,5);
//se invocan los metodos
$area =$rec1->area();
echo "el area de rec1 es: $area <br>";
$per = $rec1->perimetro();
 echo "el perimetro de rec1 es: $per <br>";
?>
</body>
</html>