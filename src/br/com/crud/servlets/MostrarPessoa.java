package br.com.crud.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crud.entidades.Banco;
import br.com.crud.entidades.Pessoa;


@WebServlet("/mostraPessoa")
public class MostrarPessoa extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parametroId = request.getParameter("id");
		Integer id = Integer.parseInt(parametroId);
		Banco banco = new Banco();
		
		Pessoa pessoa = banco.buscaPessoaPeloId(id);
		
		request.setAttribute("pessoa", pessoa);
		RequestDispatcher rd = request.getRequestDispatcher("/alterarPessoa.jsp");
		
		rd.forward(request, response);
	}
}
