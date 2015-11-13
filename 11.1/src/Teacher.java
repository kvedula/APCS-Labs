
public class Teacher extends Person{

	private double mySalary; //Teacher Salary
	private String mySubject; //Teacher job subject

	public Teacher(String name, int age, String gender, String subject, double salary) {
		super(name, age, gender);

		//Initialize what's new to the Teacher
		mySalary = salary;
		mySubject = subject;

	}

	public double getSalary(){
		return mySalary;
	}

	public String getSubject(){
		return mySubject;
	}


	public void setSalary(double salary){
		mySalary = salary;
	}

	public void mySubject(String subject){
		mySubject = subject;
	}



	// overrides the toString method in the parent class
	public String toString(){
		return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
	}

}










