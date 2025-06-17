package Default;

public class Main {
	

	public static void main(String[] args) {
		BellFactorySdk bellFactory = new BellFactory();
		BellInstance bellIstance = new BellInstance(bellFactory);
		bellIstance.setup();
		System.out.println(bellIstance.test());
		
		BellFactorySdk doorBellFactory = new DoorBellFactory();
		BellInstance doorBellIstance = new BellInstance(doorBellFactory);
		doorBellIstance.setup();
		System.out.println(doorBellIstance.test());
		

	}

}
