<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/alteraPessoa" var="linkServletAlteraPessoa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${linkServletAlteraPessoa}" method="post">
		Nome: 		   <input type="text" name="nome" value="${pessoa.nome}">
		CPF: 		   <input type="text" name="cpf" value="${pessoa.cpf}" disabled="true">
		<input type="hidden" name="id" value="${pessoa.id}">
			<input type="submit" value="Submit" id="button-1"/>
	</form>
</body>
</html>