package jdbcConectivity;

public class DbConnection {

	public DbConnection() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Connection conn = null;
//        try {
//            // Step 1: Load the JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");
//
//            // Step 2: Establish a connection
//            conn = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
//
//            // Step 3: Create a statement
//            Statement stmt = conn.createStatement();
//
//            // Step 4: Execute a query
//            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
//
//            // Step 5: Process the result set
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                System.out.println("ID: " + id + ", Name: " + name);
//            }
//
//            // Step 6: Close the connection
//            conn.close();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
	}

}
