<?php
$archivo="logo.gif";
$apunt=fopen($archivo,"rb");
$data=fread($apunt,filesize($archivo));
fclose($apunt);
$mensaje=chunk_split(base64_encode($data));
$para="instructor@ceneac.com";
$asunto="Enviando una foto como archivo adjunto ROGER";
$encabezado="Content-disposition: attachment; filename=$archivo\n";
$encabezado.="Content-type: image/gif\n";
$encabezado.="Content-Transfer-Encoding: base64\n";
if(!$enviado=mail($para,$asunto,$mensaje,$encabezado)){
	echo "error al tratar de enviar el correo\n";
}else{
	echo "correo enviado con exito\n";
	}
?>