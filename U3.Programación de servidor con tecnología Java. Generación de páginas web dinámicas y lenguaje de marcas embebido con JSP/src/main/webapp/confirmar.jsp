<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Central de viajes: Confirmacion</title>
</head>
<body>
	<jsp:include page="barra.jsp"></jsp:include>
	<h1>Reserva Confirmada</h1>
	<p>Fecha de Inicio:<%= ((String)session.getAttribute("fechaInicio")) %></p>
	<p>Fecha de Finalizacion:</span><%= ((String)session.getAttribute("fechaFin")) %></p>
	<p>Numero de personas:</span><%= ((String)session.getAttribute("numeroPersonas")) %></p>
	 <ul>
  <li>Coffee</li>
  <li>Tea</li>
  <li>Milk</li>
</ul> 
</body>
</html>