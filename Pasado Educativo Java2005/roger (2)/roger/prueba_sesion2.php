<?php
session_start();
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<body>
<?php
$var_sesion = $_SESSION['variable_sesion'];
$var_form = $_POST['variable_formulario'];
echo "valor almacenado en la sesion = $var_sesion<br> /n";
echo "valor proveniente del formulario = $var_form<br> /n";
$_SESSION['variable_form'] = $_POST['variable_formulario'];
print_r($_SESSION);
?>
</body>
</html>