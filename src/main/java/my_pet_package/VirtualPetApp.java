package my_pet_package;

import java.util.Scanner;

public class VirtualPetApp {

	// Create variables
	private static Scanner input = new Scanner(System.in);
	private static VirtualPet myPet;

	public static void main(String[] args) {

		// Assign values
		myPet = new VirtualPet();
		input = new Scanner(System.in);

		// Create initialize method
		System.out.println("Polly the Pig");
		System.out.println("Good morning! Pet's current status: ");
		myPet.printAll();
		System.out.println("Enter '99' to advance time for morning, afternoon, and evening.");

		// String timeValue = input.nextLine();
		int counter = 0;
		while (input.hasNextInt()) {

			if (input.nextInt() == 99 && counter < 2) {
				myPet.tick();
				counter++;
				System.out.println("Pet's current status: ");
				myPet.printAll();
				if (counter == 1) {
					System.out.println("Happy afternoon!");
				} else {
					System.out.println("Day is over...Good-night!");
					break;
				}
			}
		}

		/*
		 * if (userValue == 1) { //System.out.
		 * println("You have chosen hunger. Enter hunger level below. Hunger Level: 1=Starving; 2=Satsified; 3=Full"
		 * );
		 * 
		 * int userHungerLevel = input.nextInt(); myPet.hunger(userHungerLevel);
		 * 
		 * } else if (userValue == 2) {
		 * System.out.println("You have chosen thirst. Enter thirst level below");
		 * 
		 * int userThirstLevel = input.nextInt(); myPet.thirst(userThirstLevel); } //
		 * Finish conditions 3 - 5 else if (userValue == 3) { myPet.waste = myPet.waste
		 * + 1;
		 * 
		 * } else if (userValue == 4) { myPet.boredom = myPet.boredom + 1;
		 * 
		 * } else if (userValue == 5) { myPet.excitement = myPet.excitement + 1; }
		 */
	}

}