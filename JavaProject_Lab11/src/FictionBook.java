import java.time.Year;

public class FictionBook implements Book,Author {
	private String firstName;
	private String lastName;
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear)
	{
		this.title = title;
		this.publicYear = publicYear;
	}
	
	public void setAuthorName(String name)
	{
		this.author_name = name;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	@Override
	public String getLastName()
	{
		return this.lastName.toUpperCase();
	}
	
	@Override
	public String getFirstName()
	{
		return this.firstName.toUpperCase();
	}
	
	@Override
	public boolean checkEmail()
	{
		if (email == "@hotmail.com" || email == "@windowslive.com")
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String getTitle()
	{
		return this.title;
	}
	
	@Override
	public int totalPublicYear()
	{
		return Year.now().getValue() - publicYear;
	}
	
	public boolean checkFormatName()
	{
		if(author_name == (firstName+""+lastName))
		{			
		    return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return title+"Write by "+this.firstName.charAt(0)+"."+this.firstName+" ("+this.email+")"+
				"\nPulished for "+this.publicYear+" years.";
	}

}
