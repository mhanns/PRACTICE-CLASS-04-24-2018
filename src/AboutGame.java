//Maurice Hanns CSC 242 04/24/2018

import java.util.Scanner;


public class AboutGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		String [] gameArray = {"Dead By Daylight", "Horror","M", "Cars", "Kids","E",
							  "Destiny", "Fantasy","M",	"Castlevania", "Fantasy","T",
							  "Black Panther", "Fantasy","M",};
		boolean foundG = false;
		
					
		System.out.println("Enter a game to search for: ");
		String game = input.nextLine();
			
			for (int i = 0; i < gameArray.length; i++){
			
				if (game.equalsIgnoreCase(gameArray[i])){
					System.out.println(gameArray[i] + " is " + gameArray[i+1] + " and has a rating of " + gameArray[i+2]);
					foundG = true;
					break;
				}//if

				else if (game.equalsIgnoreCase("quit")){
					break;
				}//else
				
				else {
					
				}//else
					
			}//for loop
			
			if (foundG == false){
				
			System.out.println("Game Was Not Found!");
			
			}
					
	}//main

}//class