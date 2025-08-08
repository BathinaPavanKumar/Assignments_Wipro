

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Serv_Three_SecondSession")
public class Serv_Three_SecondSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Serv_Three_SecondSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false); // false: don't create if not exist

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            String password = (String) session.getAttribute("password");

            out.println("<h2>Welcome, " + name + "</h2>");
            out.println("<p>Your password is: " + password + "</p>");
        } else {
            out.println("<h2>No session found. Please login first.</h2>");
        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
