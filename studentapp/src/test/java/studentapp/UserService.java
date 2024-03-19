package studentapp;

interface UserDAO {
    boolean exists(String username);
} 
public class UserService {
	private final UserDAO userDAO;
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public boolean isValidUser(String username) {
        return userDAO.exists(username);
    }
    
}


