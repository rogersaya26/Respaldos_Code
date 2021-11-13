<?php
session_start();//Recuperando la session
	if (!isset($_SESSION['nombre'])) {
		//No entro por el autenticar
		header ("location: inicio.php?error=1");
	}
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<body>
<h3>Bienvenid@ Sr(a):<?php echo $_SESSION['nombre']; ?>

</h3>
<table width="100%" border="1">
  <tr>
    <td width="21%"><strong>Menu Opciones</strong></td>
    <td width="79%">Bienvenida</td>
  </tr>
  <tr>
  
    <td height="146"><?php if ($_SESSION['perfil'] == 'admin') { ?>
    <p><a href="#">Crear usuario</a></p>
	<?php } ?>
      <p><a href="#">Listado de Usuario</a></p>
      
    <p><a href="#">Salir del Sistema</a></p></td>
    <td align="left" valign="top">A continuación seleccione la opción de su preferencia en el menu de opciones.</td>
  </tr>
</table>

</body>
</html>


