package com.cts.jwa.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.jwa.model.Contact;
import com.cts.jwa.service.ContactsService;

@WebServlet("/")
public class DefaultController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ContactsService service;
	
	public void init(ServletConfig config) throws ServletException {
		service = new ContactsService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		String view = "";
		
		switch(path){
			case "/":
				request.setAttribute("contactsList", service.getAll());
				view = "/contacts-page.jsp";
				break;
			case "/newContact":
				view = "/new-contact-page.jsp";
				break;
			case "/addContact":
				Contact c = new Contact();
				c.setId(Long.valueOf(request.getParameter("cid")));
				c.setName(request.getParameter("cnm"));
				c.setMobile(request.getParameter("mob"));
				service.add(c);
				request.setAttribute("contactsList", service.getAll());
				view = "/contacts-page.jsp";
				break;
			case "/delContact":
				long cid = Long.parseLong(request.getParameter("cid"));
				service.deleteById(cid);
				request.setAttribute("contactsList", service.getAll());
				view = "/contacts-page.jsp";
				break;
		}
		
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
