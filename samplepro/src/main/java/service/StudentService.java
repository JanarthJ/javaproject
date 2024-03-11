package service;

import java.io.IOException;

import dao.StudentDAO;
import model.Student;

public class StudentService {
	private StudentDAO stService;
	public StudentService() throws IOException {
		stService = new StudentDAO();
	}
	
	//method receive the request from client
	public Student getStudentByRollno(int rollno) {
		return stService.fetchStudent(rollno);
	}
}
