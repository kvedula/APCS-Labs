
public class CollegeStudent extends Student{
	
	private int myYear; //College Student Year
	private String myMajor; //College Student Major

	public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
		super(name, age, gender, idNum, gpa);
		
		myYear = year;
		myMajor = major;
		
	}
	
	
	

	public int getYear(){
		return myYear;
	}

	public String getMajor(){
		return myMajor;
	}


	public void setYear(int year){
		myYear = year;
	}

	public void myMajor(String major){
		myMajor = major;
	}



	// overrides the toString method in the parent class
	public String toString(){
		return super.toString() + ", year: " + myYear + ", major: " + myMajor + ".";
	}

}










