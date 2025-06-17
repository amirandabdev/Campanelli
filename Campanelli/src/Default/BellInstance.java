package Default;

public class BellInstance {
	private BellFactorySdk factory;
	private BellSdk bell;
	
	
	public BellInstance(BellFactorySdk factory) {
		this.factory = factory;
	}
	
	public void setup() {
		this.bell = factory.createBell();
	}
	
	public String test() {
		return bell.play();
	}

}
