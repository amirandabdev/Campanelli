package Default;

public class DoorBellFactory implements InstrumentFactorySdk{

	@Override
	public BellSdk createBell() {	
		return new DoorBell("Via Giovanni 27", "din");
	}

}
