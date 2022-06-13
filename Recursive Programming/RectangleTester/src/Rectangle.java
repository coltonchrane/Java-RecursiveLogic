
public class Rectangle 
{
	private double width;
	private double height;

	public Rectangle(double width, double height)
	{
	this.width = height;
	this.height = width;
	}
	public double getArea()
	{
		if(this.width == 1)
		{
			return height;
		}
		else
		{
			Rectangle rectangle = new Rectangle(this.width - 1, this.height);
			return this.height + rectangle.getArea();
		}
	}
	
}
