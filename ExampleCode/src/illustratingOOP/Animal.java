package illustratingOOP;

public class Animal {

	private String name ;
	private String color ;
	
	public String getName()
	{
		return name; 
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color ;
	}
	public void setName(String name)
	{
		this.name = name ;
	}
	public Animal(String name, String color)
	{
		this.name = name; 
		this.color = color; 
	}
	public Animal()
	{
		this("namelessAnimal","black");
	}
	public void printAnimalInfo()
	{
		System.out.println("name: " + name + "\ncolor: " + color);
		//System.out.println("This is an Animal");
	}
}
