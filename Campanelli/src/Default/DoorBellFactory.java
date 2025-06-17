package Default;

public class DoorBellFactory implements BellFactorySdk{

	@Override
	public BellSdk createBell() {
		// TODO Auto-generated method stub
		return new DoorBell("Via Giovanni 27", "din");
	}

}
