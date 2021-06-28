<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">

<head>
<title>SiGesBan ABML Cuentas</title>
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
		<a class="navbar-brand h1" href="IrALogin.html"> <i
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
				<a class="nav-link" href="#">GMedina<i
					class='bx bx-bell bx-sm bx-tada-hover text-primary'></i></a> <a
					class="nav-link" href="#"><i
					class='bx bx-cog bx-sm text-primary'></i></a> <a class="nav-link"
					href="#"><i class='bx bx-user-circle bx-sm text-primary'></i></a>
			</div>
		</div>
	</div>
	</nav>
	<!-- Close Header -->
	<div class="bg-light">
		<div class="container table py-4">

			<h1 class="col-12 col-xl-8 h2 text-left text-primary pt-3">Movimientos
				Históricos</h1>
			<form class="table table-bordered bg-light" action="#" method="post">
				<div class="text-white  bg-dark">Datos de Busqueda</div>
				<table class="container table table-bordered">
					<tr>
						<td colspan="2"><select name="pais"
							class="form-control border border-secondary"
							placeholder="Numero de Cuenta">
								<option value="1">20750921406888</option>
								<option value="2">20750921406890</option>
						</select></td>
					</tr>
					<tr>
						<td colspan="2"><select name="pais"
							class="form-control border border-secondary"
							placeholder="Tipo de Cuenta">
								<option value="1">Caja de ahorro - Pesos</option>
								<option value="2">Caja de ahorro - Dolares</option>
						</select></td>
					</tr>
					<tr>
						<td><input type="text"
							class="form-control border border-secondary" title="NombCuenta"
							placeholder="Fecha Desde" value="03/09/2020" /></td>
						<td><input type="text"
							class="form-control border border-secondary" title="NombCuenta"
							placeholder="Fecha Hasta" value="10/05/2021" /></td>
					</tr>
					<tr>
						<td colspan="2">
							<button type="button" class="btn btn-primary">Consultar</button>
						</td>
					</tr>
				</table>
			</form>
			<div class="bg-lingh">
				<div class="container table py-4">
					<h1 class="col-12 col-xl-8 h3 text-left text-primary pt-3">
						Cuenta seleccionada: Caja de Ahorro Nro: 20750921406888 CBU:
						0110092130001111111111</h1>
						
						<p>
						Buscar: <input class="text-control border border-secondary"
							placeholder="ingrese campo a filtrar" type="text" name="buscar">
						<button type="button" class="btn btn-primary">Filtrar</button>
					</p>

					<table id="listmovimientos"
						class="container table table-striped table-bordered">
				            <tr>
				                <th style="width:  50px;">ID</th>
				                <th style="width: 150px;">Nombre</th>
				                <th style="width: 150px;">Apellido</th>
				                <th style="width: 150px;">Calle</th>
				                <th style="width: 150px;">Ciudad</th>
				            </tr>
				            <h1>${listmovimientos}</h1>
						    <c:forEach var="listValue" items="${json}">
						    <li>${listValue}</li>
						    </c:forEach>
						    
				            <!--<c:forEach var="customer" items="${json}">
				                <<tr>
				                    <td>${customer.id}</td>
				                    <td>${customer.firstName}</td>
				                    <td>${customer.lastName}</td>
				                    <td>${customer.street}</td>
				                    <td>${customer.city}</td>
				                </tr>
				            </c:forEach>-->
<!-- 						<thead> -->
<!-- 							<tr> -->
<!-- 								<th>Fecha Movimiento</th> -->
<!-- 								<th>Nº Cuenta Origen</th> -->
<!-- 								<th>Nº Cuenta Destino</th> -->
<!-- 								<th>Detalle</th> -->
<!-- 								<th>Importe</th> -->
<!-- 							</tr> -->
<!-- 						</thead> -->
<!-- 						<tbody> -->
<!-- 							<tr> -->
<!-- 								<td>09/03/2020</td> -->
<!-- 								<td>20750921406888</td> -->
<!-- 								<td>20784585484518</td> -->
<!-- 								<td>Transferencia a Terceros</td> -->
<!-- 								<td>$37200,000</td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td>15/03/2020</td> -->
<!-- 								<td>20750921406888</td> -->
<!-- 								<td>20750921406890</td> -->
<!-- 								<td>Transferencia entre Cuentas</td> -->
<!-- 								<td>$10200,000</td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td>05/03/2021</td> -->
<!-- 								<td>20750921406888</td> -->
<!-- 								<td>20784585484518</td> -->
<!-- 								<td>Transferencia a Terceros</td> -->
<!-- 								<td>$37200,000</td> -->
<!-- 							</tr> -->
<!-- 							<tr> -->
<!-- 								<td>10/05/2021</td> -->
<!-- 								<td>20750921406888</td> -->
<!-- 								<td>20784585484518</td> -->
<!-- 								<td>Transferencia a Terceros</td> -->
<!-- 								<td>$37200,000</td> -->
<!-- 							</tr> -->
<!-- 						</tbody> -->
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
		$('#listmovimientos').DataTable();
		
        var list = ${json};
        $.each(list, function( index, value ) {
            alert( index + ": " + value );
        });
        
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