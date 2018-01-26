
public abstract class Person
{
	private String name;
	
	protected static final String noName = "No name Yet!";
	
	public Person()
	{
		this(noName);
	}
	
	public Person(String name)
	{
		super();
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void writeOutput()
	{
		System.out.println("Name: " + name);
	}
	
	public boolean hasSameName(Person p)
	{
		return this.name.equals(p.name);
	}
}
