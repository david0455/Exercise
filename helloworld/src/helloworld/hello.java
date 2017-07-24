package helloworld;

import java.util.Scanner;

public class hello
{
	
	public static void main(String[] args)
	{
	
		Scanner myKeyboard = new Scanner(System.in);
		System.out.println("Enter pokemon name: ");
		String pokemon = myKeyboard.next();
		
		switch (pokemon)
		{
			case "lugia":
				System.out.println(pokemon + " is legendary");
				break;
			
			case "bidoof":
				System.out.println(pokemon + " is not legendary");
				break;
			
			default:
				System.out.println(pokemon + " not a pokemon");
				
				
			
			
			
		}
		
			
			
			
		
		
		
		
		
	
	
	}	
	
}
	
