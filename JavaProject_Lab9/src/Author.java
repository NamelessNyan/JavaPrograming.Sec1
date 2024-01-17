
public class Author {
	
	public static final String DEFAULT_NAME = "null";
	public static final String DEFAULT_EMAIL = "null";
	public static final char DEFAULT_GENDER = 'n';

	
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	Author(String name,String email)
	{
		this.name = name;
		this.email = email;
		this.gender = DEFAULT_GENDER;
	}
	
	Author()
	{
		this.name = DEFAULT_NAME;
	    this.email = DEFAULT_EMAIL;
	    this.gender = DEFAULT_GENDER;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String getGenderName()
	{
		if(this.gender == 'M')
		{
		     return "Male";
		}
		else if(this.gender == 'F')
		{
			return "Female";
		}
		else
		{
			return "null";
		}
	}

	public String toString()
	{
		return "Author name: "+name+" ("+email+";"+getGenderName()+")";
	}
}
