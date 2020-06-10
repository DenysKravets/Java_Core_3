package ua.lviv.lgs;

public class Application 
{
	public static void main(String[] args) 
	{
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(2, 5);
		
		Circle cir1 = new Circle();
		Circle cir2 = new Circle(12);
		
		System.out.println("rec1 surface -> " + rec1.surface());
		System.out.println("rec1 perimeter -> " + rec1.perimeter());
		System.out.println("rec2 surface -> " + rec2.surface());
		System.out.println("rec2 perimeter -> " + rec2.perimeter());
		
		System.out.println("cir1 surface -> " + cir1.surface());
		System.out.println("cir1 perimeter -> " + cir1.perimeter());
		System.out.println("cir2 surface -> " + cir2.surface());
		System.out.println("cir2 perimeter -> " + cir2.perimeter());
	}
}
