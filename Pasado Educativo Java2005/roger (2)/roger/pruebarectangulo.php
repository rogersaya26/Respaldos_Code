<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<body>
<?php 
//incluir la definicion de la clase
require ("clases/Rectangulo.class.php");
//se crea el objeto
$rec1 = new Rectangulo (5,8);
//se invocan los metodos
$area =$rec1->area();
echo "el area de rec1 es: $area <br>";
$per = $rec1->perimetro();
 echo "el perimetro de rec1 es: $per <br>";
 //se modifican las propiedades del objeto
 try { 
 	$rec1->setBase(-23);
	echo " se cambia la base <br>";
	$area = $rec1->area();
	echo "el area de rec1 es $area <br>";
 }catch (Exception $ex){
	echo "error ... ".$ex->getMessage()."<br>";
 
 //se obtiene el nombre del objeto
 $nombre = $rec1->getNombre();
 echo "el nombre de rec1 es $nombre <br>";
 
 //se clona a rec1
 $rec2 = clone ($rec1);

//se elimina a rec1
unset($rec1);
 $area = $rec2->area();
 echo "el area de rec2 es: $area <br>";
 }catch (Exception $ex){
	echo "error No se logro crear... ".$ex->getMessage()."<br>";
 }
 
?>
</body>
</html>