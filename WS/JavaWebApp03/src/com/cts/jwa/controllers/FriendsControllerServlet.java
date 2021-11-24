package com.cts.jwa.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/friends")
public class FriendsControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		
		List<String> friendsList1 = (List<String>) req.getAttribute("friendsList1");
		List<String> friendsList2 = (List<String>) session.getAttribute("friendsList2");
		
		if(friendsList1==null) friendsList1=new ArrayList<String>();
		if(friendsList2==null) friendsList2=new ArrayList<String>();
		
		String friendName = req.getParameter("fnm");

		if(friendName!=null) {
			friendsList1.add(friendName);
			friendsList2.add(friendName);
		}
		
		req.setAttribute("friendsList1",friendsList1);
		session.setAttribute("friendsList2",friendsList2);
		req.getRequestDispatcher("/friends-page.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
