package Default;


public class BellFactory implements BellFactorySdk{

	@Override
	public BellSdk createBell() {
		
		return new Bell("C1", "don");
	}

}
