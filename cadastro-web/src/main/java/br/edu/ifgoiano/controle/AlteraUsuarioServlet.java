package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidades.Usuario;
import br.edu.ifgoiano.repositorio.UsuarioRepositorio;

@WebServlet ("/alterarUsuario")

public class AlteraUsuarioServlet extends HttpServlet {
	
	@Override
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		Integer id = Integer.parseInt(req.getParameter("id"));
		
		UsuarioRepositorio repositorio = new UsuarioRepositorio();
		
		Usuario usuario = repositorio.obterUsuario(id);
		
		req.setAttribute("usuario", usuario);
		req.getRequestDispatcher("usuarioAlteracao.jsp").forward(req, resp);
	}
	
}
