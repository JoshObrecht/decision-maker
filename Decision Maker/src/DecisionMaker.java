import java.util.ArrayList;
import java.util.Scanner;
public class DecisionMaker
	{
		static boolean takeInput= true;
		static boolean playAgain=true;
		static Scanner userInput = new Scanner(System.in);
		static Scanner userInput2= new Scanner(System.in);
		static ArrayList<String> choices = new ArrayList<String>();
		public static void main(String[] args)
			{
				do
				{
				takeUserInput();
				pickChoice();
				runAgain();
				}
				while(playAgain);

			}
		public static void takeUserInput()
		{
		String userChoice="";
		System.out.println("Having trouble making choices? I can help you with that! Start inputting the choices you're having trouble choosing between.");
		do
			{
			userChoice = userInput.nextLine();	
			if(userChoice.toLowerCase().contains("stop"))
				{
				if(choices.size()<2)
				{
				System.out.println("Please input at least two choices.");
				}
				else
					{
				takeInput=false;
					}
				}
			
			else
				{
				 choices.add(userChoice);
				 System.out.println("Choice added! \nIf you want to enter another choice, type the desired choice. If you're done adding choices type 'stop'");
				}
			}
		while(takeInput);
		}
		public static void pickChoice()
		{
			int randomNumber= (int)(Math.random()*choices.size());
			System.out.println("I think you should choose "+choices.get(randomNumber)+".");
		}
		public static void runAgain()
			{
				System.out.println("");
				System.out.println("Would you like me to make another choice? (Type y/n for yes/no respectively)");
				String userChoice= userInput2.nextLine();
				if((userChoice.equalsIgnoreCase("n")))
				{
				System.out.println("See you later!");
				playAgain=false;
				}
				
			}
	}
