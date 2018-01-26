/**
 *The Broker class which contains the main method and is used to simulate the sample portfolio(s). 
 *The output from this class should match the sample "BrokerOutput.txt"
 */
public class Broker
{
	public static void main(String args[])
	{
		System.out.printf(":)\n");
		createBobsPortfolio();
	}

	private static void createBobsPortfolio()
	{
		Owner bob = new Owner("Bob", "Smith");
		System.out.println(bob.toString());
	}
}
