package Default;

public class Main {
	
	public static void createNewBell(BellFactorySdk bell) {
		BellSdk newBell = bell.createBell();
		
		System.out.println(newBell.play());
	}

	public static void main(String[] args) {
		BellFactorySdk normalBell = new BellFactory();
		createNewBell(normalBell);
		BellFactorySdk doorBell = new DoorBellFactory();
		createNewBell(doorBell);

	}

}
