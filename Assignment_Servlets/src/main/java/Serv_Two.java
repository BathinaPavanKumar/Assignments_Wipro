

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Serv_Two")
public class Serv_Two extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Serv_Two() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name= request.getParameter("NAME");
	String pass= request.getParameter("PASSWORD");
	
	
	if ("admin".equals(name) && "wipro".equals(pass)) {
       
        RequestDispatcher rd = request.getRequestDispatcher("SuccessServlet");
        rd.forward(request, response);
    } else {
       
        RequestDispatcher rd = request.getRequestDispatcher("Fail.html");
        rd.forward(request, response);
    }
	
	}

}
