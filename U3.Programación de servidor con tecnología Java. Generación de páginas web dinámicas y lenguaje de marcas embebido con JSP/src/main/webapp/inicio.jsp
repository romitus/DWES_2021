<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Central de viajes</title>
</head>
<body>
<jsp:include page="barra.jsp"></jsp:include>
	<form method="post">
		<label for="fname">Usuario:</label><br> <input type="text"
			id="fname" name="usuario" ><br> 
			<label for="lname">Password:</label><br>
			<input type="password" id="lname" name="password" ><br> <br> Confirmar Password:</label><br>
		<input type="password" id="fname" name="cpassword"><br>
		<label for="lname">Email:</label><br> <input type="text" id="lname" name="email" ><br> <br> 
		<input type="submit" value="Registrarse">
	</form>
</body>
</html>