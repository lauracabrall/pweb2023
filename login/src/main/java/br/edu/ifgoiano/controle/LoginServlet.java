package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String senha = (req.getParameter("senha"));	
		
	
		
		if(senha .equals("123456") ) {
			String valor = new String();
			valor = "<html><head><body><h1 style=\"background-color: #d2c7c7;\r\n"
					+ "    width: 100%;\r\n"
					+ "    padding: 100%\r\n"
					+ "    color: rgb(26, 1, 1);\r\n"
					+ "    text-align: justify;\r\n"
					+ "    height: 100%;\">Login realizado com sucesso!</html></body></h1>";
			PrintWriter writer = resp.getWriter();
			writer.println(valor);
		}else {
			String valor = new String();
			valor = "<html><head><body><h1 style=\"background-color: #d2c7c7;\r\n"
					+ "    width: 100%;\r\n"
					+ "    padding: 100%\r\n"
					+ "    color: rgb(26, 1, 1);\r\n"
					+ "    text-align: justify;\r\n"
					+ "    height: 100%;\"> Falha no login: email e/ou senha inválido(s)</html></body></h1>";
			
			PrintWriter writer = resp.getWriter();
			writer.println(valor);

		}
		
	}
	}