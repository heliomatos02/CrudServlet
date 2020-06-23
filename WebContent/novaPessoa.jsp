
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/cadastroPessoa" var="linkServletNovaPessoa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela Nova Pessoa</title>
</head>
<body>
<h4 >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Nova Pessoa</h4>

<form action="${linkServletNovaPessoa}" method="post">
	Nome: <input type="text" name="nome"><br><br>
	Data nascimento: <input type="text" name="data"><br><br>
	CPF: <input type="text" name="cpf"><br><br>
	<input type="submit" value="SALVAR" id="btnSalvar"/><tb>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="button" id="btnCancelar"  value="CANCELAR" 
	OnClick="parent.location.href='index.jsp'"/>
</form>

</body>
</html>