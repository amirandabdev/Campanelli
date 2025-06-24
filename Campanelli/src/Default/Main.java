package Default;

public class Main {
	

	public static void main(String[] args) {
		InstrumentFactorySdk bellFactory = new ChurchBellFactory();
		BellInstance bellInstance = new BellInstance(bellFactory);
		bellInstance.setup();
		System.out.println(bellInstance.play());
		
		InstrumentFactorySdk doorBellFactory = new DoorBellFactory();
		BellInstance doorBellInstance = new BellInstance(doorBellFactory);
		doorBellInstance.setup();
		System.out.println(doorBellInstance.play());
		
		MultipleBellAdapter bellAdapted = new MultipleBellAdapter(bellInstance);
		System.out.println(bellAdapted.play());
		

	}

}
