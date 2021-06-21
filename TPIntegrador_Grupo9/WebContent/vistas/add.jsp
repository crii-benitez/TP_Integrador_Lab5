<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
    <meta charset="utf-8">
</head>
<body style="background-color: #C9CBCC">
 
<h1> AGREGAR CLIENTE </h1>

<form action="add.jsp" method="get">
	Ingrese su nombre:  <p>       <input type="text" name="txtNombre"> <br>
	 Ingrese su apellido:   <p>     <input type="text" name="txtApellido"> <br>
	      Ingrese su DNI:  <p>    <input type="text" name="txtNombre"> <br>
	 Seleccione un Sexo: <p>
		
		Masculino       <input type="radio" name="Sexo" value="Masc">
		Femenino       <input type="radio" name="Sexo" value="Feme"> <br><br />
		
	<b>Seleccione Su Pais de residencia</b> <p>
		
					<select name="pais">
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
		
<br />
<b>Seleccione Provincia</b> <p>
		
					<select name="pais">
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
		
<br /><b>Seleccione Localidad</b> <p>
		
					<select name="pais">
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

  	Ingrese su Fecha de nacimiento:  <p>       <input type="text" name="txtNombre"> <br>

 Ingrese su direccion: <p>
		
		Calle      <input type="text" name="calle">
		Numero      <input type="text" name="numero" >
		Dto       <input type="text" name="dto" > <br><br>
	
	
	<input type="submit" name="btnAceptar" value="Aceptar">
</form>
<body>

</body>
</html>