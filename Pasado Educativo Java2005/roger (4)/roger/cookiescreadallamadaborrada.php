<?php
date_default_timezone_set("America/Caracas");
if (isset($_COOKIE['Visita'])) {
	
	echo "su ultima visita fue: ".$_COOKIE['Visita'];
	echo " regresa en 30 segundos";
}else {
	setcookie('Visita',date("d/m/y h:i:s a"), time()+30);
	
	echo "Bienvenido, Esta es tu primera visita!";
}
?>
