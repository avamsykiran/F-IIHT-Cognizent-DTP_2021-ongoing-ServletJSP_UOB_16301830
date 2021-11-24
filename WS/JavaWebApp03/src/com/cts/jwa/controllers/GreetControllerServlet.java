package com.cts.jwa.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.jwa.service.WelcomeService;
import com.cts.jwa.service.WelcomeServiceImpl;

@WebServlet("/")
public class GreetControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private WelcomeService welcomeService;

	@Override
	public void init() throws ServletException {
		this.welcomeService = new WelcomeServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userName = req.getParameter("unm");

		if (userName == null)
			userName = "Nobody";
		
		req.setAttribute("msg", welcomeService.getWelcomeText() + " " + userName);
		req.getRequestDispatcher("/greet-page.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
