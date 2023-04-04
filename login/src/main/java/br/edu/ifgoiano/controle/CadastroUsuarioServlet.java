package br.edu.ifgoiano.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.edu.ifgoiano.entidade.Usuario;


@WebServlet("/cadastrarUsuario")
public class CadastroUsuarioServlet extends HttpServlet {
	
	// Simular o Banco de Dados
	private List<Usuario> lstDeUsuario;
	
	
	
	@Override  //escreva "init", dá ctrl espaço e clica na primeira opção
	public void init() throws ServletException {
		this.lstDeUsuario = new ArrayList<Usuario>();
	}
		
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String senha1 = req.getParameter("senha1");
		String senha2 = req.getParameter("senha2");
	
		
		//Verificar se as senhas são iguais

		
		if(senha1.equals(senha2)) {
			Usuario usu = new Usuario(); //Criar um objeto Usuario
			usu.setNome(req.getParameter("name")); //Popular os atributos do objeto com os valores do formulário
			usu.setEmail(req.getParameter("email")); //Popular os atributos do objeto com os valores do formulário
			usu.setSenha(req.getParameter("senha1"));//Popular os atributos do objeto com os valores do formulário
			usu.setDataNascimento(req.getParameter("dataNascimento"));
			lstDeUsuario.add(usu); //Incluir o objeto no repositório
			
			//redirecionar o usuário para a página de login
			resp.sendRedirect("index.html");
		}else {
			//redirecionar o usuário para a página de cadastro de usuário
			req.getRequestDispatcher("TelaCadastro.html").forward(req, resp);
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		for (Usuario usuario : lstDeUsuario) {
			System.out.println(usuario.getNome().concat("-").concat(usuario.getEmail().concat(usuario.getDataNascimento())));
		}
	}
	
	@Override //Escrever dest e dar ctrl espaço e clicar na primeira opção
	public void destroy() {
		this.lstDeUsuario.clear();
	}
}