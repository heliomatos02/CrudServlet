package br.com.crud.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crud.entidades.Banco;

@WebServlet("/listarPessoas")
public class ListarPessoas extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		RequestDispatcher rd = request.getRequestDispatcher("/listarPessoas.jsp");
		request.setAttribute("pessoas", banco.getListaEmpresa());
		rd.forward(request, response);
	}

}
