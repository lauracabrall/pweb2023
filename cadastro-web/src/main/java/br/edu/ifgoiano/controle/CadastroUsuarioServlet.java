package br.edu.ifgoiano.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");
	
		
		//Verificar se as senhas são iguais
		
		if(senha1.equals(senha2)) {
			//redirecionar o usuário para a página de login
			resp.sendRedirect("index.html");
		}else {
			//redirecionar o usuário para a página de cadastro de usuário
			req.getRequestDispatcher("TelaCadastro.html").forward(req, resp);
		}
	}
}
