
<?php 
require ("clases/Figura.class.php");
class Rectangulo extends Figura {
	//atrubutos
	private $base;
	private $altura;
	//constructor:
	//inicializa los atributos del objeto
	function __construct ($base,$altura) {
	$this->nombre = "Rectangulo"; 
	$this->setBase($base);
	$this->setAltura($altura);
	}
	function setBase($base) {
		if ($base > 0)
		$this->base = $base;
	}	
	function setAltura($altura) {
		if ($altura > 0)
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
