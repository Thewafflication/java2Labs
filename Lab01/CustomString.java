import java.util.Arrays;

public class CustomString
{
	private char[] values;
	//Number of characters in the array
	private int size;
	
	private int capacity;

	public static final int DEFAULT_CAP = 10;
	
	/**
	 *Creates a newly created CustomString object so it represents an 
	 *empty character sequence.
	 */
	public CustomString()
	{
		this.size = 0;
		this.capacity = this.size + DEFAULT_CAP;
		this.values = new char[DEFAULT_CAP];
	}
	
	/**
	 *Initializes a newly created CustomString object so it represents the
	 *passed values.
	 */
	public CustomString(char[] values)
	{
		this.values = values;
		this.size = this.values.length;
		this.capacity = this.size;
		
	}

	/**
	 * Returns a string representation of CustomString.
	 */
	public String toString()
	{
		String result = "";
		for(int i = 0; i < this.values.length; i++)
		{
			result += values[i];
		}
		return result;
	}

	/**
	 * Returns the number of chars in CustomString.
	 */	
	public int getSize()
	{
		return this.size;
	}
	
	/**
	 * Returns the capacity of this CustomString.
	 */
	public int getCapacity()
	{
		return this.values.length;
	}
	
	/**
	 *Appends the values in char[] values to the end of this CustomString.
	 */
	public void append(char[] values)
	{
		int length = this.values.length + values.length;
		char[] result = new char[length];
		for(int i = 0; i < this.values.length; i++)
		{
			result[i] = this.values[i];
		}
		for(int i = 0; i < values.length; i++)
		{
			result[i+values.length] = this.values[i];
		}
		this.values = result;
		
	}
	
	/**
	 *Returns the number of characters in the CustomString
	 */
	public int length()
	{
		int result = 0;
		for(char c : values)
		{
			System.out.println();
			if((int)c > 0)
				result++;
		}
		return result;
	}
	
	public boolean isEmpty()	
	{
		long sum = 0;
		for(int i = 0; i < this.values.length; i++)
		{
			sum += (long)this.values[i];
		}
	
		return (this.values.length == 0) || (sum == 0);
	}
	
	/**
	 * Returns the char at an index.
	 * NOTE: The index is zero based.
	 */	
	public char charAt(int index)
	{
		return this.values[index];
	}
	

	public boolean equals(java.lang.Object someObject)
	{
		CustomString so;
		try
		{
			so = (CustomString)someObject;
		}
		catch(Exception e)
		{
			return false;
		}
		return this.toString().equals(so.toString());
	}
	
	public boolean equalsIgnoreCase(java.lang.String anotherString)
	{
		CustomString as = new CustomString(anotherString.toCharArray());
		return this.toUpperCase().equals(as.toUpperCase());
	}
	
	//TODO
	public int compareTo(CustomString anotherString)
	{
		if(anotherString == null)
			return 1;

		if(Arrays.equals(this.toCharArray(),anotherString.toCharArray()))
			return 0;
		for(int i = 0; i < this.values.length || i < anotherString.toCharArray().length; i++)
		{
			char[] upperCaseThis;
			char[] upperCaseAnother;
			if(this.
		}
	}
	
	//TODO
	public boolean startsWith(CustomString prefix)
	{
		return true;
	}

	//TODO
	public boolean endsWith(CustomString suffix)
	{
		return true;
	}
	
	//TODO
	public int indexOf(CustomString anotherCString)
	{
		return 0;
	}
	
	//TODO
	public CustomString substring(int beginIndex, int endIndex)
	{
		return new CustomString();
	}
	
	//TODO
	public CustomString replace(CustomString target, CustomString Replacement)
	{
		return new CustomString();
	}
	
	//TODO
	public CustomString resize(int newCapacity)
	{
		return new CustomString();
	}
	
	//TODO 
	public boolean contains(CustomString anotherString)
	{
		return true;
	}
	
	public CustomString toUpperCase()
	{
		char[] newValues = new char[this.values.length];
		System.arraycopy(this.values,0,newValues,0,this.values.length);
		for(int i = 0; i < newValues.length; i++)
		{
			newValues[i] = Character.toUpperCase(newValues[i]);
		}
		return new CustomString(newValues);
	}
	
	public char[] toCharArray()
	{
		return this.values;
	}
}
