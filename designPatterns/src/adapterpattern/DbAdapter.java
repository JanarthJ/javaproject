package adapterpattern;

public class DbAdapter implements Student{
		private Children cc; //cc- reference variable with type Children
		public DbAdapter(Children cc) {
			this.cc = cc;
		}
	
	@Override
	public String getStudentName() {
		// TODO Auto-generated method stub
		return this.cc.getFirstName() + this.cc.getLastName();
	}

	@Override
	public String getStudentRoll() {
		// TODO Auto-generated method stub
		return this.cc.getRollNo();
	}

	@Override
	public String getStudentAddress() {
		// TODO Auto-generated method stub
		return this.cc.getAddress();
	}

	@Override
	public int getStudentAge() {
		// TODO Auto-generated method stub
		return this.cc.getAge();
	}
	
	public String toString() {
		return "Name : "+ this.cc.getFirstName() + this.cc.getLastName() + " Roll : "+this.cc.getRollNo();
	}
}
