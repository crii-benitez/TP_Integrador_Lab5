<%-- <%@ page session = "true" language="java" contentType="text/html; charset=ISO-8859-1" --%>
<%--     pageEncoding="ISO-8859-1"%>  --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 session.setAttribute("nameUser", request.getAttribute("txtUsuario"));
 session.setAttribute("passUser", request.getAttribute("txtPass"));
 session.setAttribute("perfilUser", request.getAttribute("txtPerfil"));
 String url = "";

 if ((Integer) request.getAttribute("txtPerfil") == 1) {
 	response.sendRedirect("IrAAddAccount.html");
 } else if ((Integer) request.getAttribute("txtPerfil") == 2)
 {
	 url = "IrAMisCuentas.html"+"?UserName="+request.getAttribute("txtUsuario");
 	response.sendRedirect(url);
} else
{
	response.sendRedirect("IrALogin.html");
	}
  %> 
<%-- <h1>${txtUsuario}</h1> --%>
</body>
</html>