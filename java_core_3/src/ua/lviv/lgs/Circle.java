package ua.lviv.lgs;

public class Circle 
{
	private double diameter;
	private double radius;
	
	Circle()
	{
		this.diameter = 10;
		this.radius = 0.5 * this.diameter;
	}
	
	Circle(double diameter)
	{
		this.diameter = diameter;
		this.radius = 0.5 * this.diameter;
	}
	
	public double surface()
	{
		return Math.PI * Math.pow(0.5 * this.diameter, 2) ;
	}
	
	public double perimeter()
	{
		return 2 * Math.PI * this.radius;
	}
}
