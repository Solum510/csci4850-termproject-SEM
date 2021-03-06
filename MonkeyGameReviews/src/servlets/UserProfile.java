package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import datamodels.GameReview;
import datamodels.User;
import util.UtilDBGamereview;

/**
 * Servlet implementation class UserProfile
 */
@WebServlet("/UserProfile")
public class UserProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pageTitle", "User Profile");
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		String reviewString = "";
		if(user != null) {
			request.setAttribute("username", user.getUsername());
			List<GameReview> reviews = UtilDBGamereview.listEntries(null, user.getUsername(), new ArrayList<String>(), -1);
			for(int i = 0; i < reviews.size(); i++) {
				reviewString += reviews.get(i).toHtml();
			}
			request.setAttribute("reviews", reviewString);
			
		} else {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/UserProfileRD.jsp");
			view.forward(request,response);

		}
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/UserProfile.jsp");
		
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session = request.getSession();
		session.setAttribute("user", null);
		response.sendRedirect("Login");
	}

}
