package Default;

public class DoorBellFactory implements InstrumentFactorySdk{

	@Override
	public BellSdk createBell() {	
		return new DoorBell("C2", "din", "Via Carlo 27");
	}

}
