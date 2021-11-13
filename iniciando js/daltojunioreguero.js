






/*let tp = "100 minutos hacer trabajos prácticos";
let estudio = "100 minutos de estudio";
let trabajo = "240 minutos de trabajo";
let homework = "30 minutos de cosas de la casa";
let descanso = "10 minutos de descanso";



console.log("TAREAS");

for (var i = 0; i < 14; i++) {
	if (i == 0) {
		console.group("semana 1")
	}
console.groupCollapsed("dia " + (i+1));
console.log(trabajo);
console.log(descanso);
console.log(estudio);
console.log(tp);
console.log(homework);
console.groupEnd();
if (i == 7) {
	console.groupEnd();
	console.groupCollapsed("semana 2")
}
}

console.groupEnd();
console.groupEnd();

------------------------------------*/





  /*const materias = {
	fisica: [90,6,3,"fisica"],
	matematica: [84,8,2,"matematica"],
	logica: [92,8,4,"logica"],
	quimica: [96,8,4,"quimica"],
	calculo: [91,6,3,"calculo"],
	programacion: [79,7,4,"programacion"],
	biologia: [75,9,2,"biologia"],
	bbdd: [98,9,1,"bbdd"],
	algebra: [100,10,4,"algebra"]
}

const aprobo = ()=>{
	for (materia in materias){

		let asistencias = materias[materia][0];
		let promedio = materias[materia][1];
		let trabajos = materias[materia][2]

		console.log(materias[materia][3]);

		if (asistencias >= 90) {
			console.log("%c   Asistencias en orden","color:green");
		} else {
			console.log("%c   Falta de Asistencias","color:red");
		}

		if (promedio >= 7) {
			console.log("%c   Promedio en orden","color:green");
		} else {
			console.log("%c   Promedio desaprobado","color:red");
		}

		if (trabajos >= 3) {
			console.log("%c   Trabajos prácticos en Orden","color:green");
		} else {
			console.log("%c   Faltan trabajos prácticos","color:red");
		}
	}
}

aprobo()

-------------------------------------*/






/*let materias ={
		fisica: ["perez","pedro","pepito","cofla","maria"],
		programacion: ["dalto","pedro","juan","pepito"],
		logica: ["hernandez","pedro","juan","pepito","cofla","maria"],
		quimica: ["rodriguez","pedro","juan","pepito","cofla","maria"]
	}

const inscribir = (alumno,materia)=> {
		personas = materias[materia];
		
		if(personas.length>=21){
			document.write(`lo siento <b>${alumno}</b>, las clases de <b>${materia}</b> ya estan llenas`);
		} else {
			personas.push(alumno);
			if (materia == "fisica"){
					materias ={
						fisica: personas,
						programacion: materias['programacion'],
						logica: materias['logica'],
						quimica: materias['quimica']						

			}
		}
		 else if (materia == "programacion") {
					materias = {
						fisica: ['fisica'],
						programacion: personas,
						logica: materias['logica'],
						quimica: materias['quimica']						
					
			}
		}else if (materia == "logica"){
					materias  = {
						fisica: ['fisica'],
						programacion: materias['programacion'],
						logica: personas,
						quimica: materias['quimica']						
					}
			}
		else if (materia == "quimica"){
					materias = {
						fisica: ['fisica'],
						programacion: materias['programacion'],
						logica: materias['logica'],
						quimica: personas						
					}
			}
				document.write(`felicidades ${alumno} te haz inscrito a ${materia}`);
		}

	}
				
	
document.write(materias['fisica'] + "<br>")
	

inscribir("pedrito","fisica");

document.write("<br>" + materias['fisica'])


-----------------------------*/






/*const obtenerInformacion = (materia)=>{
	materias ={
		fisica: ["perez","pedro","pepito","cofla","maria"],
		programacion: ["dalto","pedro","juan","pepito"],
		logica: ["hernandez","pedro","juan","pepito","cofla","maria"],
		quimica: ["rodriguez","pedro","juan","pepito","cofla","maria"]
	}
	if (materias[materia] !== undefined) {
		return [materias[materia],materia,materias];
	}else {
		return materias;
	}
}

const mostrarInformacion = (materia)=> {
let informacion = obtenerInformacion(materia);

if (informacion !== false) {
	let profesor = informacion[0][0];
	alumnos = informacion[0];
	alumnos.shift();
	document.write(`el profesor de <b>${informacion[1]}</b> es: <b style="color:red">${profesor}</b><br>
		los alumnos son: <b style="color:blue">${alumnos}</b><br><br> `);
}
}

const cantidadDeClases = (alumno)=> {
	let informacion = obtenerInformacion()
	let clasesPresentes = [];
	let cantidadTotal = 0;
	for(info in informacion) {
		if(informacion[info].includes(alumno)) {
			cantidadTotal++;
			clasesPresentes.push(" " + info);
		}
	}
	return `<b style='color:blue'>${alumno}</b> esta en <b>${cantidadTotal} clases</b><br>
	esta cursando las clases: <b style='color:green'>${clasesPresentes}</b> <br><br>
	`;

}


mostrarInformacion("fisica");
mostrarInformacion("quimica");
mostrarInformacion("logica");
mostrarInformacion("programacion");


document.write(cantidadDeClases("cofla"))
document.write(cantidadDeClases("pedro"))

-------------------------*/





/*class Calculadora {
	constructor(){
	}
sumar(num1,num2) {
	return parseInt(num1) + parseInt(num2);
}
restar(num1,num2) {
	return parseInt(num1) - parseInt(num2);
}
dividir(num1,num2) {
	return parseInt(num1) / parseInt(num2);
}

multiplicar(num1,num2) {
	return parseInt(num1) * parseInt(num2);
}
potenciar(num,exp) {
	let numero = num;
	for (var i = 1; i < exp; i++) {
		numero=numero * num;
	}
	return numero;
}
raizCuadrada(num) {
	return Math.sqrt(num);
}
raizCubica(num) {
	return Math.cbrt(num);
}
}

const calculadora = new Calculadora();

alert("¿Que operación deseas realizar?");
let operacion = prompt("1: suma, 2: resta, 3: división, 4: multiplicación, 5: potenciación, 6: raiz cuadrada, 7: raiz cúbica");

if (operacion == 1) {
	let numero1 = prompt("Primer número para sumar");
	let numero2 = prompt("Segundo número para sumar");
	resultado = calculadora.sumar(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}


else if (operacion == 2) {
	let numero1 = prompt("Primer número para restar");
	let numero2 = prompt("Segundo número para restar");
	resultado = calculadora.restar(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}

else if (operacion == 3) {
	let numero1 = prompt("Primer número para dividir");
	let numero2 = prompt("Segundo número para dividir");
	resultado = calculadora.dividir(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}

else if (operacion == 4) {
	let numero1 = prompt("Primer número para multiplicar");
	let numero2 = prompt("Segundo número para multiplicar");
	resultado = calculadora.multiplicar(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}
else if (operacion == 5){
	let numero1 = prompt("numero a potenciar");
	let numero2 = prompt("exponente");
	resultado = calculadora.potenciar(numero1,numero2)
	alert(`tu resultado es ${resultado}`);
}
else if (operacion == 6){
	let numero1 = prompt("raiz cuadrada de: ");
	resultado = calculadora.raizCuadrada(numero1)
	alert(`tu resultado es ${resultado}`);
}
else if (operacion == 7){
	let numero1 = prompt("raiz cúbica de: ");
	resultado = calculadora.raizCubica(numero1)
	alert(`tu resultado es ${resultado}`);
}


else {
	alert("no se ha encontrado la operación");
}
---------------------------------------*/




/*class App {
	constructor(descargas,puntuacion,peso){
		this.descargas=descargas;
		this.puntuacion=puntuacion;
		this.peso=peso;
		this.iniciada=false;
		this.instalada=false;
	}
	instalar(){
		if (this.instalada == false) {
			this.instalada = true;
			alert("app instalada correctamente")
		}
	}
	desinstalar(){
		if (this.instalada == true){
			this.instalada = false;
			alert("app desinstalada correctamente");
		}
	}
	abrir(){
		if (this.iniciada == false && this.instalada == true){
			this.iniciada = true;
			alert("app iniciada")
		}
	}
	cerrar(){
		if(this.iniciada==true && this.instalada == true){
			this.iniciada=false;
			alert("app cerrada");
		}
	}
	appInfo(){
		return `
			Descargas: <b>${this.descargas}</b></br>
			puntuacion: <b>${this.puntuacion}</b></br>
			peso: <b>${this.peso}</b></br>
			`
	}

}

app1 = new App("16000","5 estrellas","900mb");
app2 = new App("6000","5 estrellas","900mb");
app3 = new App("6000","5 estrellas","900mb");
app4 = new App("1000","5 estrellas","900mb");
app5 = new App("18000","5 estrellas","900mb");
app6 = new App("7000","5 estrellas","900mb");
app7 = new App("900","5 estrellas","900mb");



app.instalar();
//app.desinstalar();
app.abrir();
app.cerrar();

document.write(`
	${app1.appInfo()} <br>
	${app2.appInfo()} <br>
	${app3.appInfo()} <br>
	${app4.appInfo()} <br>
	${app5.appInfo()} <br>
	${app6.appInfo()} <br>
	${app7.appInfo()} <br>
	`);



---------------------------*/


/*class Celular {
	constructor(color,peso,tamaño,rdc,ram){
		this.color=color;
		this.peso=peso;
		this.tamaño=tamaño;
		this.resolucionDeCamara=rdc;
		this.memoriaRam=ram;
		this.encendido=false;
	}
	presionarBotonEncendido(){
		if (this.encendido == false) {
			alert("celular prendido");
			this.encendido=true;
		}else {
			alert("celular apagado");
			this.encendido=false;
		}
	}
	reiniciar(){
		if (this.encendido==true){
			alert("reiniciando celular");
		}else{
			alert("el celular esta apagado")
		}
	}
	tomarFoto(){
		alert(`foto tomada en una resolucion de: ${this.resolucionDeCamara}`);
	}
	grabarVideo(){
		alert(`grabando video en ${this.resolucionDeCamara}`);
	}
	mobileInfo(){
		return `
		color: <b>${this.color}</b><br>
		peso: : <b>${this.peso}</b><br>
		tamaño: : <b>${this.tamaño}</b><br>
		resolucion de video: : <b>${this.resolucionDeCamara}</b><br>
		memoria Ram: <b>${this.memoriaRam}</b><br>
		`;
	}
}


class CelularAltaGama extends Celular{
	constructor(color,peso,tamaño,rdc,ram,rdce){
		super(color,peso,tamaño,rdc,ram);
		this.resolucionDeCamaraExtra = rdce;
	}

	grabarVideoLento(){
		alert("estas grabando en camara lenta")
	}
	reconocimientoFacial(){
		alert("Vamos a iniciar reconocimiento facial")
	}
	infoAltaGama(){
		return this.mobileInfo() + `resolucion de camara extra: ${this.resolucionDeCamaraExtra}`;
	}
}

//celular1 = new Celular("rojo","150g","5'","hd","1gb");
//celular2 = new Celular("negro","155g","5.4'","full hd","2gb");
//celular3 = new Celular("blanco","146g","5.9","full hd","2gb");

celular1 = new CelularAltaGama("rojo","130g","5.2","4k","3gb","fullhd");
celular2 = new CelularAltaGama("negro","142g","6","4k","4gb","hd");
//document.write(`
//	${celular1.mobileInfo()} <br>
//	${celular2.mobileInfo()} <br>
//	${celular3.mobileInfo()} <br>
//	`)

document.write(`
	${celular1.infoAltaGama()} <br><br>
	${celular2.infoAltaGama()} <br>
	`)
-----------------------------------------------------------------*/




/*class Animal {
	constructor(especie,edad,color){
		this.especie= especie;
		this.edad=edad;
		this.color=color;
		this.info = `Soy ${this.especie}, tengo ${this.edad} años y soy de color ${this.color}`;
	}
	verInfo() {
		document.write(this.info + "<br>");
	}
}

class Perro extends Animal{
	constructor(especie,edad,color,raza){
		super(especie,edad,color);
		this.raza = null;
	}
	set setRaza(newName){
		this.raza = newName;
	}

	get getRaza(){
		return this.raza;
	}
}


let perro = new Perro("perro",5,"marron","doberman");
let gato = new Animal("gato", 2 , "negro");
let pajaro = new Animal("pajaro", 1, "verde");

perro.setRaza = "pedro";

document.write(perro.getRaza);
-------------------------*/


/*class Animal {
	constructor(especie,edad,color){
		this.especie= especie;
		this.edad=edad;
		this.color=color;
		this.info = `Soy ${this.especie}, tengo ${this.edad} años y soy de color ${this.color}`;
	}
	verInfo() {
		document.write(this.info + "<br>");
	}
}

class Perro extends Animal{
	constructor(especie,edad,color,raza){
		super(especie,edad,color);
		this.raza = raza;
	}
	ladrar(){
		alert("¡WAW!"); 
	}
}


let perro = new Perro("perro",5,"marron","doberman");
let gato = new Animal("gato", 2 , "negro");
let pajaro = new Animal("pajaro", 1, "verde");

perro.verInfo();
gato.verInfo();
pajaro.verInfo();
*/



/*class animal {
	constructor(especie,edad,color){
		this.especie= especie;
		this.edad=edad;
		this.color=color;
		this.info = `Soy ${this.especie}, tengo ${this.edad} años y soy de color ${this.color}`;
	}
	verInfo() {
		document.write(this.info + "<br>");
	}
}


let perro = new animal("perro",5,"marron");
let gato = new animal ("gato", 2 , "negro");
let pajaro = new animal("pajaro", 1, "verde");

perro.verInfo();
gato.verInfo();
pajaro.verInfo();
--------------------------------------*/





/*const sumar = (num1,num2)=> {
	return parseInt(num1) + parseInt(num2);
}

const restar = (num1,num2)=> {
	return parseInt(num1) - parseInt(num2);
}

const dividir = (num1,num2)=> {
	return parseInt(num1) / parseInt(num2);
}

const multiplicar = (num1,num2)=> {
	return parseInt(num1) * parseInt(num2);
}

alert("¿Que operación deseas realizar?");
let operacion = prompt("1: suma, 2: resta, 3: división, 4: multiplicación");

if (operacion == 1) {
	let numero1 = prompt("Primer número para sumar");
	let numero2 = prompt("Segundo número para sumar");
	resultado = sumar(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}


else if (operacion == 2) {
	let numero1 = prompt("Primer número para restar");
	let numero2 = prompt("Segundo número para restar");
	resultado = restar(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}

else if (operacion == 3) {
	let numero1 = prompt("Primer número para dividir");
	let numero2 = prompt("Segundo número para dividir");
	resultado = dividir(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}

else if (operacion == 4) {
	let numero1 = prompt("Primer número para multiplicar");
	let numero2 = prompt("Segundo número para multiplicar");
	resultado = multiplicar(numero1,numero2);
	alert(`Tu resultado es ${resultado}`);
}

else {
	alert("no se ha encontrado la operación");
}

--------------------------------------*/



/*let cantidad = prompt("cuantos alumnos son?");
let alumnosTotales = [];

for(i = 0; i < cantidad; i++) {
alumnosTotales[i] = [prompt("nombre del alumno" + (i + 1)),0];

}

const tomarAsistencia = (nombre,p) => {
let presencia = prompt(nombre);
if (presencia == "p" || presencia == "P") {
	alumnosTotales[p][1]++;
}

}

for (i = 0; i < 30; i++) {
for (alumno in alumnosTotales) {
	tomarAsistencia(alumnosTotales[alumno][0],alumno);
}
}

for (alumno in alumnosTotales) {
	let resultado = `${alumnosTotales[alumno][0]}:<br>
	____________Presentes: ${alumnosTotales[alumno][1]} <br>
	____________Ausencias: ${30 - parseInt(alumnosTotales[alumno][1])}`;
	if (30 - alumnosTotales[alumno][1] > 18 ) {
		resultado+= "<b style='color:red'>REPROBADO POR INASISTENCIAS</b><br><br>";
		} else {
			resultado+= "<br><br>"
		}
		document.write(resultado);
}
---------------------------------------*/