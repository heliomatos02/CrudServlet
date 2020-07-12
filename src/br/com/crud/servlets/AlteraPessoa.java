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
		String dataNascimento = request.getParameter("data");
		String id = request.getParameter("id");
		String cpf = request.getParameter("cpf");
		Integer idpessoa = Integer.parseInt(id);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dataNascimentoFormatada = null;
		
		try {
			dataNascimentoFormatada = sdf.parse(dataNascimento);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Pessoa pessoa = banco.buscaPessoaPeloId(idpessoa);
		pessoa.setNome(nome);
		pessoa.setDataNascimento(dataNascimentoFormatada);
		pessoa.setCpf(cpf);
		response.sendRedirect("index.jsp");
	}

}
