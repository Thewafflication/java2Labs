
public class Student extends Person
{
	private int studentNumber;
	
	public Student()
	{
		this(Person.noName, 0);
	}
	
	public Student(String name, int studentNumber)
	{
		super(name);
		this.studentNumber = studentNumber;
	}
	
	public int getStudentNumber()
	{
		return this.studentNumber;
	}
	
	public void setStudentNumber(int newNum)
	{
		this.studentNumber = newNum;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.printf("Student Number: %d\n", studentNumber);
	}
	
	public boolean equals(Student s)
	{
		return super.hasSameName((Person)s) 
			&& (this.getStudentNumber() == s.getStudentNumber());
	}
	
	public void reset(String name, int studentNumber)
	{
		
	}
}
