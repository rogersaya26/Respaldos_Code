<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>
<body>
<form id="form1" name="form1" method="post" action="procesar_registro.php">
  <table width="458" border="0">
    <tr>
      <td colspan="2" bgcolor="#FFFFFF"><strong> Registro de Usuario</strong></td>
    </tr>
    <tr>
      <td width="159" bgcolor="#FFFFFF"><p><strong>cedula</strong></p></td>
      <td width="289" bgcolor="#FFFFFF"><input name="cedula" type="text" id="cedula" size="20" maxlength="8" /></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>nombre</strong></td>
      <td bgcolor="#FFFFFF"><input name="nombre" type="text" id="nombre" size="35" maxlength="35" /></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>apellido</strong></td>
      <td bgcolor="#FFFFFF"><input name="apellido" type="text" id="apellido" size="35" maxlength="35" /></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>estado donde nacio</strong></td>
      <td bgcolor="#FFFFFF"><select name="estado" id="estado">
        <option value="0" selected="selected">seleccione...</option>
        <option value="1">aragua</option>
        <option value="2">carabobo</option>
        <option value="3">distritocapital</option>
        <option value="4">miranda</option>
        <option value="5">merida</option>
        <option value="6">trujillo</option>
        <option value="7">zulia</option>
      </select></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>direccion</strong></td>
      <td bgcolor="#FFFFFF"><textarea name="direccion" id="direccion" cols="35" rows="5"></textarea></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>fecha de nacimiento</strong></td>
      <td bgcolor="#FFFFFF"><select name="dia" id="dia">
      <?php
	  for ($i=1; $i<=31; $i ++)
	  echo "<option value='$i'>$i</option>";
	  ?>
       </select>
       <select name="mes" id="mes">
      <?php setLocale (LC_TIME,"esp");
	  for ($i=1; $i<=12; $i++) 
	  $t = mktime (0,0,0,$i,31);
	  $t = strftime ("%b",$t);
	   echo "<option value='$i'>$t</option>\n";
      ?>
      </select>
        <select name="anio" id="anio">
        </select>
      </td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>sexo</strong></td>
      <td bgcolor="#FFFFFF">masculino 
      <input type="radio" name="radio" id="masc" value="masc" /> 
      femenino 
      <input type="radio" name="radio" id="femenino" value="fem" /></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>pasatiempos</strong></td>
      <td bgcolor="#FFFFFF"><table width="100%" border="0">
        <tr>
          <td width="28%"><input name="h1" type="checkbox" id="h1" value="leer" />
            leer</td>
          <td width="30%"><input name="musica" type="checkbox" id="h2" value="musica" />
            musica</td>
          <td width="42%"><p>
                <input name="cantar" type="checkbox" id="h3" value="cantar" />
            cantar</p></td>
        </tr>
        <tr>
          <td><input name="cocinar" type="checkbox" id="h4" value="cocinar" />
            cocinar</td>
          <td><input name="h5" type="checkbox" id="h5" value="bailar" />
            bailar</td>
          <td><input name="h6" type="checkbox" id="h6" value="deportes" />
            deportes</td>
        </tr>
      </table></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>direccion de correo</strong></td>
      <td bgcolor="#FFFFFF"><input type="text" name="email" id="email" /></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>nombre de usuario</strong></td>
      <td bgcolor="#FFFFFF"><input name="login" type="text" id="login" size="20" maxlength="20" /></td>
    </tr>
    <tr>
      <td bgcolor="#FFFFFF"><strong>contraseña</strong></td>
      <td bgcolor="#FFFFFF"><input name="pass" type="password" id="pass" size="20" maxlength="20" /></td>
    </tr>
    <tr>
      <td colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="submit" name="enviar" id="enviar" value="enviar" />
&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" name="reset" id="reset" value="Reset" /></td>
    </tr>
  </table>
</form>
</body>
</html>