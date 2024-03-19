package adapterpattern;

import java.util.ArrayList;
import java.util.List;

public class AdapterMain {

	public static void main(String[] args) {
		// stud -- education departments student details Database
		List<Student> studDb = new ArrayList<>();
		//
		// education departments student details Database
		
		// TODO Auto-generated method stub
		CollegeStundent c1 = new CollegeStundent("Jk","100","Chennai",20);
		CollegeStundent c2 = new CollegeStundent("JJ","101","Chennai",20);
		studDb.add(c1);
		studDb.add(c2);
		 
		Children child1 = new Children("Jack","hary","1000","Chennai",15);
//		System.out.println(child1);
		studDb.add(new DbAdapter(child1));		
		for(Student st : studDb) {
			System.out.println(st);
		}
		
	}

}
