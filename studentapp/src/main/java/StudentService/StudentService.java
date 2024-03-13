package StudentService;

import dao.StudentDAO;
import model.Student;

public class StudentService {
	private StudentDAO stService;
	public StudentService() {
		stService = new StudentDAO();
	}
	
	//method receive the request from client
	public Student getStudentByRollno(int rollno) {
		return stService.fetchStudent(rollno);
	}
}
