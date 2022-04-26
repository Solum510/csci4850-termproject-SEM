package servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datamodels.User;
import util.UtilDBUser;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String error = "<p style=\"color:#ff0000;\">Invalid username/password</p>";
    String none = "";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("pageTitle", "Login");
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/LogIn.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Uname, Pass
		String username = request.getParameter("Uname");
		String password = request.getParameter("Pass");
		try {
			List<User> get = UtilDBUser.listEntries(username, password);
			if(get.size() > 0) {
				HttpSession session = request.getSession();
				session.setAttribute("user",  get.get(0));
				response.sendRedirect("Homepage");
			} else {
				request.setAttribute("error", error);
				RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/LogIn.jsp");
				dispatcher.forward(request, response);
			}
		} catch(Exception e) {
			throw new ServletException(e);
		}
	}

}
