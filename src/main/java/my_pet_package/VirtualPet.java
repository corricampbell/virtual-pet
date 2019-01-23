package my_pet_package;

public class VirtualPet {

	private final int DEFAULT_PET_VALUE = 1;

	int hunger = DEFAULT_PET_VALUE;
	int thirst = DEFAULT_PET_VALUE;
	int waste = DEFAULT_PET_VALUE;
	int boredom = DEFAULT_PET_VALUE;
	int excitement = DEFAULT_PET_VALUE;

	// Setter for pet attributes and prints values.
	public void hunger(int hunger) {
		this.hunger = hunger; // sets the value of "hunger"
		System.out.println("My hunger  is: " + hunger);
	}

	public void thirst(int thirst) {
		this.thirst = thirst; // sets the value of "thirst"
		System.out.println("My thirst level  is: " + thirst);
	}

	public void waste(int waste) {
		this.waste = waste;
		System.out.println("My waste level  is: " + waste);
	}

	public void boredom(int boredom) {
		this.boredom = boredom;
		System.out.println("My boredom level  is: " + boredom);
	}

	public void excitement(int excitement) {
		this.excitement = excitement;
		System.out.println("My excitement level  is: " + excitement);
	}

	// Print method that prints all pet's states
	public void printAll() {
		System.out.println("My hunger  is: " + hunger);
		System.out.println("My thirst level  is: " + thirst);
		System.out.println("My waste level  is: " + waste);
		System.out.println("My boredom level  is: " + boredom);
		System.out.println("My excitement level  is: " + excitement);
	}

	public void tick() {
		hunger += 2;
		thirst += 2;
		waste += 2;
		boredom += 2;
		excitement += 2;
	}

	public void feed() {
		hunger -= 2;
		thirst += 2;
	}

	public void drink() {
		thirst -= 2;

	}

	public void pee() {
		waste -= 2;

	}

	public void pace() {
		boredom -= 2;
		
	}
	
	public void squeal() {
		excitement -= 2;
}
}