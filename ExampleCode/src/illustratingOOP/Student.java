package illustratingOOP;

public class Student extends Human implements Printable {
	private int[] marks ;
	
	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public Student(String name,char gender,int[] marks)
	{
		super(name,gender) ;
		this.marks = marks;
	}
	
	//implements method from the interface Printable
	public void printInfo() {
		System.out.println("This is student info");
	}
	//implements abstract methods from the class Human
	public boolean isWorking(){
		return true ;
	}
	public boolean isStudying() 
	{
		return true; 
	}
}
