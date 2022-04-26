package servlets;

import java.io.IOException;

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
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pageTitle", "Create Account");
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/CreateAccount.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String username = request.getParameter("Uname");
		String password = request.getParameter("Pass");
		if(username != null &&  password != null && UtilDBUser.listEntries(username).size() > 0) {
		    String error = "<p style=\"color:#ff0000;\">account already exists</p>";
			request.setAttribute("error", error);
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/CreateAccount.jsp");
			dispatcher.forward(request, response);
		} else {
			UtilDBUser.createEntries(username, password);
			User user = UtilDBUser.listEntries(username, password).get(0);
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("Homepage");
		}
		
	}

}
