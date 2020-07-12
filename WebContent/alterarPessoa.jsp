<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		Data Abertura: <input type="text" name="data" value=" <fmt:formatDate value="${pessoa.dataNascimento}" pattern="dd/MM/yyyy"/>">
		CPF: 		   <input type="text" name="cpf" value="${pessoa.cpf}">
		<input type="hidden" name="id" value="${pessoa.id}">
			<input type="submit" value="Submit" id="button-1"/>
	</form>
</body>
</html>