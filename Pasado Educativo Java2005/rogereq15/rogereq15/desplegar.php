<?php 
require("clases/template.class.php");
/*se crea un objeto para usar las plantillas identificando el directorio que las contiene */
$obj= new Template ("plantillas/");
//se indican cuales plantillas se van a usar 
$obj->set_filenames(array(
		'header'=>'encabezado.html',
		'body'=>'cuerpo.html',
		'footer'=>'pie.html'
		
		));
//SE SUSTITUYEN LAS ETIQUETAS
$obj->assign_var('titulo','Segunda plantilla');
date_default_timezone_set("America/Caracas");
$hora=date("h:i:s a");
$obj->assign_var('hora',$hora);
//se ejecutan las plantilla

	$obj->pparse('header');
	$obj->pparse('body');
	$obj->pparse('footer');
	
?>