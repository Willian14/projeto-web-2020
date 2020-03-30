import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/cliente.do", "/clienteController", "/clienteservlet"})	
public class ClienteServlet extends HttpServlet{
	
	
			
	
	public ClienteServlet() {
		
		super();
		System.out.println("Construindo o servlet....");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Inicializando o Servlet...");
		
		super.init();
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Chamou Service....");
		super.service(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método Get!!!!");
		System.out.println("Chamou pelo método Get");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*resp.getWriter().print("Chamou pelo método Post!!!");
		System.out.println("Chamou pelo método Post!!!");*/
		
		String email = req.getParameter("email");
		
		resp.getWriter().print("Chamou pelo método Post " + "com o email " + email + " !");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método Delete!");
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Chamou pelo método Put!");
		System.out.println("chamou pelo método Put!!");
	}
	
	@Override
	public void destroy() {
		System.out.println("Destruindo Servlet!!!");
		super.destroy();
	}

}
