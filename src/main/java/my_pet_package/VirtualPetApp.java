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

			if (input.nextInt() == 99 && counter < 12) {
				System.out.println("Press 1 to Feed");
				System.out.println("Press 2 to Give Water");
				System.out.println("Press 3 to Use Bathroom");
				System.out.println("Press 4 for Something To Do");
				System.out.println("Press 5 to Get Extra Excited");
				int animalNeeds = input.nextInt();
				if (animalNeeds == 1) {
					myPet.feed();
					
				} else if (animalNeeds == 2) {
					myPet.drink();

				} else if (animalNeeds == 3) {
					myPet.pee();

				} else if (animalNeeds == 4) {
					myPet.pace();

				} else if (animalNeeds == 5) {
					myPet.squeal();
					myPet.tick();
					counter++;
					System.out.println("Pet's current status: ");
					myPet.printAll();
				}

				if (counter == 8) {
					System.out.println("Happy afternoon!");
				} else {
					System.out.println("Day is over...Good-night!");
					break;
				}
			}
		}
	}
}
