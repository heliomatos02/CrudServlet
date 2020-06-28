<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
		<input type="button" id="btnNovo"  value="Novo Cadastro"
		 OnClick="parent.location.href='novaPessoa.jsp'"/><br><br>
		<input type="text" name="cpf"> Pesquisar<br><br>
		<input type="text" name="exclui"> Excluir<br><br>
		<input type="text" name="editar"> Editar<br><br>
		<input type="button" id="btnListarTodos"  value="Listar Todos"
		 OnClick=""/><br><br>
</body>
</html>