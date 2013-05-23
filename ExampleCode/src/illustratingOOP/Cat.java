package illustratingOOP;

public class Cat extends Animal {

	private String breed;
	
	public String getBreed()
	{
		return breed;
	}
	public void setBreed(String breed)
	{
		this.breed = breed ;
	}
	public Cat(String name, String color, String breed)
	{
		super(name,color);
		this.breed = breed;
	}
	public Cat()
	{
		super();
		this.breed = "Persian" ;
	}
	public void printAnimalInfo()
	{
		System.out.println("name: " + this.getName() + "\ncolor: " + this.getColor() + "\nbreed: " + breed);
		//System.out.println("This is a Cat");
	}
}
