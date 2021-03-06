public class Student {
	//1. A student must have an ID, a name, a gender, a GPA, and an array of records for each module they have
	//been enrolled.
	//2. The ID and name cannot be null.
	//3. The ID must be unique.
	//4. The gender should be represented by one of the following characters: ‘F’, ‘M’, or ‘X’. The student can
	// also prefer not to disclose this information, thus gender can be an empty field.
	//5. The grade point average (GPA) is the average of student record final scores
	// (the explanation of Student Record is below in the O cial Transcript example).
	//6. The system must be able to generate a transcript containing all student records,
	// grouped by year and term. Implement the function public String printTranscript() using the following format:
	//refer to mark scheme sheet
	private int id;
	
	private String name;
	
	private char gender;
	
	private double gpa;
	
	private StudentRecord[] records;

	public String printTranscript() {
		// do something
		return "";
	}

	public Student(int i, String n, char g){
		id = i;
		name = n;
		gender = g;

	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public char getGender(){
		return gender;
	}
}
