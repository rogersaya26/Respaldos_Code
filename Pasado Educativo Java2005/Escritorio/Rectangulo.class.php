
<?php 
class Rectangulo {
	//atrubutos
	var $base;
	var $altura;
	//constructor:
	//inicializa los atributos del objeto
	function __construct ($base,$altura) { 
	$this->base = $base;
	$this->altura = $altura;
	}
	//metodos
	function area () {
	$res = $this->base * $this->altura;
	return $res;
	}
	function perimetro () {
		$res = ($this->base + $this->altura) * 2;
		return $res;
	}
}
?>
