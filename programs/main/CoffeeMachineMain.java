// Demonstration of singleton classes

package programs.main;

class CoffeeMachine {
	
	private int coffeePowder;
	
	private int milk;
	
	private int suger;
	
	private int coffeeQuantity;
	
	private static CoffeeMachine myMachine = null;
	
	private static int count = 2;
	
	public void prepareCoffee() {
		coffeeQuantity = 3;
		System.out.println("Prepare Coffee");
	}
	
	public void despenceCoffee() {
		if(coffeeQuantity == 0) {
			prepareCoffee();
		}
		coffeeQuantity--;
		System.out.println("Dispence Coffee");
	}
	
	private CoffeeMachine(int coffeePowder, int milk, int suger) {
		this.coffeePowder = coffeePowder;
		this.milk = milk;
		this.suger = suger;
	}
	
	public static CoffeeMachine getInstance(int coffeePowder, int milk, int suger) {
		if(count > 0) {
			myMachine = new CoffeeMachine(coffeePowder, milk, suger);
			count--;
		}
		return myMachine;
	}
}

class CoffeeMachineMain {
	
	public static void main(String[] args) {
		
		CoffeeMachine m1 = CoffeeMachine.getInstance(10, 20, 30);
		System.out.println(m1.hashCode());
		
		
		CoffeeMachine m2 = CoffeeMachine.getInstance(10, 20, 30);
		System.out.println(m2.hashCode());
		
		CoffeeMachine m3 = CoffeeMachine.getInstance(10, 20, 30);
		System.out.println(m3.hashCode());
		
		CoffeeMachine m4 = CoffeeMachine.getInstance(10, 20, 30);
		System.out.println(m4.hashCode());
		
		CoffeeMachine m5 = CoffeeMachine.getInstance(10, 20, 30);
		System.out.println(m5.hashCode());
		
		
	}
}
