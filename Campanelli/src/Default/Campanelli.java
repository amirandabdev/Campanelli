package Default;

public class Campanelli {
	private String suono1;
	private String suono2;
	
	public Campanelli(String suono1, String suono2) {
		super();
		this.suono1 = suono1;
		this.suono2 = suono2;
		
	}
	
	public String suona() {
		return suono1 + " " + suono2;
	}

	@Override
	public String toString() {
		return suono1+ " " +suono2;
	}
	
	
}
