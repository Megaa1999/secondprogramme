

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String a =request.getParameter("uname");
		 String b =request.getParameter("pword");
		 
		 if(a.equals("megaa") && (b.equals("jarvis")))
		 {
			 response.sendRedirect("welcome.jsp");
		 }else
		 {
			 response.sendRedirect("error.jsp");
		 }
	}

}
