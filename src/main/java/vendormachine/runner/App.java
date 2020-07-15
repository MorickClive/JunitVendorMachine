package vendormachine.runner;

import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.item.Snack;

public class App {

	public static void main(String[] args) {
		//TODO add Log4j
		System.out.println("Title: Alyx wants to buy a soda.\n");

		// Our instances/objects
		Person alyx = new Person("Alyx", new Wallet(10.0f));
		DrinkVendingMachine drinkMachine = new DrinkVendingMachine();
		Snack itemSelection;

		// Alyx wants to interact with our vending machine (£2.10 credit)
		drinkMachine.giveCredit(alyx, 2.10f);
		
		// They select the 2nd drink option
		itemSelection = drinkMachine.selectDrink(1);

		// Let's see what we have
		System.out.println("");
		System.out.println(alyx.getName() + " your drink is:\n'" + itemSelection.name +"'");
		System.out.println("\t- Cost: £" + itemSelection.cost());
	}

}
