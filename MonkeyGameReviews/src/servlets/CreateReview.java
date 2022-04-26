package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.ReadFile;

/**
 * Servlet implementation class CreateReview
 */
@WebServlet("/CreateReview")
public class CreateReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String redirect = "<p>You must be logged in to create a review. Please <a href=\"Login\">login.</a></p>";
	private String norm = "<form action=CreateReview method=post>\r\n" + 
			"	       <label for=\"gameName\">Game Title:</label><br>\r\n" + 
			"			<input type=\"text\" id=\"gameName\" name=\"gameName\"><br><br>\r\n" + 
			"			<label for=\"gameName\">Genres:</label><br>\r\n" + 
			"			<div class=\"grid\"><input type=\"checkbox\" id=\"genre1\" name=\"genre1\" value=\"Action\">\r\n" + 
			"			<label for=\"genre1\">Action</label>\r\n" + 
			"			</div>\r\n" + 
			"			<div class=\"grid\"><input type=\"checkbox\" id=\"genre2\" name=\"genre2\" value=\"Role-Playing\">\r\n" + 
			"			<label for=\"genre2\">Role-Playing</label></div>\r\n" + 
			"			<div class=\"grid\"><input type=\"checkbox\" id=\"genre3\" name=\"genre3\" value=\"Strategy\">\r\n" + 
			"			<label for=\"genre3\">Strategy</label></div><br>\r\n" + 
			"			<div class=\"grid\"><input type=\"checkbox\" id=\"genre4\" name=\"genre4\" value=\"Adventure & Casual\">\r\n" + 
			"			<label for=\"genre4\">Adventure & Casual</label></div>\r\n" + 
			"			<div class=\"grid\"><input type=\"checkbox\" id=\"genre5\" name=\"genre5\" value=\"Simulation\">\r\n" + 
			"			<label for=\"genre5\">Simulation</label></div><br>\r\n" + 
			"			<div class=\"grid\"><input type=\"checkbox\" id=\"genre6\" name=\"genre6\" value=\"Sports & Racing\">\r\n" + 
			"			<label for=\"genre6\">Sports & Racing</label></div><br><br>\r\n" + 
			"			<p>Rating:</p>\r\n" + 
			"			<div class=\"grid\"><input type=\"radio\" id=\"1star\" name=\"rad\" value=\"1\">\r\n" + 
			"			<label for=\"1star\">1 star</label></div>\r\n" + 
			"			<div class=\"grid\"><input type=\"radio\" id=\"2star\" name=\"rad\" value=\"2\">\r\n" + 
			"			<label for=\"2star\">2 stars</label></div>\r\n" + 
			"			<div class=\"grid\"><input type=\"radio\" id=\"3star\" name=\"rad\" value=\"3\">\r\n" + 
			"			<label for=\"3star\">3 stars</label></div><br>\r\n" + 
			"			<div class=\"grid\"><input type=\"radio\" id=\"4star\" name=\"rad\" value=\"4\">\r\n" + 
			"			<label for=\"4star\">4 stars</label></div>\r\n" + 
			"			<div class=\"grid\"><input type=\"radio\" id=\"5star\" name=\"rad\" value=\"5\">\r\n" + 
			"			<label for=\"5star\">5 stars</label></div><br><br>\r\n" + 
			"			<label for=\"review\">Review:</label><div></div>\r\n" + 
			"			<textarea rows=\"5\" cols=\"60\" name=\"review\" id=\"review\"></textarea><br><br>\r\n" + 
			"			<input type=\"submit\" value=\"Create Review\">\r\n" + 
			"	   </form>";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateReview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			request.setAttribute("output", redirect);
		} else {
			request.setAttribute("output", norm);
		}
		request.setAttribute("pageTitle", "Create Review");
		
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/CreateReview.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String review = request.getParameter("review");
		//request.setAttribute("review", review);
		//String filepath = "/WEB-INF/reviews.csv";
		//ReadFile.createReviews(getServletContext(), filepath);
		//doGet(request, response);
	}

}
