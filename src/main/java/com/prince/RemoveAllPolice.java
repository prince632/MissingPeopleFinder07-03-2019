package com.prince;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.prince.DAO.PoliceDAO;

public class RemoveAllPolice extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String s[] = request.getParameterValues("id");
		PoliceDAO dao = new PoliceDAO();
		for (String id : s) {
			dao.removeById(id);
		}
		response.sendRedirect("TerminatePolice.jsp");
	}
}
