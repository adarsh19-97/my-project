

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MusicServ
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String name=request.getParameter("Name");
		String email=request.getParameter("Email");
		String password=request.getParameter("Password");
	    String mobilenumber=request.getParameter("MobileNumber");
	    
	    Long phn=Long.parseLong(mobilenumber);
	    JdbcConnection jdbc =new JdbcConnection();
	    DataOperations da=new DataOperations(jdbc.getConnection());
		da.createTable();
		da.insertData(name,email,password,phn);
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login Failed</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<script type='text/javascript'>");
        out.println("alert('Registered Successfully');");
        out.println("window.location.href = 'Login.jsp';"); // Redirect back to login page
        out.println("</script>");
        out.println("</body>");
        out.println("</html>");

        out.close();
		response.sendRedirect("Login.jsp");
		doGet(request, response);
	}

}
