<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1>Usted Ingresó los siguientes datos:</h1>
        <p>Dni: <%= session.getAttribute("dni") %></p>
        <p>Nombre: <%= session.getAttribute("nombre") %></p>
        <p>Apellido: <%= session.getAttribute("apellido") %> </p>
        <p>Fecha de Nacimiento: <%= session.getAttribute("fechanacimiento")%> </p>
        <p>Dirección: <%= session.getAttribute("direccion") %> </p>
        <p>Profesión: <%= session.getAttribute("profesion")%> </p>
        <p>Tipo de Habitación: <%= session.getAttribute("tipohabitacion") %></p>
        <p>Cantidad de Personas: <%= session.getAttribute("cantpersona")%> </p>
        <p>Cantidad de Personas: <%= session.getAttribute("fechainicio")%> </p>
        <p>Cantidad de Personas: <%= session.getAttribute("fechasalida")%> </p>
    </body>
</html>
