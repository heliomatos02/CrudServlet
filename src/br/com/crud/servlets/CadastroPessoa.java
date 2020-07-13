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

@WebServlet("/cadastroPessoa")
public class CadastroPessoa extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Pessoa pessoa = new Pessoa();
		Banco banco = new Banco();
		
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		
		pessoa.setCpf(cpf);
		pessoa.setNome(nome);
		banco.adiciona(pessoa);
		resp.sendRedirect("index.jsp");
	}
}
