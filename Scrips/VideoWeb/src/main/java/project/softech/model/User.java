package project.softech.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Username")
	private String username;

	@Column(name="Admin")
	private boolean admin;

	@Column(name="Email")
	private Object email;

	@Column(name="Fullname")
	private Object fullname;

	public User() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean getAdmin() {
		return this.admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public Object getFullname() {
		return this.fullname;
	}

	public void setFullname(Object fullname) {
		this.fullname = fullname;
	}

}