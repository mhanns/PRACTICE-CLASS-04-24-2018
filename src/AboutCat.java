//Maurice Hanns CSC 242 04/24/2018

import java.util.Scanner;

public class AboutCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String [] catList = new String[6];
		for (int i = 0; i < catList.length; i=i+2){
			
			System.out.println("Enter the cats name: ");
			String CatNam = scanner.nextLine();

			System.out.println("Enter the cats breed: ");
			String CatBrd = scanner.nextLine();
			
			CAT cat = new CAT(CatNam, CatBrd);
			
			catList[i] = CatNam;			
			catList[i+1] = CatBrd;	
				
		}
			
		System.out.println("Cats Name: " + catList[(catList.length/2-1)] + "\nCats Breed: " + catList[(catList.length/2)]);	

	}//main

}//class
