var gravedad = {
  MERCURIO: 3.7,
  VENUS: 8.87,
  TIERRA: 9.8,
  MARTE: 3.7,
  JUPITER: 24.8,
  SATURNO: 10.44,
  URANO: 8.87,
  NEPTUNO: 11.15
};

var imagenPlaneta = {
  MERCURIO: 'img/mercurio.jpg',
  VENUS: 'img/venus.jpg',
  TIERRA: 'img/tierra.jpg',
  MARTE: 'img/marte.jpeg',
  JUPITER: 'img/jupiter.jpg',
  SATURNO: 'img/saturno.jpg',
  URANO: 'img/urano.jpg',
  NEPTUNO: 'img/neptuno.jpg'
};

function calcular_peso() {
  var peso = document.getElementById('tu_peso');
  var combo = document.getElementById('combo');
  var planeta = combo.options[combo.selectedIndex].text;
  var peso_calculado = 0;

  peso = parseInt(peso.value);

  if (planeta == "Mercurio") {
      peso_calculado = (peso * gravedad['MERCURIO']) / gravedad['TIERRA'];
  } else if (planeta == "Venus"){
      peso_calculado = (peso * gravedad['VENUS']) / gravedad['TIERRA'];
  } else if (planeta == "Marte"){
      peso_calculado = (peso * gravedad['MARTE']) / gravedad['TIERRA'];
  } else if (planeta == 'Jupiter'){
      peso_calculado = (peso * gravedad['JUPITER']) / gravedad['TIERRA'];
  } else if (planeta == 'Saturno'){
      peso_calculado = (peso * gravedad['SATURNO']) / gravedad['TIERRA'];
  } else if (planeta == 'Urano'){
      peso_calculado = (peso * gravedad['URANO']) / gravedad['TIERRA'];
  } else if (planeta == 'Neptuno'){
      peso_calculado = (peso * gravedad['NEPTUNO']) / gravedad['TIERRA'];
  } else {
      peso_calculado = 1000000;
      planeta = "Kripton";
  }
  peso_calculado = parseInt(peso_calculado);

  var msg = document.getElementById('msg');
  msg.innerText = 'Te peso en ' + planeta + ' es:';

  var contendor_img = document.getElementById('contenedor_imagen');
  contendor_img.innerHTML = '<img src=' + imagenPlaneta[planeta.toUpperCase()] + ' alt=' + planeta + ' />';

  var contenedor_resultado = document.getElementById('resultado');
  contenedor_resultado.innerHTML = "<strong>" + peso_calculado + " kilos</strong>";
}

var boton_calcular = document.getElementById('boton_calcular_peso');
boton_calcular.addEventListener('click', calcular_peso);