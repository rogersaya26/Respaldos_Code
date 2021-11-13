<?php
  $para    = $_POST['para'];
  $asunto  = $_POST['asunto'];
  $data = file_get_contents($_FILES['adjunto']['tmp_name']);
  //aplicamos el formato RFC 2045
  $data = chunk_split(base64_encode($data));
  //inicializamos el borde multiparte
  $borde_mime = "BORDE_MULTIPARTE_123";
  //definición del \r\n
  $ent = chr(13).chr(10); // $ent="\r\n";
  //se indica el tipo multiparte y se le indica el nombre del borde
  $encabezados = "Content-type: multipart/mixed; boundary=".$borde_mime;
  //se crea el cuerpo del mensaje
  $mensaje  = "--$borde_mime".$ent ; 
  $mensaje .= "Content-type: text/html; charset=".chr(34);
  $mensaje .= "iso-8859-1".chr(34).";".$ent.$ent;
  $mensaje .= $_POST['mensaje'].$ent.$ent;
  //se inserta un nuevo borde, la información del archivo y la data
  $mensaje .= "--$borde_mime".$ent;
  $mensaje .= "Content-type: ".$_FILES['adjunto']['type'].$ent;
  $mensaje .= "Content-Transfer-Encoding: base64 ".$ent;
  $mensaje .= "Content-Disposition: attachment; ";
  $mensaje .= "filename=".chr(34).$_FILES['adjunto']['name'];
  $mensaje .= chr(34).";".$ent.$ent;
  $mensaje .= "$data".$ent;
  //se incluye el fin de los contenedores
  $mensaje .= "--$borde_mime--".$ent;
if(!$enviado = mail($para,$asunto,$mensaje,$encabezados)){
   echo "Error al tartar de enviar el Correo\n";
}else{
   echo "Correo enviado con éxito\n";
}

?>
