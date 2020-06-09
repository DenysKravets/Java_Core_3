package ua.lviv.lgs;

public class application {
	public static void main(String[] args) {
		
		do {
			
			
		} while(false);
		
		System.out.println("byte: " + Byte.MAX_VALUE + " | " + Byte.MIN_VALUE);
		System.out.println("short: " + Short.MAX_VALUE + " | " + Short.MIN_VALUE);
		System.out.println("int: " + Integer.MAX_VALUE + " | " + Integer.MIN_VALUE);
		System.out.println("long: " + Long.MAX_VALUE + " | " + Long.MIN_VALUE);
		System.out.println("float: " + Float.MAX_VALUE + " | " + Float.MIN_VALUE);
		System.out.println("double: " + Double.MAX_VALUE + " | " + Double.MIN_VALUE);
		System.out.println("char: " + Character.MAX_VALUE + " | " + Character.MIN_VALUE);
		
		double[] Array = new double [10];
		
		for(int i = 0; i < Array.length; i++)
		{
			Array[i] = Math.random() * 100;
		}
		
		boolean not_filtered = true;
		while(not_filtered)
		{
			not_filtered = false;
			for(int i = 0; i < Array.length - 1; i++)
			{
				if(Array[i] > Array[i+1])
				{
					double index_holder = Array[i];
					Array[i] = Array[i+1];
					Array[i+1] = index_holder;
					not_filtered = true;
				}
			}
		}
		
		for(int i = 0; i < Array.length; i++)
		{
			System.out.println(Array[i]);
		}
		 
		
	}
}
