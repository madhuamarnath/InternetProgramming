package rmkcet;

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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int p = Integer.parseInt(request.getParameter("principal"));
		int n = Integer.parseInt(request.getParameter("term"));
		double  r= Double.parseDouble(request.getParameter("rate"));
		double si = (p*n*r)/100;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>" + "Simple Interest Calculation!</title></head>");
		out.println("<body><h1>Simple Interest Calculation!</h1>");
		out.println("Interest="+si);
		out.println("</body></html>");  
	}

}
