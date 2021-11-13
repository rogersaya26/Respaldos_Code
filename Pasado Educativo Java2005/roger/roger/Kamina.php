<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
	
	<?php
	$nombre ="Eva";
	if ($nombre =="")
		echo "tu no tienes nombre";
		elseif (($nombre == "eva") OR ($nombre =="Eva"))
		echo "Tu nombre es EVA<br>";
		else 
		echo"tu nombre es ".$nombre;

$dia ="miercoles";
switch($dia){

	case "lunes":
		echo "hoy es lunes<br>";
		break;
	case "martes":
		echo "hoy es martes<br>";
		break;
	case "miercoles":
		echo "hoy es miercoles<br>";
		break;
case "jueves":
echo "hoy es jueves<br>";
break;
case "viernes":
echo "hoy es viernes<br>";

default:
	echo "la cadena no corresponde con un dia entre lunes y viernes.";
}

$num=1;
while ($num <=5){
	echo $num."<br>";
	
	$num++;
}
	$num=1;
while ($num<5){
	echo $num."<br>";
	if($num == 3){
		echo "aqui nos salimos<br>";
		break;
	}
	$num++;

}

	
?>
	</body>
</html>