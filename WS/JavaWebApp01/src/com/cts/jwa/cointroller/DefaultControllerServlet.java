package com.cts.jwa.cointroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.jwa.service.WelcomeService;
import com.cts.jwa.service.WelcomeServiceImpl;

/**
 * 
 * '/' indicates the context root path (context means our web app)
 * 'http://localhost:PORT/ProjectName' is the context root url.
 */
@WebServlet("/")
public class DefaultControllerServlet extends HttpServlet{

	private WelcomeService welcomeService;
	
	@Override
	public void init() throws ServletException {
		this.welcomeService=new WelcomeServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<h2>"+welcomeService.getWelcomeText()+"</h1>");
		out.println("</body></html>");
	}

	
}
