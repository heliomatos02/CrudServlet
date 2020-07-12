package br.com.crud.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crud.entidades.Banco;

@WebServlet("/removePessoa")
public class RemovePessoa extends HttpServlet {

	private static final long serialVersionUID = -7635250872957828938L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametroId = request.getParameter("id");
		Integer id = Integer.parseInt(parametroId);
		Banco banco = new Banco();
		banco.removePessoa(id);
		response.sendRedirect("index.jsp");
	}
}
