<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
		body {
			background-color: #f2f2f2; 
			font-family: 'Arial', sans-serif; 
		}

		form {
			margin: 200px auto; 
			width: 400px; 
			padding: 20px;
			background-color: #e6f7ff; 
			border-radius: 5px; 
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); 
		}

		label {
			display: block;
			margin-bottom: 10px;
			color: #333333; 
			font-weight: bold;
		}

		input[type="text"],
		input[type="password"] {
			width: 100%;
			padding: 10px;
			border: 1px solid #cccccc; 
			border-radius: 3px; 
			margin-bottom: 15px;
		}

		button[type="submit"],
		button[type="button"] {
			background-color: #007bff; 
			color: #ffffff; 
			padding: 10px 20px;
			border: none;
			border-radius: 3px; 
			cursor: pointer;
			margin-top: 10px; 
			width: 100%; 
		}
	</style>
</head>
<body>
	<form name="frmregistro" method="post" action="ServletUsuario?login=registrar">
		<label>Usuario</label>
		<input name="txtusuario" type="text">
		<label>Contraseña</label>
		<input name="txtcontra" type="password"><br>
		<button type="submit">Registrar</button>
		<button type="button" class="btn btn-primary fw-bold"
				onclick="window.location.href='login.jsp'">
				<i class="fas fa-backspace"></i> Regresar
		</button>
	</form>
</body>
</html>