<?php
$usuario = 'admin';
$contr = '123456';
$detener = 0;
while ($detener==0) {
	if(!isset($_SERVER['PHP_AUTH_USER'])) {
		header ("www-Authenticate: Basic realm=\"Ingrese los datos para acceder al sistema\"");
		header ("http\1.0 401 Unauthorized");
		echo "Cancelado por el usuario \n";
		exit;
	} elseif (($_SERVER['PHP_AUTH_USER']==$usuario) && ($_SERVER['PHP_AUTH_PW'] == $contr)) {
	print ("entrada autorizada <br>");
	$detener=1;
	} else 
	unset ($_SERVER['PHP_AUTH_USER']);
}
?>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
</body>
</html>