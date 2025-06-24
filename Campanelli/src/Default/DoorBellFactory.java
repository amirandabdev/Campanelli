package Default;

public class DoorBellFactory implements BellFactorySdk{

	@Override
	public BellSdk createBell() {
		
		return new DoorBell("Via Giovanni 27", "din");
	}

}
