package recursion;
public class RecursiveFind 
{
	 private String text;
	 private String str;
	public RecursiveFind()
	 {
	       this.text = "";
	       this.str = "";
	 }
	 public boolean Find(String text, String str)
	 {
		 if (text.length() < str.length())
	        {
	            return false;
	        } 
	        else if (text.substring(0, str.length()).equals(str)) 
	        {
	            return true;
	        }
	        else 
	        {
	            return Find(text.substring(1), str);
	        }
	 }
	   
}
