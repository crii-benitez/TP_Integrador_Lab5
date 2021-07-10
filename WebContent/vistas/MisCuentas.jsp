<%@ page session = "true" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!DOCTYPE html>
<html lang="en">
<%
if ((Integer) session.getAttribute("perfilUser") != 2) {
	response.sendRedirect("IrALogin.html");
} %>
<head>
<script>
function checkIt() {
  if (confirm('Desea cerrar sesion?')) {
	  location.href = "IrALogin.html";
  }
}
</script>
<title>SiGesBan Cuentas</title>
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
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="IrAMisCuentas.html">Cuentas</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="IrAMovimientos.html">Movimientos</a></li>
					<li class="nav-item"><a
						class="nav-link btn-outline-primary rounded-pill px-3"
						href="IrATransferencias.html">Transferencias</a></li>
				</ul>
			</div>
			<div class="navbar align-self-center d-flex">
				<a class="nav-link" href="javascript:checkIt()"><%=session.getAttribute("nameUser") %> <i
					class='bx bx-user-circle bx-sm text-primary'></i></a> <a
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
		<div class="container table py-4">

			<h1 class="col-12 col-xl-8 h2 text-left text-primary pt-3">Cuentas</h1>
			<form class="table table-bordered bg-light" action="#" method="post">
				
				<div class="text-white bg-dark">Datos del Cliente</div>

				 <span
					class="input-group-text border border-secondary">32.128.258</span> <span
					class="input-group-text border border-secondary">Fernando
					Flego</span> <span class="input-group-text border border-secondary">Av.
					Presidente Peron 4785</span> <span
					class="input-group-text border border-secondary">San Miguel</span>
				<span class="input-group-text border border-secondary">Buenos
					Aires</span> 

			</form>
			<div class="bg-lingh">
				<div class="container table py-4">
					<h1 class="col-12 col-xl-8 h3 text-left text-primary pt-3">Listado
						de Cuentas</h1>
					<p>
				
					<table id="example"
						class="container table table-striped table-bordered">
						<thead>
							<tr>
								<th>Número de Cuenta</th>
								<th>Nombre de Cuenta</th>
								<th>Tipo de Cuenta</th>
								<th>CBU</th>
								<th>Fecha Creacion</th>
								<th>Saldo</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>Brielle Williamson</td>
								<td>Integration Specialist</td>
								<td>Caja de ahorro - Pesos</td>
								<td>61</td>
								<td>2012/12/02</td>
								<td>$37200,000</td>
						
							</tr>
							<tr>
								<td>Herrod Chandler</td>
								<td>Sales Assistant</td>
								<td>Caja de ahorro - Pesos</td>
								<td>59</td>
								<td>2012/08/06</td>
								<td>$13007,500</td>
								
							</tr>
							<tr>
								<td>Rhona Davidson</td>
								<td>Integration Specialist</td>
								<td>Caja de ahorro - Dolares</td>
								<td>55</td>
								<td>2010/10/14</td>
								<td>$32007,900</td>
								
							</tr>
							<tr>
								<td>Colleen Hurst</td>
								<td>Javascript Developer</td>
								<td>Caja de ahorro - Pesos</td>
								<td>39</td>
								<td>2009/09/15</td>
								<td>$20500,500</td>
								
							</tr>
							
							
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
<script type="text/javascript">
	$(document).ready(function() {
		$('#example').DataTable();
	});
</script>
<!-- Bootstrap -->
<script src="assets/js/bootstrap.bundle.min.js"></script>
<!-- Templatemo -->
<script src="assets/js/templatemo.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<!-- Custom -->
<script src="assets/js/custom.js"></script>
</html>