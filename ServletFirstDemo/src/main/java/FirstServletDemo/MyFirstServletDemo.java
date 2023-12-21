package FirstServletDemo;
import java.io.IOException;


import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class MyFirstServletDemo implements Servlet {
	

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		
		
	}
	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}
	@Override
	public String getServletInfo() {
		
		return null;
	}
	@Override
	public void destroy() {
		
		
	}
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("int");
		// TODO Auto-generated method stub
		
	}
	
	/*
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { PrintWriter out=
	 * resp.getWriter(); resp.setContentType("text/html");
	 * out.println("azad singh"); }
	 */

}
