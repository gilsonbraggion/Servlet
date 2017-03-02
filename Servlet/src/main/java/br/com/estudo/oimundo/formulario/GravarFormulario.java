package br.com.estudo.oimundo.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="formulario", urlPatterns={"/gravarFormulario"})
public class GravarFormulario extends HttpServlet {
	
	private static final long serialVersionUID = 1712124996930692398L;

	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String endereco = request.getParameter("endereco");
		
		out.println("		<!DOCTYPE html>													");
		out.println("		<html>                                                          ");
		out.println("		<head>                                                          ");
		out.println("		<meta charset=\"UTF-8\">                                          ");
		out.println("		<title>Os dados preenchidos foram</title>                             ");
		out.println("		</head>                                                         ");
		out.println("		<body>                                                          ");
		out.println("	<h2> Dados preenchidos foram :  </h2>                     ");
		out.println("			<form action=\"/Servlet/preencherFormulario\" method=\"post\">  ");
		out.println("			                                                            ");
		out.println("				<label for=\"\">Nome : "+nome+"</label>                           ");
		out.println("				<br />	                                                ");
		out.println("				<label for=\"\">Idade : "+idade+"</label>                           ");
		out.println("				<br />	                                                ");
		out.println("				<label for=\"\">Endereço : "+endereco+"</label>                        ");
		out.println("				<br />	                                                ");
		out.println("				                                                        ");
		out.println("				<input type=\"submit\" value=\"Voltar\"/>                   ");
		out.println("			</form>                                                     ");
		out.println("			                                                            ");
		out.println("		</body>                                                         ");
		out.println("		</html>                                                         ");
		
		
		
		
	}
	
	
	
}
