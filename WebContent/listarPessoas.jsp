<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="br.com.crud.entidades.Pessoa"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Listar Pessoas</title>
	</head>
	<body>
		<br>Pessoas cadastradas<br>
		<ul>
			<c:forEach items="${pessoas}" var="pessoa">
				<li>
					Nome: ${pessoa.nome} - CPF:  ${pessoa.cpf} -
					<a href="/CRUD/mostraPessoa?id=${pessoa.id}">editar</a> -
					<a href="/CRUD/removePessoa?id=${pessoa.id}">remove</a><br><br>
				</li>
			</c:forEach>
		</ul>
		<input type="button" id="btnVoltar"  value="Voltar" 
	OnClick="parent.location.href='index.jsp'"/>
	</body>
</html>