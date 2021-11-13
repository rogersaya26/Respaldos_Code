<?php 
require ("clases/Conexion.class.php");
// Contiene las operaciones a ejecutar 
// de la tabla usuario
class DAOUsuario {
	// atributo
	private $conex; // objeto de Conexión
	
	public function __construct() {
		$this->conex = new Conexion();	
	}
	
	public function validar ($login, $pass) {
		$pass = md5($pass); // se encripta
		$sql = "SELECT * FROM usuario WHERE login='$login' AND password='$pass'";
		$res = $this->conex->ejecutar($sql);
		// se obtiene el registro
		$reg = $this->conex->getRegistro($res);
		return $reg;
	}
	
}
?>