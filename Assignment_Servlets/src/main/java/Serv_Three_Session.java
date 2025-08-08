

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Serv_Three_Session")
public class Serv_Three_Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Serv_Three_Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("NAME");
	        String pass = request.getParameter("PASSWORD");

	        HttpSession session = request.getSession();
	        session.setAttribute("name", name);
	        session.setAttribute("password", pass);

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<h2>Data saved in session successfully!</h2>");
	        out.println("<a href='Serv_Three_SecondSession'>Go to Second Servlet</a>");
	}

}
