<%@ page session = "true" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="en">
<%
if ((Integer) session.getAttribute("perfilUser") != 1) {
	response.sendRedirect("IrALogin.html");
} 
%>
<head>
<script>
function checkIt() {
  if (confirm('Desea cerrar sesion?')) {
	  location.href = "IrALogin.html";
  }
}
</script>
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
						href="IrAUsuarios.html">ABM Usuarios</a></li>
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
	
		<div class="container py-4">

			<h1 class="col-12 col-xl-8 h2 text-left text-primary pt-3">Modificar
				Cuenta</h1>
<%-- 				${persona} --%>
			<br /> <br />
			<form class="table table-bordered bg-light" action="actualizacuenta.html" method="get">
				 <input type="hidden" id="idCuenta" name="idCuenta" value="${cuenta.idCuenta}">
			
				<div class="text-white  bg-dark">Datos de la Cuenta</div>
				<input type="text" value="${cuenta.numeroDeCuenta}" class="form-control border border-secondary" name="txtCuenta" placeholder="N?mero de Cuenta" /> 
				<input type="text" value = "${cuenta.alias}" class="form-control border border-secondary" name="txtAlias" placeholder="Alias" /> 
				<input type="text" value = "${cuenta.cbu}" class="form-control border border-secondary" name="txtCbu" placeholder="Alias" /> 
			
			
			
				</br>
				<button type="submit" class="btn btn-primary">Actualizar
					Cuenta</button>

			</form>
				<div class="container table py-4">
					<h1 class="col-12 col-xl-8 h3 text-left text-primary pt-3">Listado
						de Cuentas</h1>
					<p>
				<!-- 		Buscar: <input class="text-control border border-secondary"
							placeholder="Ingrese detalle a buscar" type="text" name="buscar">
						<button type="button" class="btn btn-primary">Filtrar</button>
					</p>

					</br>
					<table id="example"
						class="container table table-striped table-bordered">
						<thead>
							<tr>
								<th>N?mero de Cuenta</th>
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
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Herrod Chandler</td>
								<td>Sales Assistant</td>
								<td>Caja de ahorro - Pesos</td>
								<td>59</td>
								<td>2012/08/06</td>
								<td>$13007,500</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Rhona Davidson</td>
								<td>Integration Specialist</td>
								<td>Caja de ahorro - Dolares</td>
								<td>55</td>
								<td>2010/10/14</td>
								<td>$32007,900</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Colleen Hurst</td>
								<td>Javascript Developer</td>
								<td>Caja de ahorro - Pesos</td>
								<td>39</td>
								<td>2009/09/15</td>
								<td>$20500,500</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Sonya Frost</td>
								<td>Software Engineer</td>
								<td>Cuenta corriente - Pesos</td>
								<td>23</td>
								<td>2008/12/13</td>
								<td>$1030,600</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Jena Gaines</td>
								<td>Office Manager</td>
								<td>Cuenta corriente - Pesos</td>
								<td>30</td>
								<td>2008/12/19</td>
								<td>$9000,560</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Quinn Flynn</td>
								<td>Support Lead</td>
								<td>Cuenta corriente - Dolares</td>
								<td>22</td>
								<td>2013/03/03</td>
								<td>$34002,000</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Charde Marshall</td>
								<td>Regional Director</td>
								<td>Cuenta corriente - Pesos</td>
								<td>36</td>
								<td>2008/10/16</td>
								<td>$47000,600</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Haley Kennedy</td>
								<td>Senior Marketing Designer</td>
								<td>Cuenta corriente - Pesos</td>
								<td>43</td>
								<td>2012/12/18</td>
								<td>$3130,500</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Tatyana Fitzpatrick</td>
								<td>Regional Director</td>
								<td>Cuenta corriente - Pesos</td>
								<td>19</td>
								<td>2010/03/17</td>
								<td>$385000,750</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Michael Silva</td>
								<td>Marketing Designer</td>
								<td>Cuenta corriente - Pesos</td>
								<td>66</td>
								<td>2012/11/27</td>
								<td>$198000,500</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Paul Byrd</td>
								<td>Chief Financial Officer (CFO)</td>
								<td>Cuenta corriente - Pesos</td>
								<td>64</td>
								<td>2010/06/09</td>
								<td>$725000,000</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Gloria Little</td>
								<td>Systems Administrator</td>
								<td>Caja de ahorro - Pesosk</td>
								<td>59</td>
								<td>2009/04/10</td>
								<td>$237000,500</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Bradley Greer</td>
								<td>Software Engineer</td>
								<td>Caja de ahorro - Pesos</td>
								<td>41</td>
								<td>2012/10/13</td>
								<td>$132,000</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Dai Rios</td>
								<td>Personnel Lead</td>
								<td>Caja de ahorro - Pesos</td>
								<td>35</td>
								<td>2012/09/26</td>
								<td>$217000,500</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Jenette Caldwell</td>
								<td>Development Lead</td>
								<td>Caja de ahorro - Pesos</td>
								<td>30</td>
								<td>2011/09/03</td>
								<td>$345000,000</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Yuri Berry</td>
								<td>Chief Marketing Officer (CMO)</td>
								<td>Caja de ahorro - Pesos</td>
								<td>40</td>
								<td>2009/06/25</td>
								<td>$6750,000</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Caesar Vance</td>
								<td>Pre-Sales Support</td>
								<td>Caja de ahorro - Pesos</td>
								<td>21</td>
								<td>2011/12/12</td>
								<td>$10600,450</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Doris Wilder</td>
								<td>Sales Assistant</td>
								<td>Caja de ahorro - Pesos</td>
								<td>23</td>
								<td>2010/09/20</td>
								<td>$85000,600</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Angelica Ramos</td>
								<td>Chief Executive Officer (CEO)</td>
								<td>Caja de ahorro - Pesos</td>
								<td>47</td>
								<td>2009/10/09</td>
								<td>$120000,000</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Gavin Joyce</td>
								<td>Developer</td>
								<td>Caja de ahorro - Pesos</td>
								<td>42</td>
								<td>2010/12/22</td>
								<td>$9200,575</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Jennifer Chang</td>
								<td>Regional Director</td>
								<td>Caja de ahorro - Pesos</td>
								<td>28</td>
								<td>2010/11/14</td>
								<td>$3507,650</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td>Brenden Wagner</td>
								<td>Software Engineer</td>
								<td>Caja de ahorro - Pesos</td>
								<td>28</td>
								<td>2011/06/07</td>
								<td>$20600,850</td>
								<td><button type="button" class="btn btn-primary">
										<i class="fas fa-edit"></i>
									</button>
									<button type="button" class="btn btn-danger">
										<i class="fas fa-trash-alt"></i>
									</button></td>
							</tr>
							<tr>
								<td colspan="7" align="right">1 2 3 4 5... 24</td>

							</tr>
						</tbody>
					</table>  -->
					<table id="tableta"
						class="container table table-striped table-bordered">
				            <thead>
				            <tr>
				               	<td>N?mero de Cuenta</td>
								<td>Alias</td>
								<td>Tipo de Cuenta</td>
								<td>CBU</td>
								<td>Creacion</td>
								<td>Saldo</td>
<!-- 								<td style="width:  90px;"></td> -->
								
				            </tr>
				            </thead>
						    <tbody>
<%-- 				            <c:forEach var="mov" items="${listcuentas}"> --%>
				                <tr>
				                    <td>${cuenta.numeroDeCuenta}</td>
 				                    <td >${cuenta.alias}</td> 
				                    <td>${cuenta.tipoDeCuenta.nombreDeTipoDeCuenta}</td>
 				                    <td>${cuenta.cbu}</td> 
 				                    <td>${cuenta.fechaDeCreacion}</td> 
				                    <td>${cuenta.saldo}</td>
<%-- 							<span hidden="hidden">${mov.idCuenta}</span> --%>
<!-- 							<td><a name="btnModificar" class="btn btn-primary" -->
<%-- 								href="modificaCuentas.html?idCuenta=${mov.idCuenta}"> --%>
<!-- 									<i class="fas fa-trash-alt"></i> -->
<!-- 							</a></td> -->
<!-- 							<td><a name="btnEliminar" class="btn btn-danger" -->
<%-- 								href="bajaCuentas.html?idCuenta=${mov.idCuenta}"> --%>
<!-- 									<i class="fas fa-trash-alt"></i> -->
<!-- 							</a></td> -->
				                </tr>
				               
<%-- 				            </c:forEach> --%>
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
					<p class="text-lg-start text-center text-light light-300">?
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
<script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>

<script type="text/javascript">
$(document).ready(function () {
    $('#tableta').DataTable({
        paging: true,
        lengthChange: true,
        pageLength: 25,
        searching: true,
        ordering: true,
        stateSave: true,
        autoWidth: true,
        scrollx: true,
        scrollY: 430,
        scrollCollapse: true,
        language:
        {
            searchPlaceholder: "Que desea buscar?",
            "emptyTable": "No hay datos para mostrar.",
            "info": "Mostrando _START_ a _END_ de _TOTAL_ registros",
            "infoEmpty": "Mostrando 0 a 0 de 0 registros",
            "infoFiltered": "(filtrados de _MAX_ registros totales)",
            "lengthMenu": "Mostrar _MENU_ registros",
            "loadingRecords": "Cargando...",
            "processing": "Procesando...",
            "search": "Buscar:",
            "zeroRecords": "No se encontraron registros que coincidan con las condiciones de busqueda especficadas",
            "paginate": {
                "first": "Primero",
                "last": "Ultimo",
                "next": "Proxima",
                "previous": "Previa"
            }
        }

    });

});
</script>
<!-- Custom -->
<script src="assets/js/custom.js"></script>
</html>