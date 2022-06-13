
public class Reverse 
{
	private String text;
	public Reverse()
	{
		this.text = "";
	}
	public String getReverse(String text)
	{
		String rev = "";
		if(text.length()<1)
		{
			return text;
	    }
	    return getReverse(text.substring(1)) + text.charAt(0);
	}
}
