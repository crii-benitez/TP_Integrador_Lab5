<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
// if(request.getParameter("btnAceptar")!=null){
	String var1 = request.getParameter("txtUsuario");
	String Mensaje = request.getParameter("Mensaje");
	String var2 = request.getParameter("txtMensaje");
%>
<br>
	<h1><%=var1%></h1>
	<h6><%=var2%></h6>
	<h6><%=Mensaje%></h6>
</body>
</html>