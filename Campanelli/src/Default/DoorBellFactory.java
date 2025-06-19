package Default;

public class DoorBellFactory implements InstrumentFactorySdk{

	@Override
	public BellSdk createBell() {
		// TODO Auto-generated method stub
		return new DoorBell("C2", "din", "Carlo Mangi 27");
	}

}
