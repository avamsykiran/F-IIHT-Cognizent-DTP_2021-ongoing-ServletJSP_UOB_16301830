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
 * '/arth' indicates 'http://localhost:PORT/ProjectName/arth' 
 */
@WebServlet("/arth")
public class ArithmeticControllerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String op1 = req.getParameter("op1");
		String op2 = req.getParameter("op2");
		String btn = req.getParameter("btn");
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("<form>");
		out.println("<label>Operand1 <input type='number' name='op1'/></label>");
		out.println("<label>Operand2 <input type='number' name='op2'/></label>");
		out.println("<button name='btn' value='sum'>Sum</button>");
		out.println("<button name='btn' value='dif'>Difference</button>");
		out.println("<button name='btn' value='prd'>Product</button>");
		out.println("<button name='btn' value='qut'>Quetiont</button>");
		out.println("<button name='btn' value='rem'>Reminder</button>");
		out.println("</form>");
		
		if(op1!=null && op2!=null) {
			int n1 = Integer.parseInt(op1);
			int n2 = Integer.parseInt(op2);
			
			switch(btn) {
			case "sum":out.print("<hr /><p><strong>Sum is "+(n1+n2)+"</strong></p>"); break;
			case "dif":out.print("<hr /><p><strong>Dif is "+(n1-n2)+"</strong></p>"); break;
			case "prd":out.print("<hr /><p><strong>Prd is "+(n1*n2)+"</strong></p>"); break;
			case "qut":out.print("<hr /><p><strong>Qut is "+(n1/n2)+"</strong></p>"); break;
			case "rem":out.print("<hr /><p><strong>Rem is "+(n1%n2)+"</strong></p>"); break;
			}
			
		}
		out.println("</body></html>");
	}

	
}
