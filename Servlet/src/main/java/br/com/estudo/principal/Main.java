package br.com.estudo.principal;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="inicial", urlPatterns={"/"})
public class Main extends HttpServlet {
	
	private static final long serialVersionUID = -6499192554906295652L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		req.setAttribute("nome", "Gilson Braggionnn");
		req.setAttribute("dataAtual", new Date());
		req.getRequestDispatcher("/principal/bemVindo.jsp").forward(req, resp);
	}
	
	public void init(ServletConfig config) throws ServletException {
        super.init(config);
        log("Iniciando a servlet");
    }
	
	public void destroy() {
        super.destroy();
        log("Destruindo a servlet");
    }
	
}
