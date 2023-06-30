<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Menu Principal</title>
<style>
    body {
        background-color: #f2f2f2;
        font-family: 'Arial', sans-serif;
    }

    .text-center {
        text-align: center;
    }

    .p-5 {
        padding: 5rem;
    }

    .p-4 {
        padding: 4rem;
    }

    .fw-bold {
        font-weight: bold;
    }

    ul {
        list-style-type: none;
        padding: 0;
        margin: 0;
    }

    li {
        margin-bottom: 1rem;
    }

    .menu-box {
        margin: 0 auto;
        width: 500px;
        background-color: #e6f7ff;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        padding: 20px;
    }

    a {
        display: block;
        padding: 0.5rem;
        background-color: #007bff;
        color: #ffffff;
        border-radius: 3px;
        text-decoration: none;
    }

    a:hover {
        background-color: #0056b3;
    }

    i {
        margin-right: 0.5rem;
    }
</style>
</head>
<body>

    <div class="text-center p-5">

        <h2 class="fw-bold p-4"><i class="fas fa-bars"></i> Menu de Opciones</h2>

        <div class="menu-box">
            <nav>
                <ul>

                    <li>
                        <a class="navbar-brand btn btn-sm" href="registrarInforme.jsp"> Registrar Informe</a>
                        <a class="btn btn-sm" href="ServletInforme?tipo=listar"> Consultar Informe</a>
                    </li>

                    <li ><a class="navbar-brand btn btn-sm" href="ServletUsuario?tipo=cerrarSesion">
                    <i class="fas fa-sign-out"></i> Cerrar Sesión</a></li> 
                </ul>
            </nav>
        </div>
    </div>
</body>
<script src="https://kit.fontawesome.com/f16b543c6e.js" crossorigin="anonymous"></script>
</html>