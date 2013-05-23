package illustratingOOP;

public abstract class Human {
	String name ;
	char gender ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Human()
	{
		this("NoName",'m');
	}
	public Human(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}
	//abstract methods:
	public abstract boolean isWorking();
	public abstract boolean isStudying() ;
}
