package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import main.User;

class UserTest {
	
	private  User u;
	
	@BeforeEach
	void initAll() {
		u = new User("J", "D", "jdb", "jd@e.local", "aTestpassword4@me");
	}
	
	@Test
	@DisplayName("Testing the Constructor.")
	void testUser() {
		User u2 = new User("John", "Doe", "jdoeboy" , "j.doe@example.local", "Test Password");
		assertEquals("John", u2.getFirstName());
		assertEquals("Doe", u2.getLastName());
		assertEquals("jdoeboy", u2.getUsername());
		assertEquals("j.doe@example.local", u2.getEmail());
		assertTrue(u2.checkPassword("Test Password"));
		assertFalse(u2.isDeleted());
	}

	@Test
	void testResetName() {
		u.resetName("D", "J");
		String fname = u.getFirstName();
		String lname = u.getLastName();
		assertEquals(fname + lname, "DJ");
	}

	@Test
	void testResetEmail() {
		u.resetEmail("dj@e.local");
		assertEquals("dj@e.local", u.getEmail());
	}

	@Test
	void testResetPassword() {
		u.resetPassword("A bad password");
		assertTrue(u.checkPassword("A bad password"));
	}

	@Test
	void testDeleteUser() {
		u.deleteUser();
		assertTrue(u.isDeleted());
	}
	
	@Test
	void testGetFirstName() {
		assertEquals("J", u.getFirstName());
	}

	@Test
	void testGetLastName() {
		assertEquals("D", u.getLastName());
	}

	@Test
	void testGetEmail() {
		assertEquals("jd@e.local", u.getEmail());
	}

	@Test
	void testGetUsername() {
		assertEquals("jdb", u.getUsername());
	}

	@Test
	void testCheckPassword() {
		assertTrue(u.checkPassword("aTestpassword4@me"));
	}
	
}
