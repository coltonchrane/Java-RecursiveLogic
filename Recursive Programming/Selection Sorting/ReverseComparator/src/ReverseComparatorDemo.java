import java.util.Arrays;
public class ReverseComparatorDemo 
{

	public static void main(String[] args) 
	{
	   String[] a = {"Larry","Moe","Curly"};
	   System.out.println(Arrays.toString(a));
	   MergeSorter.sort(a);
	   System.out.println(Arrays.toString(a)); 	 	
	}

}
