package br.com.crud.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.crud.entidades.Banco;
import br.com.crud.entidades.Pessoa;


@WebServlet("/alteraPessoa")
public class AlteraPessoa extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String id = request.getParameter("id");
		
		Integer idpessoa = Integer.parseInt(id);
		
		Banco banco = new Banco();
		Pessoa pessoa = banco.buscaPessoaPeloId(idpessoa);
		pessoa.setNome(nome);
		response.sendRedirect("index.jsp");
	}

}
