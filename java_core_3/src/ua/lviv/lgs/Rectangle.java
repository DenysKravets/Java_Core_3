package ua.lviv.lgs;

public class Rectangle
{
	private double height;
	private double width;
	
	Rectangle()
	{
		this.height = 4;
		this.width = 3;
	}
	
	Rectangle(double height, double width)
	{
		this.height = height;
		this.width = width;
	}
	
	public double surface()
	{
		return this.height * this.width;
	}
	
	public double perimeter()
	{
		return 2 * this.height + 2 * this.width;
	}
}

