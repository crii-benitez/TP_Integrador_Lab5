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
    <link rel="shortcut icon" type="image/x-icon" href="../assets/img/favicon.ico">
    <!-- Load Require CSS -->
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font CSS -->
    <link href="../assets/css/boxicon.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600&display=swap" rel="stylesheet">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="../assets/css/custom.css">
    <!-- Load Tempalte CSS -->
    <link rel="stylesheet" href="../assets/css/templatemo.css">
    
    
</head>
    <title>SiGesBan LOGIN</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="../assets/img/apple-icon.png">
    <link rel="shortcut icon" type="image/x-icon" href="../assets/img/favicon.ico">
    <!-- Load Require CSS -->
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font CSS -->
    <link href="../assets/css/boxicon.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;600&display=swap" rel="stylesheet">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="../assets/css/custom.css">
    <!-- Load Tempalte CSS -->
    <link rel="stylesheet" href="../assets/css/templatemo.css">
    

</head>

<body>

    <!-- Header -->
    <nav id="main_nav" class="navbar navbar-expand-lg navbar-light bg-white shadow">
        <div class="container d-flex justify-content-between align-items-center">
            <a class="navbar-brand h1" href="index.html">
                <i class='bx bx-buildings bx-sm text-dark'></i>
                <span class="text-dark h4">SiGeBan</span> <span class="text-primary h4">LAB5</span>
            </a>
            <button class="navbar-toggler border-0" type="button" data-bs-toggle="collapse" data-bs-target="#navbar-toggler-success" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="align-self-center collapse navbar-collapse flex-fill  d-lg-flex justify-content-lg-between" id="navbar-toggler-success">
                <div class="flex-fill mx-xl-5 mb-2">
                    <ul class="nav navbar-nav d-flex justify-content-between mx-xl-5 text-center text-dark">
                        <li class="nav-item">
                            <a class="nav-link btn-outline-primary rounded-pill px-3" href="index.html">Alta cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link btn-outline-primary rounded-pill px-3" href="about.html"> Listar Cliente</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link btn-outline-primary rounded-pill px-3" href="work.html">Alta cuenta</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link btn-outline-primary rounded-pill px-3" href="pricing.html">Listar Cuenta</a>
                        </li>
                       
                    </ul>
                </div>
                
                <div class="navbar align-self-center d-flex">
                    <a class="nav-link" href="#"><i class='bx bx-bell bx-sm bx-tada-hover text-primary'></i></a>
                    <a class="nav-link" href="#"><i class='bx bx-cog bx-sm text-primary'></i></a>
                    <a class="nav-link" href="#"><i class='bx bx-user-circle bx-sm text-primary'></i></a>
                </div>
            </div>
        </div>
    </nav>
    <!-- Close Header -->

	<!-- Start Banner Hero -->
	<div class="bg-light">
	 <div class="container py-4">

 <h1 class="col-12 col-xl-8 h2 text-left text-primary pt-3">Registrar Nuevo Usuario</h1>
<form action="add.jsp" method="get">
<br>	Ingrese nombre:  <p>       <input type="text" name="txtNombre"> <br/>
<br>	 Ingrese apellido:   <p>     <input type="text" name="txtApellido"> <br/>
<br>	      Ingrese DNI:  <p>    <input type="text" name="txtNombre"> <br/>
<br>	 Seleccione Sexo: <p><br/>
		
		Masculino       <input type="radio" name="Sexo" value="Masc">
		Femenino       <input type="radio" name="Sexo" value="Feme"> <br><br />
		
	<br>Seleccione Pais de residencia<br/> <p>
		
				<br>	<select name="pais">
						<option value="1">México</option>
						<option value="2">Colombia</option>
						<option value="3">Chile</option>
						<option value="4">Perú</option>
						<option value="5">Argentina</option>
						<option value="6">Brazil</option>
						<option value="7">Paraguay</option>
						<option value="8">Venezuela</option>
						<option value="9">Ecuador</option>
						<option value="10">Guyana</option>
						<option value="11">Uruguay</option>
						<option value="12">Suriname</option>
					</select> 
		<br/>

    <br>Seleccione Provincia<br/> <p>
		
			<br>		<select name="pais">
						<option value="1">Buenos aires</option>
						<option value="2">Jujuy</option>
						<option value="3">Salta</option>
						<option value="4">Tucuman</option>
						<option value="5">Formosa</option>
						<option value="6">Misiones</option>
						<option value="7">Corrientes</option>
						<option value="8">Entre Rios</option>
						<option value="9">La Pampa</option>
						<option value="10">Santa Fe</option>
						<option value="11">Cordoba</option>
						<option value="12">San Luis</option>
					</select> 
		<br/>
<br> Seleccione Localidad <br/><p>
		
			<br>		<select name="pais">
						<option value="1">Jose C Paz</option>
						<option value="2">San Miguel</option>
						<option value="3">Moreno</option>
						<option value="4">Tigre</option>
						<option value="5">Pilar</option>
						<option value="6">Caba</option>
						<option value="7">Vicente Lopes</option>
						<option value="8">Zarate</option>
						<option value="9">San Martin</option>
						<option value="10"># de Febrero</option>
						<option value="11">Merlo</option>
						<option value="12">Ramo Mejia</option>
					</select> 
		
<br />

  <br>	Ingrese su Fecha de nacimiento:  <p>  <br />   <input type="text" name="txtNombre"> <br />

 <br>   Ingrese su direccion: <p><br />
		
		Calle      <input type="text" name="calle">
		Numero      <input type="text" name="numero" >
		Dto       <input type="text" name="dto" > 
<br />	
	
<br><p>	<input type="submit" name="btnAceptar" value="Ingresar Usuario"><p><br/>


	
	<!-- Start Footer -->
    <footer class="bg-secondary pt-4">


        <div class="w-100 bg-primary py-4">
            <div class="container">
                <div class="row pt-2">
                    <div class="col-lg-6 col-sm-12">
                        <p class="text-lg-start text-center text-light light-300">
                            © Copyright 2021 SiGeBan. All Rights Reserved.
                        </p>
                    </div>
                    <div class="col-lg-6 col-sm-12">
                        <p class="text-lg-end text-center text-light light-300">
                            Realizado por Grupo 9 LAB5 UtnFrgp
                        </p>
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
	
	
	
</form>
</html>