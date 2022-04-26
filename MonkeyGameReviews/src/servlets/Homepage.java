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
		String search = "<br>";
		String score= request.getParameter("rad");
		int scoreNum = -1; 
		List<GameReview> reviews;
		List<String> genres = new ArrayList<String>();
		String output = "";
		if(!(title.equals(""))) {
			search += "  Game title: " + title + "<br>";
		} else {
			title = null;
		}
		if(!(author.equals(""))) {
			search += "  Author: " + author + "<br>";
		} else {
			author = null;
		}
		if(genre1 != null) {
			search += "  Genre: " + genre1 + "<br>";
			genres.add(genre1);
		}
		if(genre2 != null) {
			search += "  Genre: " + genre2 + "<br>";
			genres.add(genre2);
		}
		if(genre3 != null) {
			search += "  Genre: " + genre3 + "<br>";
			genres.add(genre3);
		}
		if(genre4 != null) {
			search += "  Genre: " + genre4 + "<br>";
			genres.add(genre4);
		}
		if(genre5 != null) {
			search += "  Genre: " + genre5 + "<br>";
			genres.add(genre5);
		}
		if(genre6 != null) {
			genres.add(genre6);
			search += "  Genre: " + genre6 + "<br>";
		}
		if(score != null) {
			search += "  Score: " + score + "<br>";
			scoreNum = Integer.parseInt(score);
		}
		
		//String search = title + "<br>" + author + "<br>" + genre1 + "<br>"
			//	+ genre2 + "<br>" + genre3 + "<br>" + genre4 + "<br>" + 
				//genre5 + "<br>" + genre6 + "<br>" + score;
		
		request.setAttribute("search", search);
		reviews = UtilDBGamereview.listEntries(title, author, genres, scoreNum);
		for(int i = 0; i < reviews.size(); i++) {
			output += reviews.get(i).toHtml();
		}
		request.setAttribute("output", output);
		doGet(request, response);
	}

}
