package servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.DataOperations;
import database.JdbcConnection;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String email = request.getParameter("Email");
		String password = request.getParameter("Password");
		
		System.out.println("Received parameters:");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    
        

        if (email == null || password == null) {
            response.getWriter().append("Email or password is missing");
            return;
        }

        JdbcConnection db = new JdbcConnection();
        DataOperations op = new DataOperations(db.getConnection());
        try {
        boolean isValidUser = op.logindata(email, password);
		if (isValidUser) {
			   response.sendRedirect("Homepage.jsp");
        } else {
        	response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Failed</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<script type='text/javascript'>");
            out.println("alert('Invalid email or password. Please try again.');");
            out.println("window.location.href = 'Login.jsp';"); // Redirect back to login page
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");

            out.close();
        }
    } catch (Exception e) {
        e.printStackTrace();
        response.getWriter().append("Error validating user: ").append(e.getMessage());
    }
}

	}


