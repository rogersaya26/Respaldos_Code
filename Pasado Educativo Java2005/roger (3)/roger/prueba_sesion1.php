<?php
session_start();
$_SESSION['variable_sesion'] = "prueba1";
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Probando las sesiones - pagina 1</title>
</head>
<body>
<p> Esta es una prueba de sesiones.
<form action="prueba_sesion2.php" method="POST">
<input type="text" name= "variable_formulario" value="prueba2">
<input type="submit" value="Ir a la siguiente pagina">
</form>
<p>
</body>
</html>