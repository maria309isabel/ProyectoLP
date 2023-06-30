<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Menu Principal</title>
<style>
	/* Estilos generales del cuerpo de la página */
	body {
		background-color: #f2f2f2;
		font-family: 'Arial', sans-serif;
	}

	/* Centrar elementos de texto */
	.text-center {
		text-align: center;
	}

	/* Espaciado interno */
	.p-5 {
		padding: 5rem;
	}

	.p-4 {
		padding: 4rem;
	}

	/* Fuente en negrita */
	.fw-bold {
		font-weight: bold;
	}

	/* Estilos para listas desordenadas */
	ul {
		list-style-type: none;
		padding: 0;
		margin: 0;
	}

	/* Estilos para elementos de la lista */
	li {
		margin-bottom: 1rem;
	}

	/* Estilos de la caja de botones */
	.menu-box {
		margin: 0 auto;
		width: 500px;
		background-color: #e6f7ff;
		border-radius: 5px;
		box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
		padding: 20px;
	}

	/* Estilos para enlaces */
	a {
		display: block;
		padding: 0.5rem;
		background-color: #007bff;
		color: #ffffff;
		border-radius: 3px;
		text-decoration: none;
	}

	/* Estilos para enlaces al pasar el cursor por encima */
	a:hover {
		background-color: #0056b3;
	}

	/* Estilos para íconos */
	i {
		margin-right: 0.5rem;
	}
</style>
</head>
<body>
	<!-- Contenedor principal -->
	<div class="text-center p-5">
		<!-- Título del menú -->
		<h2 class="fw-bold p-4"></i> Menu Principal</h2>
		<!-- Caja de botones -->
		<div class="menu-box">
			<nav>
				<ul>
					<!-- Primer ítem del menú: Registrar Informe y Consultar Informe -->
					<li>
						<a class="navbar-brand btn btn-sm" href="registrar.jsp"> Registrar Informe</a>
						<a class="navbar-brand btn btn-sm" href="ServletInforme?tipo=listar"> Consultar Informe</a>
					</li>
					<!-- Segundo ítem del menú: Registrar Forma Bitacora y Consultar Bitacora -->
					<li>
						<a class="navbar-brand btn btn-sm " href="registrarBitacora.jsp"> Registrar Forma Bitacora</a>
						<a class="navbar-brand btn btn-sm" href="ServletBitacora?tipo=listar"> Consultar Bitacora</a>
					</li>
					<!-- Tercer ítem del menú: Cerrar Sesión -->
					<li>
						<a class="navbar-brand" href="ServletUsuario?tipo=cerrarSesion"> Cerrar Sesión</a>
					</li>
			

			</nav>
		</div>
	</div>
</body>
<script src="https://kit.fontawesome.com/f16b543c6e.js" crossorigin="anonymous"></script>
</html>
