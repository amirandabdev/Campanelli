package Default;

public class Campanelli {
	private String name;
	private String sound;
	
	public Campanelli(String name, String sound) {
		super();
		this.name = name;
		this.sound = sound;
		
	}
	
	public String suona() {
		return name + ": " + sound;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	@Override
	public String toString() {
		return "Nome: " + name + " - Suono" + sound + "]";
	}

	
	
	
}
