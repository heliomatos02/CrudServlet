<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/listarPessoas" var="linkServletListarPessoas"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
		<input type="button" id="btnNovo"  value="Novo Cadastro"
		 OnClick="parent.location.href='novaPessoa.jsp'"/><br><br>

		 <form action="${linkServletListarPessoas}">
		 <input type="submit" id="btnListarTodos"  value="Listar Todos"/><br><br>
		 </form>
</body>
</html>