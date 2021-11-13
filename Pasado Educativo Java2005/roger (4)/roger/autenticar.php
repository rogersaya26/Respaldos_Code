<?php
//Captura los datos del formulario
$login = $_POST['login'];
$password = $_POST['password'];
//Realizar la conexion y consulta a la BD 
	require ("clases/DAOUsuario.class.php");
	try {
		$dao = new DAOUsuario();
		$usuario = $dao->validar ($login,$password);
//Sí esta autorizado

	if ($usuario) {
		session_start(); //Crea la sesion
		$_SESSION['nombre'] = $usuario['nombre'];
		$_SESSION['perfil'] = $usuario['perfil'];
		header ("location:  bienvenida.php");
	} else {
		//NO esta autorizado
		
		header ("location: inicio.php?error=1");
	}
	} catch (Exception $e) {
		header ("location: inicio.php?error=2"); 
	 }
?>