<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!DOCTYPE html>
<html lang="en">

<head>
<title>SiGesBan LOGIN</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="apple-touch-icon" href="../assets/img/apple-icon.png">
<link rel="shortcut icon" type="image/x-icon"
	href="../assets/img/favicon.ico">
<link href="../assets/css/bootstrap.min.css" rel="stylesheet">
<link href="../assets/css/boxicon.min.css" rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css"
	rel="stylesheet">
<link
	href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap4.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
	integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link
	href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.css"
	rel="stylesheet" />
<link rel="stylesheet" href="../assets/css/custom.css">
<link rel="stylesheet" href="../assets/css/templatemo.css">
</head>

<body>
	<%
		String txtUsuario = null;
		String txtPass = null;
		String Mensaje = null;
	%>
	<!-- Header -->
	<nav id="main_nav"
		class="navbar navbar-expand-lg navbar-light bg-white shadow">
	<div
		class="container d-flex justify-content-between align-items-center">
		<a class="navbar-brand h1" href="index.html"> <i
			class='bx bx-buildings bx-sm text-dark'></i> <span
			class="text-dark h4">SiGeBan</span> <span class="text-primary h4">LAB5</span>
		</a>
		<button class="navbar-toggler border-0" type="button"
			data-bs-toggle="collapse" data-bs-target="#navbar-toggler-success"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div
			class="align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between"
			id="navbar-toggler-success">
			<div class="flex-fill mx-xl-5 mb-2">
				<ul
					class="nav navbar-nav d-flex justify-content-between mx-xl-5 text-center text-dark">
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="index.html">Home</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="about.html">Contactenos</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="work.html">Seguridad</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="IrAMovimientos.html">Ver Movimientos</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="pricing.html">Preguntas frecuentes</a></li>

				</ul>
			</div>

			<div class="navbar align-self-center d-flex">
				<a class="nav-link" href="#"><i
					class='bx bx-bell bx-sm bx-tada-hover text-primary'></i></a> <a
					class="nav-link" href="#"><i
					class='bx bx-cog bx-sm text-primary'></i></a> <a class="nav-link"
					href="#"><i class='bx bx-user-circle bx-sm text-primary'></i></a>
			</div>
		</div>
	</div>
	</nav>
	<!-- Close Header -->

	<!-- Start Banner Hero -->
	<div class="bg-light">
		<div class="container py-4">

			<h1 class="col-12 col-xl-8 h2 text-left text-primary pt-3">Ingrese
				a nuestro Home Banking</h1>
			<div class="loginLG">
				<div class="tituloLG">SiGeBan</div>
				<form action="AccionLoguear.html" method="get"
					enctype="application/x-www-form-urlencoded">
					<input type="text" name="txtUsuario" required title="Usuario"
						placeholder="Usuario" data-icon="U" value=<%=txtUsuario%>> <input
						type="password" name="txtPass" required title="Contraseña"
						placeholder="Contraseña" data-icon="x" value=<%=txtPass%>>
					<div class="olvidoLG">
						<div class="colLG">
							<a href="#" title="Ver contraseña">Ver contraseña</a>
						</div>
						<div class="colLG">
							<a href="#" title="Recuperar contraseña">Olvido contraseña?</a>
						</div>
					</div>
					<a name=btnContinuar href="AccionLoguear.html" class="enviarLG">Continuar</a>
					<h1>${Mensaje}</h1>
				</form>
			</div>
			<!--   <div class="contact-img col-lg-5 align-items-end col-md-4">
                    <img src="../assets/img/apple-icon.png">
                </div> -->
		</div>
	</div>
	<!-- End Banner Hero -->




	<!-- Start Footer -->
	<footer class="bg-secondary pt-4">


	<div class="w-100 bg-primary py-4">
		<div class="container">
			<div class="row pt-2">
				<div class="col-lg-6 col-sm-12">
					<p class="text-lg-start text-center text-light light-300">©
						Copyright 2021 SiGeBan. All Rights Reserved.</p>
				</div>
				<div class="col-lg-6 col-sm-12">
					<p class="text-lg-end text-center text-light light-300">
						Realizado por Grupo 9 LAB5 UtnFrgp.</p>
				</div>
			</div>
		</div>
	</div>

	</footer>
	<!-- End Footer -->


	<!-- Bootstrap -->
	<script src="../assets/js/bootstrap.bundle.min.js"></script>

	<!-- Templatemo -->
	<script src="../assets/js/templatemo.js"></script>
	<!-- Custom -->
	<script src="../assets/js/custom.js"></script>
</body>

</html>