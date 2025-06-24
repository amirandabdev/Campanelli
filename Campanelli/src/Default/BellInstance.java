package Default;

public class BellInstance {
	private InstrumentFactorySdk factory;
	private BellSdk bell;
	
	
	public BellInstance(InstrumentFactorySdk factory) {
		this.factory = factory;
	}
	
	public void setup() {
		this.bell = factory.createBell();
	}
	
	public String play() {
		return bell.play();
	}

}
