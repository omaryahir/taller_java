<%-- 
    Document   : ListarCliente
    Created on : Aug 8, 2015, 8:16:39 PM
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
        <h1>Lista de Clientes</h1>
        <hr>
	<s:form action="listarClientes" method="post">
		<s:submit value="Listar"/>
	</s:form>
	<table border="1" width="100%">
		<tr>
		    <td>Id</td>
		    <td>Nombre</td>
		    <td>RFC</td>
		</tr>
		<s:iterator value="%{listaClientes}">
		<tr>
		    <td><s:property value="idcliente" /></td>
		    <td><s:property value="nombre" /></td>
		    <td><s:property value="rfc" /></td>
		</tr>
		</s:iterator> 
	</table>
    </body>
</html>
