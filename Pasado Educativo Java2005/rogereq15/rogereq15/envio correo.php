

<?php
	$para="instructor@ceneac.com";
	$asunto="prueba de correo html Roger";
	$mensaje="
	<html> 
		<head>
			<title>Mensaje de Prueba Roger</title>
		</head>
		<body>
		<h1> Mensaje en HTML Roger </h1>
		<p>
		<b>Este correo es enviado desde php</b>
		</p>
		</body>
	</html>
	";
$encabezados="MIME-Version: 1.0\r\n";
$encabezados.="content-type: text/html; charset=iso-8859-1\r\n";

mail($para,$asunto,$mensaje,$encabezados);

?>				
