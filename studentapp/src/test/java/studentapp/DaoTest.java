package studentapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DaoTest {
	@BeforeClass
	public static void display3() {
		// create object or instance for the testing
		// initial invoked method
		System.out.println("Hello Test case Started in DAO");
	}
	
	@AfterClass
	public static void display4() {
		// closing // finally block
		// Final invoked method
		System.out.println("Hello Test case Ended in DAO");
	}
	
	@Test
	public void test1() {
		//test logics		
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		assertNotNull(con);
	}
}
