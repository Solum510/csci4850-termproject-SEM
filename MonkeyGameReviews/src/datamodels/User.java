package datamodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 * CREATE TABLE users(
 * 	id INT NOT NULL AUTO_INCREMENT,
 * 	USERNAME VARCHAR(100) NOT NULL,
 *  PASS VARCHAR(100) NOT NULL,
 *  PRIMARY KEY (id));
 *
 */
@Entity
@Table(name= "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "USERNAME")
	private String username;
	
	
	@Column(name = "PASS")
	private String pass;
	
	
	
	public User(Integer id, String user, String pass) {
		this.id = id;
		this.username = user;
		this.pass = pass;
	}
	
	public User(String user, String pass) {
		this.username = user;
		this.pass = pass;
	}
	
	public void setUsername(String user) {
		this.username = user;
	}
	
	public void setPassword(String pass) {
		this.pass = pass;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.pass;
	}
}


