<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<?php
$temp = $_FILES['archivo']['tmp_name'];
if(is_uploaded_file($temp)) {
	if($_FILES['archivo']['type']=="image/jpeg"){
	if($_FILES['archivo']['size']<=500000) {
		$udload="upload/".$_FILES['archivo']['name'];
		if(move_uploaded_file($temp, $upload))
		echo "el archivo ha sido subido con exito";
	else
	echo "error al mover el archivo de la carpeta temporal $temp.";
}else 
echo "el archivo tiene un tamaño de ".$_FILES['archivo']['type']." bytes";
}else
echo "el archivo de tipo ".$_FILES['archivo']['type']." no es permitido";
}else 
echo "el archivo no fue subido al servidor";
?>
</body>
</html>