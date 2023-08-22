<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
    
    <div class="container-fluid">
        <h1>Cadastro de Usuários</h1>
        <form>
            <label>Nome: </label>
            <input type="text" name="nome" id="nome">
            <label>E-mail </label>
            <input type="email" name="email" id="email">
            <label>Senha: </label>
            <input type="password" name="senha1" id="senha1">
            <label>Confirme a senha: </label>
            <input type="password" name="senha2" id="senha2">
            <input type="submit" value="Salvar">
            <a class="btn btn-secondary" href="usuarioListagem.jsp">Listar Usuário</a>
            <a class="btn btn-secondary" href="index.html">Voltar</a>
        </form>
        
        //Alertando que as senhas são diferentes 
        
        <c:if test ="${not empty param.nome}">
        	<hr>
        	<div class="alert alert-danger" role="alert">
        		${param.nome}<span>, as senhas informadas não são iguais</span>
        	</div>
        </c:if>
    </div>
</body>
</html>


