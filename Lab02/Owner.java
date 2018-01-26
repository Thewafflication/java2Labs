/**
 *The Owner class represents the owner of a portfolio.
 */
public class Owner
{
	private String firstName;
	private String lastName;
	private Portfolio portfolio;
	
	public Owner(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;	
	}

	public void assignPortfolioToOwner(Portfolio p)
	{
		this.portfolio = p;
	}
	
	public Portfolio getPortfolio()
	{
		return this.portfolio;
	}

	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public void setFistName(String firstName)
	{
		this.firstName = firstName;
	}

	public void set(String lastName)
	{
		this.lastName = lastName;
	}

	public String toString()
	{
	
		return this.lastName + ", " + this.firstName;
	}
}
