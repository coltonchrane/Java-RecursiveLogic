
public class Chapter13Lecutre
{
		static void printHello()
		{
			System.out.println("Hello");
			printHello();
		}



		public static void main(String[] args)
		{
			Chapter13Lecutre ch = new Chapter13Lecutre();
			ch.printHello();
		}
}