package br.com.estudo.oimundo.formulario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="preencherFormulario", urlPatterns={"/preencherFormulario"})
public class PreencherFormulario extends HttpServlet {
	
	private static final long serialVersionUID = -1630853335904567083L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>                                                     ");
		out.println("<html>                                                              ");
		out.println("<head>                                                              ");
		out.println("<meta charset=\"UTF-8\">                                            ");
		out.println("<title>Preencher Formulário</title>                                 ");
		out.println("</head>                                                             ");
		out.println("<body>                                                              ");
		out.println("	<h2> Preencher o formulário em questão </h2>                     ");
		out.println("	<form action=\"/Servlet/gravarFormulario\" method=\"post\">              ");
		out.println("		<label for=\"nome\">Nome :</label>                           ");
		out.println("		<input type=\"text\" id=\"nome\" name=\"nome\" />            ");
		out.println("		<br />	                                                     ");
		out.println("		<label for=\"idade\">Idade :</label>                         ");
		out.println("		<input type=\"text\" id=\"idade\" name=\"idade\" />          ");
		out.println("		<br />	                                                     ");
		out.println("		<label for=\"endereco\">Endereço :</label>                   ");
		out.println("		<input type=\"text\" id=\"endereco\" name=\"endereco\" />    ");
		out.println("		<br />	                                                     ");
		
		out.println(" <input type=\"submit\" value=\"Enviar\"/>  						");
		
		
		out.println("	</form>                                                          ");
		out.println("	                                                                 ");
		out.println("</body>                                                             ");
		out.println("</html> ");
				
		
	}
	
}
