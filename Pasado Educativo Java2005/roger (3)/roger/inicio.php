<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="autenticar.php">
  <table width="90%" border="1">
   </tr>
    
    <td colspan="2">Introdusca el Nombre de Usuario y Contraseña para accesar al sistema</td>
    <tr>
    <tr>
      <td width="28%">Nombre de Usuario:</td>
      <td width="72%"><input type="text" name="login" id="login" /></td>
    </tr>
    <tr>
      <td>Contraseña:</td>
      <td><label for="password"></label>
      <input type="text" name="password" id="password" /></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="entrar" id="entrar" value="Entrar" /></td>
    </tr>
    <?php 
		if (isset($_GET['error'])) {
	?>
    <td colspan="2"><?php 
	  if ($_GET['error'] == 1)
	  	echo "Usuario no Autorizado.";
	  ?>
     </td>
    <?php    }  ?>
  </table>
  <label for="login"></label>
</form>
</body>
</html>