<?php
//Captura los datos del formulario
$login = $_POST['login'];
$password = $_POST['password'];
//Realizar la conexion y consulta a la BD 
//Sí esta autorizado
	if ($login == 'admin' && $password == '123') {
		session_start(); //Crea la sesion
		$_SESSION['nombre'] = "Administrador";
		$_SESSION['perfil'] = "user";
		header ("location:  bienvenida.php");
	} else {
		//NO esta autorizado
		
		header ("location: inicio.php?error=1");
	}
?>