<?php 
class Conexion {
	// atributos
	private $servidor;
	private $usuario;
	private $clave;
	private $bd;
	private $id; // identificador de la conexión
	
	public function __construct () {
		require ("config.php");
		$this->servidor = SERVIDOR;
		$this->usuario = USUARIO;
		$this->clave = CONTRASENA;
		$this->bd = BD;
		$this->id = $this->abrirConexion();
		$this->seleccionarBD();
	}
	
	public function __destruct () {
		$this->cerrar();	
	}
	
	private function abrirConexion () {
		$idc = mysql_connect ($this->servidor,
						$this->usuario,
						$this->clave);
		if (!$idc) // no abrió la conexión
			throw new Exception 
			("error en la conexión");
						
		return $idc;
	}
	
	private function seleccionarBD () {
		$res = mysql_select_db ($this->bd,
								$this->id);	
		if (!$res) { // no seleccionó la BD
		 $this->cerrar(); // se cierra la conexión
		  throw new Exception 
		  ("error en la selección de la BD");
		}
	}
	
	public function ejecutar ($sql) {
		$res = mysql_query ($sql,$this->id);
		return $res;	
	}
	
	public function getRegistro ($res) {
		return mysql_fetch_array($res);
	}
	
	public function totalRegistros ($res) {
		return mysql_num_rows ($res);	
	}
	
	private function cerrar () {
		mysql_close ($this->id);	
	}
	
	
}
?>