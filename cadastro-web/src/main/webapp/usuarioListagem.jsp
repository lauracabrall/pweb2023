<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div>
        <h1>Listagem de Usuários</h1>
       <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>E-mail</th>
            </tr>
        </thead>
       </table>

       <tbody>
    	<c:forEach items="${usuarios}" var="usu" varStatus="id">
       </tbody>
    </div>
</body>
</html>

<c:forEach items="${usuarios}" var="usu" varStatus="id">
					<tr class="${id.count % 2 == 0 ? 'table-primary' : 'table-secondary'}">
						<td>${usu.id}</td>
						<td>${usu.nome}</td>
						<td><a href="mailto:${usu.email}">${usu.email}</a></td>
					</tr>
				</c:forEach>