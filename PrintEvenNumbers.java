package jala;

public class PrintEvenNumbers {
	public static void main(String[] args)  
	{	 
		int number = 10; 
 
		while( number <= 100 ) 
		{ 
			if( (number % 2) == 0 ) 
			{ 
				System.out.println(number); 
			} 
			number++; 
		} 
	} 
}
