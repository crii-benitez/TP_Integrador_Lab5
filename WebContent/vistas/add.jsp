<%@ page session="true" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!DOCTYPE html>
<html lang="en">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<script type="text/javascript">
	var msg = "${mensaje}";
	if (msg)
		alert(msg);
</script>
<%
	if ((Integer) session.getAttribute("perfilUser") != 1) {
		response.sendRedirect("IrALogin.html");
	}
	java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy-MM-dd");
	java.util.Date currentTime = new java.util.Date(); // Obtener la hora actual del sistema
	String str_date1 = formatter.format(currentTime); // format datetime
	String str_date2 = str_date1.toString(); // Convertir fecha y hora en forma de cadena
%>
<head>
<script>
	function checkIt() {
		if (confirm('Desea cerrar sesion?')) {
			location.href = "IrALogin.html";
		}
	}
</script>
<title>SiGesBan ABML Usuarios</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="apple-touch-icon" href="assets/img/apple-icon.png">
<link rel="shortcut icon" type="image/x-icon"
	href="assets/img/favicon.ico">
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/boxicon.min.css" rel="stylesheet">
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
<link rel="stylesheet" href="assets/css/custom.css">
<link rel="stylesheet" href="assets/css/templatemo.css">
</head>

<body>
	<!-- Header -->
	<nav id="main_nav"
		class="navbar navbar-expand-lg navbar-light bg-white shadow">
	<div
		class="container d-flex justify-content-between align-items-center">
		<a class="navbar-brand h1" href="#"> <i
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
						class="nav-link btn-outline-primary rounded-pill px-1"
						href="IrAAdd.html">ABM Usuarios</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-1"
						href="IrAUsuarios.html">Usuarios</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-1"
						href="IrAAddAccount.html">ABM Cuentas</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-1"
						href="IrACuentas.html">Cuentas</a></li>
				</ul>
			</div>
			<div class="navbar align-self-center d-flex">
				<a class="nav-link" href="javascript:checkIt()"><%=session.getAttribute("nameUser")%>
					<i class='bx bx-user-circle bx-sm text-primary'></i></a> <a
					class="nav-link" href="#"><i
					class='bx bx-bell bx-sm bx-tada-hover text-primary'></i></a> <a
					class="nav-link" href="#"><i
					class='bx bx-cog bx-sm text-primary'></i></a>
			</div>
		</div>
	</div>
	</nav>
	<!-- Close Header -->
	<div class="bg-light">
		<div class="container py-4">

			<h1 class="col-12 col-xl-8 h2 text-left text-primary pt-3">Registrar
				Nuevo Usuario</h1>
			<br /> <br />
			<form class="table table-bordered bg-light"
				action="agregarUsuario.html" method="get">
				<p class="form-control">
					Seleccione Perfil de usuario (*) <select name="txtPerfil"
						class="text-control border border-secondary" placeholder="Perfil">
						<c:forEach var="per" items="${listperfiles}">
							<option selected="selected" value="${per.idPerfil}">${per.perfil}</option>
						</c:forEach>
					</select>
				<p />
				<input class="form-control border border-secondary"
					placeholder="Ingrese nombre (*)" type="text" name="txtNombre">
				<input class="form-control border border-secondary"
					placeholder="Ingrese apellido (*)" type="text" name="txtApellido">
				<input class="form-control border border-secondary"
					placeholder="Ingrese DNI (*)" type="text" name="txtDNI">
				<p class="form-control">
					Seleccione genero <select name="txtSexo"
						class="text-control border border-secondary" placeholder="Sexo">
						<c:forEach var="sex" items="${listgeneros}">
							<option selected="selected" value="${sex.idGenero}">${sex.genero}</option>
						</c:forEach>
					</select>
				<p />



				<p class="form-control">
					Seleccione Pais de residencia <select name="txtPais"
						class="text-control border border-secondary" placeholder="Paises">
						<c:forEach var="pai" items="${listpaises}">
							<option selected="selected" value="${pai.idPais}">${pai.pais}</option>
						</c:forEach>
					</select> &nbsp &nbsp &nbsp Seleccione Provincia <select
						class="text-control border border-secondary" name="txtProvincia"
						placeholder="Provincia">
						<c:forEach var="pro" items="${listprovincias}">
							<option selected="selected" value="${pro.idProvincia}">${pro.provincia}</option>
						</c:forEach>
					</select> &nbsp &nbsp &nbsp Seleccione Localidad <select
						class="text-control border border-secondary" name="txtLocalidad"
						placeholder="Localidad">
						<c:forEach var="loc" items="${listlocalidades}">
							<option selected="selected" value="${loc.idLocalidad}">${loc.localidad}</option>
						</c:forEach>
					</select>
				<p />

				<input type="date" class="form-control border border-secondary"
					name="txtFecha"
					placeholder="Ingrese su fecha de nacimiento en el siguiente formato:   <%=str_date2%>" />

				<p class="form-control">
					Ingrese su direccion: <input
						class="text-control border border-secondary" placeholder="Calle"
						type="text" name="txtCalle"> <input
						class="text-control border border-secondary" placeholder="Numero"
						type="text" name="txtNumero"> <input
						class="text-control border border-secondary" placeholder="Dto"
						type="text" name="txtDto">
				</p>
				</br>
				<button type="submit" class="btn btn-primary">Ingresar
					Usuario</button>

			</form>



			<table id="tableta"
				class="container table table-striped table-bordered">
				<thead>
					<tr>
						<td>Nombre</td>
						<td>Apellido</td>
						<td>DNI</td>
						<!-- 								<td>Sexo</td> -->
						<td>Pais</td>
						<td>Provincia</td>
						<td>Localidad</td>
						<!-- 								<td>Direccion</td> -->
						<td>Usuario</td>
						<td>Perfil</td>
						<td>Fecha de nacimiento</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="mov" items="${listpersonas}">
						<tr>
							<td>${mov.nombre}</td>
							<td>${mov.apellido}</td>
							<td>${mov.DNI}</td>
							<%--  				                    <td>${mov.genero.genero}</td>  --%>
							<td>${mov.pais.pais}</td>
							<td>${mov.provincia.provincia}</td>
							<td>${mov.localidad.localidad}</td>
							<%-- 				                    <td>${mov.direccion}</td> --%>
							<td>${mov.usuario.usuario}</td>
							<td>${mov.usuario.perfil.perfil}</td>
							<td>${mov.fechaNacimiento}</td>
							<span hidden="hidden">${mov.idPersona}</span>
							<td><a name="btnModificar" class="btn btn-primary"
								href="modificaUsuarios.html?usuario=${mov.usuario.usuario}">
									<i class="fas fa-trash-alt"></i>
							</a></td>
							<td><a name="btnEliminar" class="btn btn-danger"
								href="bajaUsuarios.html?usuario=${mov.usuario.usuario}">
									<i class="fas fa-trash-alt"></i>
							</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</div>
	</div>


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
						Realizado por Grupo 9 LAB5 UtnFrgp</p>
				</div>
			</div>
		</div>
	</div>

	</footer>
	<!-- End Footer -->
</body>

<!-- Bootstrap -->
<script src="assets/js/bootstrap.bundle.min.js"></script>
<!-- Templatemo -->
<script src="assets/js/templatemo.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>

<script type="text/javascript">
	$(document)
			.ready(
					function() {
						$('#tableta')
								.DataTable(
										{
											paging : true,
											lengthChange : true,
											pageLength : 25,
											searching : true,
											ordering : true,
											stateSave : true,
											autoWidth : true,
											scrollx : true,
											scrollY : 430,
											scrollCollapse : true,
											language : {
												searchPlaceholder : "Que desea buscar?",
												"emptyTable" : "No hay datos para mostrar.",
												"info" : "Mostrando _START_ a _END_ de _TOTAL_ registros",
												"infoEmpty" : "Mostrando 0 a 0 de 0 registros",
												"infoFiltered" : "(filtrados de _MAX_ registros totales)",
												"lengthMenu" : "Mostrar _MENU_ registros",
												"loadingRecords" : "Cargando...",
												"processing" : "Procesando...",
												"search" : "Buscar:",
												"zeroRecords" : "No se encontraron registros que coincidan con las condiciones de busqueda especficadas",
												"paginate" : {
													"first" : "Primero",
													"last" : "Ultimo",
													"next" : "Proxima",
													"previous" : "Previa"
												}
											}

										});

					});
</script>
<!-- Custom -->
<script src="assets/js/custom.js"></script>
</html>