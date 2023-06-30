<%@page import="beans.Informe"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body {
 	justify-content: center;
	align-items: center;
	height: 100vh;
}

 
 
</style>
</head>
<body>
	<div class="form-container fw-bold text-center">
		<h2 class="fw-bold p-4 text-center">Consultar Informe Técnico</h2>	<div class="text-center">
				<button type="button" class="btn btn-dark fw-bold"
					onclick="window.location.href='menuPrincipal.jsp'">
					<i class="fas fa-backspace"></i> Regresar
				</button></div><br>
		<form action="ServletInforme?tipo=listar" id="frmlistar" method="post">
		
			<div class="form-group mx-sm-3 mb-2">
				<table class="table table-striped table-dark bg-dark p-2">
					<thead>
						<tr>
							<th>Informe</th>
							<th><i class="fas fa-user-check"></i> Solicitante</th>
							<th><i class="fas fa-calendar-week"></i> Fecha de Solicitud</th>
							<th><i class="fas fa-file"></i> Incidente</th>
							<th>  Impacto</th>
							<th><i class="fas fa-sticky-note"></i> Recomendación</th>
						</tr>
					</thead>
					<tbody>
						<%
							if (request.getAttribute("informes") != null) {
							List<Informe> informes = (List<Informe>) request.getAttribute("informes");
							for (Informe informe : informes) {
						%>
						<tr>
							<th><%=informe.getCodigoInforme()%></th>
							<th><%=informe.getNombreSolicitante()%></th>
							<th><%=informe.getFechaSolicitud()%></th>
							<th><%=informe.getDescripcion()%></th>
							<th><%=informe.getImpacto()%></th>
							<th><%=informe.getRecomendaciones()%></td>
							<th align="center" scope="col"><a
						href="ServletCliente?tipo=buscar&cod=<%=informes.getCodigoInforme()%>">
							<label class="text-white"> <i class="fas fa-pencil-alt"></i></label>
					</a></th>
					<th align="center" scope="col"><a
						href="ServletCliente?tipo=eliminar&cod=<%=informes.getCodigoInforme()%>">
							<label class="text-white"> <i class="fas fa-trash"></i>
						</label>
					</a></th>
							
						</tr>
						<%
							}
						}
						%>
					</tbody>
				</table>

			</div>
		</form>
	</div>

	<script src="https://kit.fontawesome.com/f16b543c6e.js"
		crossorigin="anonymous"></script>
</body>
</html>