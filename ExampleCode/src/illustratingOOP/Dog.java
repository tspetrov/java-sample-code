package illustratingOOP;

public class Dog extends Animal {
	private int heightInSm;
	
	public int getHeight()
	{
		return heightInSm;
	}
	public void setHeight(int height)
	{
		this.heightInSm = height ;
	}
	public Dog(String name, String color, int height)
	{
		super(name,color);
		this.heightInSm = height;
	}
	public Dog()
	{
		super();
		this.heightInSm = 60 ;
	}
	public void printAnimalInfo()
	{
		System.out.println("name: " + this.getName() + "\ncolor: " + this.getColor() + "\nheight: " + heightInSm);
		//System.out.println("This is a Dog");
	}
	
}
