package br.edu.ifgoiano.controle;

import javax.servlet.http.HttpServlet;

public class CadastrarUsuarioServlet extends HttpServlet {

	protected void doPost (req, HttpServletResponse resp) throws ServletException, IOException{
		String senha1 = req.getParameter("senha1");
		String senha1 = req.getParameter("senha2");
		
		//Verificando se as senhas são iguais
		
		
		if(senha1.equals(senha2)) {
			Usuario usu = new Usuario();
			usu.setNome(req.getParameter("nome"));
			usu.setEmail(req.getParameter("email"));
			usu.setSenha(senha1);
			
			UsuarioRepositorio repositorio = new UsuarioRepositorio();
			repositorio.inserirUsuario(usuario);
			
			//redirecionar o usuario para  a pagina de login
			resp.sendRedirect("index.html");
		}else {
			//redirecionar o usuario para a mesma tela de cadastro
			req.getRequestDispatcher("usuarioCadastro.jsp") forward (req, resp);
			
	}
	}
	
}