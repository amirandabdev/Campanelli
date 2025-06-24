
package Default;


public class ChurchBellFactory implements InstrumentFactorySdk{
	
	@Override
	public BellSdk createBell() {
		
		return new ChurchBell("C1", "don");
	}

}

