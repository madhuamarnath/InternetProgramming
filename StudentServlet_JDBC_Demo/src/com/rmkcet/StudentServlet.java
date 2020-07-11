package com.rmkcet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StudentDAO studentDAO = new StudentDAO();
		int regno = Integer.parseInt(request.getParameter("regno"));
		StudentBean studentBean = studentDAO.getRecord(regno);
		response.setContentType("text/html");
		// get response writer
		PrintWriter out = response.getWriter();

		// build HTML code
		StringBuilder htmlResponse = new StringBuilder(
				"<html> <head><title>Welcome to Student Search Portal</title></head>");
		htmlResponse.append("<body> Details of Register Number ");
		htmlResponse.append(regno);
		htmlResponse.append("<br>");
		htmlResponse.append(studentBean.getRegisterNumber());
		htmlResponse.append("<br>");
		htmlResponse.append(studentBean.getName());
		htmlResponse.append("<br>");
		htmlResponse.append(studentBean.getCgpa());
		htmlResponse.append("<br>");
		htmlResponse.append(studentBean.getDepartmentID());
		htmlResponse.append("<br>");

		htmlResponse.append("</body></html>");

		out.println(htmlResponse.toString());
		doGet(request, response);
	}

}
