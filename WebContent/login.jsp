<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Login</title>
	<style>
		body {
			background-color: #f2f2f2; 
			font-family: 'Verdana', sans-serif; 
		}

		form {
			margin: 170px auto; 
			width: 500px; 
			padding: 20px;
			background-color: #e6f7ff; 
			border-radius: 5px; 
		}

		label {
			display: block;
			margin-bottom: 10px;
			color: #333333; 
		}

		input[type="text"],
		input[type="password"] {
			width: 100%;
			padding: 5px;
			border: 1px solid #cccccc; 
			border-radius: 3px; 
		}

		button[type="submit"] {
			background-color: #007bff; 
			color: #ffffff; 
			padding: 5px 10px;
			border: none;
			border-radius: 3px; 
			cursor: pointer;
			margin-top: 10px; 
			width: 100%; 
		}

		.registrar {
			color: #007bff; 
			text-decoration: none; 
		}

		.registrar:hover {
			text-decoration: underline; 
		}

		.fs-4 {
			font-size: 20px;
		}

		.fs-5 {
			font-size: 16px;
		}

		.div-center {
			text-align: center;
			margin-top: 20px;
		}
	</style>
</head>
<body>
	<form name="frmsesion" method="post" action="ServletUsuario?login=iniciar">
		<label>USUARIO</label>
		<input id="txtusuario" name="txtusuario" type="text"><br><br>
		<label>CONTRASEÑA</label>
		<input id="txtcontra" name="txtcontra" type="password"><br>
		<button type="submit">Ingresar</button>
		<div class="div-center">
		<label class="fs-4">¿No tienes cuenta?</label>
		<a class="registrar" href="registrarUsuario.jsp">
			<label class="fs-5">Crear cuenta</label>
		</a>	
	</div>
	</form>
</body>
</html>
