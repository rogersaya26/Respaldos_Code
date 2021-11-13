
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
	
	//destructor 
	//se ejecuta al momento de eliminar 
	// al sujeto de memoria
	
	function __destruct (){
	echo "se elimina el objeto <br>";
	echo "de base :".$this->base."<br>";
	} 
	//close 
	//se ejecuta sobre el objeto clonado el
	//momento de realizar la clonacion
	function __clone() {
     $this->base*=2;	
	}
	function setBase($base) {
		if ($base > 0)
		$this->base = $base;
		else 
		throw new Exception ("Base < 0 ");
	}	
	function setAltura($altura) {
		if ($altura > 0)
		$this->altura = $altura;
		else	
		throw new Exception ("Altura < 0 ");
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
