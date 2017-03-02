package br.com.estudo.oimundo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OiServlet3", urlPatterns = { "/param" }, initParams = {
		@WebInitParam(name = "param1", value = "value1"), @WebInitParam(name = "param2", value = "value2") })
public class TesteParam extends HttpServlet {

	private static final long serialVersionUID = 5428136212947227203L;

	private String parametro1;
	private String parametro2;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.parametro1 = config.getInitParameter("param1");
		this.parametro2 = config.getInitParameter("param2");
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<h2>Exemplo com InitParam Servlet </h2>");

		ServletConfig config = getServletConfig();
		String parametro1 = config.getInitParameter("param1");
		out.println("Valor do Parametro 1 : " + parametro1);

		out.print("<br />");
		
		String parametro2 = config.getInitParameter("param2");
		out.println("Valor do Parametro 2 : " + parametro2);

		out.close();

	}

	public String getParametro1() {
		return parametro1;
	}

	public void setParametro1(String parametro1) {
		this.parametro1 = parametro1;
	}

	public String getParametro2() {
		return parametro2;
	}

	public void setParametro2(String parametro2) {
		this.parametro2 = parametro2;
	}

}
