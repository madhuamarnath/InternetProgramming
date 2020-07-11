package com.rmkcet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleInterestServlet
 */
@WebServlet("/SimpleInterestServlet")
public class SimpleInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SimpleInterestServlet() {
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
		int p = Integer.parseInt(request.getParameter("principal"));
		int n = Integer.parseInt(request.getParameter("term"));
		double r = Double.parseDouble(request.getParameter("rate"));
		double si = (p * n * r) / 100;

		response.setContentType("text/html");
		// get response writer
		PrintWriter out = response.getWriter();

		// build HTML code
		StringBuilder htmlResponse = new StringBuilder(
				"<html> <head><title>Simple Ineterest Calculator</title></head>");
		htmlResponse.append("<body>SimpleInterest=");
		htmlResponse.append(si);
		htmlResponse.append("</body></html>");
		out.println(htmlResponse.toString());
		doGet(request, response);
	}

}
