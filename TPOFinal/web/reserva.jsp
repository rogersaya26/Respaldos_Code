
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservas Hotel</title>
    </head>
    <body>
        <h1>Reserva Habitacion</h1>
        <form action="ServletUno"  class="form" method="POST">
            <p>DNI: <input type="text" name="dni"></p>
            <p>Nombre: <input type="text" name="nombre"></p>
            <p>Apellido: <input type="text" name="apellido"></p>
            <p>Fecha de Nacimiento: <input type="date" name="fechanacimiento"></p>
            <p>Direccíon: <input type="text" name="direccion"></p>
            <p>Profesión: <input type="text" name="profesion"></p>
            <p>Tipo de Habitacion: <select name="tipohabitacion">
                <option>-</option>
                <option>Single</option>
                <option>Doble</option>
                <option>Triple</option>
                <option>Multiple</option>
            </select></p>
            <p>Cantidad de Personas: <input type="text" name="cantpersona" ></p>
            <p>Fecha Entrada: <input type="date" name="fechainicio"> 
               Fecha Salida: <input type="date" name="fechasalida"></p>
            <input type="submit" value="Enviar">
              
        </form>
        
        
    </body>
</html>
