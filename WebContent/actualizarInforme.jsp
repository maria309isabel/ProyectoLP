<%@page import="beans.Informe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
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
<title>Actualizar Informe</title>
</head>
<body>
	<div class="form-container">
		<h2 class="fw-bold p-4 text-center d-flex">Actualizar Incidente</h2>
		<%
			Informe i = (Informe) request.getAttribute("registro");
		%>
		<br>
		<form action="ServletInforme?tipo=actualizar" id="frmactualizar"
			method="post">
			<div class="form-group">
				<label class="w-100 fw-bold d-flex">Solicitante:</label> <select
					class="form-control fw-bold" type="text" id="demo"
					name="txt_solicitante" class="w-100 fw-bold"
					onChange="combo(this, demo)" required
					value="<%=i.getCodigoSolicitante()%>">
					<option value="1">Maria Querevalu</option>
					<option value="2">Alexandra Vilchez</option>
					<option value="3">Juan Purizaca</option>
					<option value="4">Ana Martínez</option>
					<option value="5">Carlos Sánchez</option>
				</select>
			</div>
	

				<label class="w-100 fw-bold d-flex" for="fechaHora">Fecha y
					Hora:</label> <input type="date" id="fechaHora" class="w-100 fw-bold"
					name="txt_fecha" required value="<%=i.getFechaSolicitud()%>">

				<div class="form-group">
					<label class="w-100 fw-bold d-flex">Incidente:</label> <select
						class="form-control fw-bold" type="text" id="demo"
						name="txt_incidente" class="w-100 fw-bold"
						onChange="combo(this, demo)" required
						value="<%=i.getCodigoIncidente()%>">
						<option class="fw-bold" value="1">Violación de datos de
							una empresa</option>
						<option value="2">Interrupción del servicio en un
							proveedor de servicios en la nube</option>
						<option value="3">Brecha de seguridad en una red social</option>
						<option value="4">Error de software en un sistema de
							control de vuelo</option>
						<option value="5">Ataque de ransomware a un hospital</option>
					</select>
				</div>
				<div class="form-group">
					<label class="w-100 fw-bold d-flex">Recomendacion: </label>
					<textarea class="w-100 fw-bold" name="txt_recomendacion" cols="30"
						rows="4" value="<%=i.getRecomendaciones()%>"></textarea>

				</div>

				<div class="text-center">
					<button type="button" class="btn btn-secondary fw-bold"
						onclick="window.location.href='menuPrincipal.jsp'">
						<i class="fas fa-backspace"></i> Regresar
					</button>
					<button type="submit" class="btn btn-danger fw-bold">
						<i class="fas fa-save"></i> Actualizar
					</button>
				</div>
 		</form>
	</div>

	<script src="https://kit.fontawesome.com/f16b543c6e.js"
		crossorigin="anonymous"></script>
</body>
</html>