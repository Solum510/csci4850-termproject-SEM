package datamodels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 * 	CREATE TABLE reviews(
 * 	id INT NOT NULL AUTO_INCREMENT,
 * 	TITLE VARCHAR(100) NOT NULL,
 * 	AUTHOR VARCHAR(100) NOT NULL,
 *  GENRES VARCHAR(100) NOT NULL,
 *  SCORE INT NOT NULL,
 *  BODY TEXT NOT NULL,
 *  PRIMARY KEY (id));
 *
 */
@Entity
@Table(name = "reviews")
public class GameReview {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "GENRES")
	private String genres;
	
	@Column(name = "SCORE")
	private Integer score;
	
	@Column(name = "BODY")
	private String body;
	
	public GameReview(Integer id, String title, String author, String genres, Integer score, String body) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.genres = genres;
		this.score = score;
		this.body = body;
	}
	
	public GameReview(String title, String author, String genres, Integer score, String body) {
			this.title = title;
			this.author = author;
			this.genres = genres;
			this.score = score;
			this.body = body;
	}
	
	public GameReview() {}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setGenres(String genres) {
		this.genres = genres;
	}
	public void setGenresFromArray(List<String> genres) {
		String result = "";
		for(int i = 0; i < genres.size(); i++) {
			result += genres.get(i);
			result += ".";
		}
		this.genres = result;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getGenres() {
		return this.genres;
	}
	
	public Integer getScore() {
		return this.score;
	}
	
	public String getBody() {
		return this.body;
	}
	
	public String toHtml() {
		String result = "<div class=\"entry\">" + 
				"		<div class=\"div-table-row\">" + 
				"			<img alt=\"game\" src=\"stock-vector-game-controller-gamepad-vector-icon.jpg\" width=15% height=15% align=left>" + 
				"			<p class=\"write\" style=\"font-weight: bold;\">" + this.title + "</p>" + 
				"			<p class=\"write\">Genres: "+ this.genres + "</p>" + 
				"			<p class=\"write\">Review by: "+ this.author + "</p>" + 
				"			<p class=\"write\">Rating: " + this.score + "</p>" + 
				"			<p class=\"write\">Review:</p>" + 
				"			<p class=\"write\">" + this.body + "</p>" + 
				"		</div></div><br>";
		
		return result;
	}
}
