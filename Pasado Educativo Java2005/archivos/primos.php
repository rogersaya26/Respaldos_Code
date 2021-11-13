<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<body>
<?php
$numA = 100;
$numB = 200;
echo "Los numeros primos entre $numA y $numB son: <br>";
// recorre los numeros de A a B
for ($num=$numA; $num<=$numB; $num++) {
	$esprimo = true;
  for ($den=2; $den<=$num-1 AND $esprimo; $den++){
		if ($num % $den == 0)
			$esprimo=false;	
  }
  if ($esprimo)
  	echo "$num ,";
}










?>
</body>
</html>