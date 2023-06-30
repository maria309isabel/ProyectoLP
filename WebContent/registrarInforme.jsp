<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Registrar Informe</title>

</head>
<body>
	<div class="form-container">
		<h2 class="fw-bold p-4 text-center d-flex">Registrar Incidente Tecnológico</h2>

		<form action="ServletInforme?tipo=registrar" id="frmregistro"
			method="post">


			<div class="form-group">
				<label class="w-100 fw-bold d-flex">Solicitante:</label>
				<select class="form-control fw-bold" type="text" id="demo"
					name="txt_solicitante" class="w-100 fw-bold"
					onChange="combo(this, demo)" required>
					<option value="1">Maria Querevalu</option>
					<option value="2">Alexandra Vilchez</option>
					<option value="3">Juan Purizaca</option>
					<option value="4">Ana Martínez</option>
					<option value="5">Carlos Sánchez</option>
				</select>
			</div>
			
			<div class="form-group">

				<label class="w-100 fw-bold d-flex" for="fechaHora">Fecha y
					Hora:</label> <input type="date" id="fechaHora" class="w-100 fw-bold"
					name="txt_fecha" required>

			<div class="form-group">
				<label class="w-100 fw-bold d-flex">Incidente:</label> <select
					class="form-control fw-bold" type="text" id="demo"
					name="txt_incidente" class="w-100 fw-bold"
					onChange="combo(this, demo)" required>
					<option class="fw-bold" value="1">Violación de datos de una empresa</option>
					<option value="2">Interrupción del servicio en un proveedor de servicios en la nube</option>
					<option value="3">Brecha de seguridad en una red social</option>
					<option value="4">Error de software en un sistema de control de vuelo</option>
					<option value="5">Ataque de ransomware a un hospital</option>
				</select>
			</div>
			<div class="form-group">
				<label class="w-100 fw-bold d-flex">Recomendacion: </label>
				<textarea class="w-100 fw-bold" name="txt_recomendacion" cols="30"
					rows="4"></textarea>

			</div>

			<div class="text-center">
				<button type="button" class="btn btn-secondary fw-bold"
					onclick="window.location.href='menuPrincipal.jsp'">
					<i class="fas fa-backspace"></i> Regresar
				</button>
				<button type="submit" class="btn btn-danger fw-bold">
					<i class="fas fa-save"></i> Registrar
				</button>
			</div>
			<br> <br>

			<%
				if (request.getAttribute("mensaje") != null) {
			%>
			<div class="alert alert-success text-center" role="alert">
				<%=request.getAttribute("mensaje")%>
			</div>
			<%
				}
			%>
		</form>
	</div>
	
	<script src="https://kit.fontawesome.com/f16b543c6e.js"
		crossorigin="anonymous"></script>
</body>
</html>