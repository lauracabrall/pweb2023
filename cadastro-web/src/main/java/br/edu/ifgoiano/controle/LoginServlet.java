package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String senha = req.getParameter("senha");
		
		String html = new String();
		
		if(senha.equals("123456")) {
			html = "<html><body><h1>Login realizado com sucesso!</h1></body></html>";
		}else {
			html = "<html><body><h1>Falha: usuario ou senha inválidos</h1></body></html>";
		}
		
		PrintWriter writer = resp.getWriter();
		writer.println(html);
		
	}
}


