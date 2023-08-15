<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
		rel="stylesheet"
		integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
		crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container-fluid">
		<h1>Alteração de Usuário</h1>
		<form method="post" action="cadastrarUsuario">
			<input type="hidden" name="id" value="${usuario.id}">
			<label for="nome">Nome:</label>
			<input type="text" name="nome" value="${usuario.nome}">
			<label for="email">E-mail:</label>
			<input type="text" name="email" value="${usuario.email}"><br><br>
			<label for="senha1">Senha:</label>
			<input type="password" name="senha1" >
			<label for="senha2">Senha confirmada:</label>
			<input type="password" name="senha2"><br><br>
			<input type="submit" value="Salvar" class="btn btn-primary">
			<a class="btn btn-secondary" href="usuarioCadastro.jsp" role="button">Voltar</a>
			
			<c:if test="${not empty mensagem}">
				<hr>
				<div class="alert alert-danger" role="alert">
					<span>${mensagem}</span>
				</div>
			</c:if>
			
		</form>
	</div>
</body>
</html>