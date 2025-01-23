

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Book
 */
@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String venue=request.getParameter("Venue");
		String date=request.getParameter("Date");
		String time=request.getParameter("Time");
	    String email=request.getParameter("Email");
	    String mobilenumber=request.getParameter("MobileNumber");
	    String address=request.getParameter("Address");
	    
	    Long phn=Long.parseLong(mobilenumber);
	    JdbcConnection jdbc =new JdbcConnection();
	    DataOperations data=new DataOperations(jdbc.getConnection());
		data.createTable2();
		data.insertData1(venue,date,time,email,phn,address);
		
		response.sendRedirect("Payment.jsp");
		doGet(request, response);
	}

}
