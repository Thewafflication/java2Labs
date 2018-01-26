import java.util.Date;
import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.NumberFormat;
/**
 *The CD class is utilized to compute several investment metrics related to CD returns.
 *This class is a simplified representation of a CD investment.
 *Consider starting with this class, and utilize your unit testing skills to build it.
 *Check your code against TestCases.xlsx.
*/
public class CD
{
	private String cdName;
	private long amountInCents;
	private Date purchaseDate;
	private int months;
	private	double annualRate;
	private int compoundingType;
	private Portfolio portfolio;
	private LocalDate localDate;

	private static final NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
	private static final int CD_COMPOUND_ANNUALLY = 1;
	private static final int CD_COMPOUND_MONTHLY  = 12;
	private static final int CD_COMPOUND_DAILY    = 365;

	public CD(Portfolio p, String cdName, long amountInCents, 
			Date purchaseDate, int months, double annualRate,
		       	int compoundingType)
	{
		this.portfolio = p;
		this.cdName = cdName;
		this.amountInCents = amountInCents;
		this.purchaseDate = purchaseDate;
		this.months = months;
		this.annualRate = annualRate;
		this.compoundingType = compoundingType;
		this.localDate = purchaseDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}

	public Date calcMaturityDate()
	{
		Date result = java.sql.Date.valueOf(localDate.plusMonths(this.months));
		return result; 
	}

	public long calcValueAtMaturity()
	{
		double result;
		
		// Number of Days
		int days = localDate.until(localDate.plusMonths(this.months)).getDays();
		
		float t = (float)days / 365.0f;
		double r = this.annualRate;
		long n = this.compoundingType;
		
		result = 1.0 + r/n;
		result = Math.pow(result,n*t);
		result *= this.amountInCents;
		

		return new Double(result).longValue();			
	}

	public String toString()
	{
		/**
		 * 
		CD Name: CD_01
		Amount Invested: $1,000.00
		Purchase Date: 1/1/2015
		Term(Months): 12
		Annual Rate: 1.50%
		Compounding Type: Annually
		Maturity Date: 1/1/2016
		Value at Maturity: $1,015.00
		Interest Earned at Maturity: $15.00
		*/
		return "CD Name: " + this.cdName + 
		"\nAmount Invested: " + n.format(this.amountInCents / 100.0) +
		"\nPurchase Date: " + this.localDate.
	}



}
