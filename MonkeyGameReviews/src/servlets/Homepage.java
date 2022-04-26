package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodels.GameReview;
import util.UtilDBGamereview;

/**
 * Servlet implementation class Homepage
 */
@WebServlet("/Homepage")
public class Homepage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Homepage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("pageTitle", "Home");
		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Homepage.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title =  request.getParameter("gameName");
		String author =  request.getParameter("author");
		String  genre1 =  request.getParameter("genre1");
		String genre2 =  request.getParameter("genre2");
		String genre3 =  request.getParameter("genre3");
		String genre4 =  request.getParameter("genre4");
		String genre5 =  request.getParameter("genre5");
		String genre6 =  request.getParameter("genre6");
		String genreString = "";  
		String search = "<br>";
		String score= request.getParameter("rad");
		int scoreNum = -1; 
		List<GameReview> reviews;
		String output = "";
		if(!(title.equals(""))) {
			search += "  Game title: " + title + "<br>";
		}
		if(!(author.equals(""))) {
			search += "  Author: " + author + "<br>";
		}
		if(genre1 != null) {
			genreString += genre1 + ".";
			search += "  Genre: " + genre1 + "<br>";
		}
		if(genre2 != null) {
			genreString += genre2 + ".";
			search += "  Genre: " + genre2 + "<br>";
		}
		if(genre3 != null) {
			genreString += genre3 + ".";
			search += "  Genre: " + genre3 + "<br>";
		}
		if(genre4 != null) {
			genreString += genre4 + ".";
			search += "  Genre: " + genre4 + "<br>";
		}
		if(genre5 != null) {
			genreString += genre5 + ".";
			search += "  Genre: " + genre5 + "<br>";
		}
		if(genre6 != null) {
			genreString += genre6 + ".";
			search += "  Genre: " + genre6 + "<br>";
		}
		if(search.charAt(search.length() - 1) == '.') {
			search = search.substring(0, search.length() - 1);
		}
		if(score != null) {
			search += "  Score: " + score + "<br>";
			scoreNum = Integer.parseInt(score);
		}
		//String search = title + "<br>" + author + "<br>" + genre1 + "<br>"
			//	+ genre2 + "<br>" + genre3 + "<br>" + genre4 + "<br>" + 
				//genre5 + "<br>" + genre6 + "<br>" + score;
		
		request.setAttribute("search", search);
		reviews = UtilDBGamereview.listEntries(title, author, genreString, scoreNum);
		for(int i = 0; i < reviews.size(); i++) {
			output += reviews.get(i).toHtml();
		}
		request.setAttribute("output", output);
		doGet(request, response);
	}

}
