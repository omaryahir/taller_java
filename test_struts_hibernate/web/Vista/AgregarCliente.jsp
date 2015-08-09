<%-- 
    Document   : AgregarCliente
    Created on : Aug 8, 2015, 8:15:40 PM
    Author     : omaryahir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registrar Cliente</h1>
	<hr>
	<s:form action="agregarCliente" method="POST">
		<s:textfield label="Nombre" name="cliente.nombre" size="30" maxLength="30"/>
		<s:textfield label="RFC" name="cliente.rfc" size="15" maxLength="15"/>
		<s:submit value="Grabar"/>
	</s:form>
	<hr>
	<s:label value="%{msg}" />

		
    </body>
</html>
