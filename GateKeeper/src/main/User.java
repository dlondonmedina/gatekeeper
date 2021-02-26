package main;
/**
 * 
 * @author Dylan Medina
 *
 */
public class User {
	// User name
	// Date joined
	// Deleted
	// Master Password
	private String firstName;
	private String lastName;
	private String username;
	private String email;
	private boolean deleted = false;
	private String password;
	
	/*
	 * Class constructor
	 * @param firstName a String for the first name.
	 * @param lastName a String for the last name.
	 * @return Nothing 
	 */
	
	public User(String fname, String lname, String uname, String email, String password) {
		this.firstName = fname;
		this.lastName = lname;
		this.username = uname;
		this.email = email;
		// Hash this.
		this.password = password;
		
	}
	
	// SETTERS
	
	/*
	 * Reset user first and last name.
	 * @param firstName a String for the first name.
	 * @param lastName a String for the last name.
	 * @return Nothing 
	 */
	public void resetName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/*
	 * Reset user email
	 * @param email a String for the User email
	 * @return Nothing
	 */
	public void resetEmail(String email) {
		this.email = email;
	}
	
	/*
	 * Reset user password using encryption
	 * @param password a String for the user password
	 * @return Nothing
	 */
	public void resetPassword(String password) {
		this.password = password;
	}
	
	/*
	 * Delete the User
	 */
	public void deleteUser() {
		this.deleted = true;
	}
	
	// Getters
	
	/*
	 * Get the user's first name.
	 * @return String user's first name. 
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/*
	 * Get the user's last name.
	 * @return String user's last name. 
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/*
	 * Get the user's email.
	 * @return String user's email. 
	 */
	public String getEmail() {
		return this.email;
	}
	
	/*
	 * Get the user's username.
	 * @return String user's username. 
	 */
	public String getUsername() {
		return this.username;
	}
	
	/*
	 * Check the user is deleted or not.
	 * @return boolean True if deleted, false if not. 
	 */
	public boolean isDeleted() {
		return this.deleted;
	}
	
	/*
	 * Check the user's password.
	 * @param password String password to check against the user.
	 * @return boolean true if password matches. False if no.
	 */
	public boolean checkPassword(String password) {
		if (this.checkPasswordHash(password)) { return true; }
		return false;
	}
	
	private boolean checkPasswordHash(String password) {
		// hash the password
		
		// compare against this password
		if (password == this.password) { return true; }
		return false;
	}
}
