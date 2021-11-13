<html>
  <head>
    <title>Envió de correo con un archivo adjunto</title>
  </head>
<body>
  <b><center>Envío de un correo con un archivo adjunto:</center></b>

  <form action="enviar.php" method="POST" enctype="multipart/form-data">
    <p>Para:   <input type="text" name="para" size="25"></p>
    <p>Asunto: <input type="text" name="asunto" size="25"></p>
    <p>Mensaje:<br>
    <textarea name="mensaje" cols="50" rows="5"></textarea></p>
    <p>Archivo adjunto: <input type="file" name="adjunto"></p>
    <p><input type="submit" name="Submit" value="Enviar"></p>
  </form>
</body></html>

