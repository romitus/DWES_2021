<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Central de viajes: Reserva</title>
</head>
<body>
<jsp:include page="barra.jsp"></jsp:include>
	<h1>Datos de la reserva</h1>
 <form method="post">
  <label for="fname">Fecha de Inicio:</label><br>
  <input type="date" id="fname" name="finicio"><br>
  <label for="lname">Fecha de Fin:</label><br>
  <input type="date" id="lname" name="ffin"><br><br>
  <label for="lname">Número de personas:</label><br>
  <input type="number" id="lname" name="npersonas"><br>
  <h2>Servicios</h2>
  <input type="checkbox" id="vehicle1" name="wifi" value="wifi">
  <label for="vehicle1">Wifi</label><br>
  <input type="checkbox" id="vehicle2" name="limpieza" value="limpieza">
  <label for="vehicle2">Limpieza</label><br>
  <input type="checkbox" id="vehicle3" name="toallas" value="toallas">
  <label for="vehicle3">Toallas</label>
  <input type="checkbox" id="vehicle3" name="ruta" value="ruta">
  <label for="vehicle3">Ruta Guiada</label>
  <input type="checkbox" id="vehicle3" name="desayuno" value="desayuno">
  <label for="vehicle3">Desayuno</label>
  <input type="checkbox" id="vehicle3" name="sauna" value="sauna">
  <label for="vehicle3">Sauna</label><br><br>
  <input type="submit" value="Reservar">
</form> 
</body>
</html>