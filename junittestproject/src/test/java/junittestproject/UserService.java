package junittestproject;



//DAO Layer
interface UserDAO{
	boolean isStudentExist(String name);
	// verify the student present in the DB or not based student name
}

//service Layer
public class UserService {
	private final UserDAO userDAO;
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public boolean checkStudent(String username) {
        return userDAO.isStudentExist(username);
    }
}
