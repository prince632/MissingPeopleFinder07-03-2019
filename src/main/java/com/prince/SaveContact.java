package com.prince;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prince.entities.Contact;
public class SaveContact extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//read the data
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String message=request.getParameter("message");

		Contact c=new Contact(email,name,message);
		ContactDAO co=new ContactDAO();
		co.addContact(c);
		
		response.sendRedirect("Display.jsp");
		
	}

}