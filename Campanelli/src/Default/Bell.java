package Default;

public class Bell {
	private String name;
	private String sound;
	
	public Bell(String name, String sound) {
		super();
		this.name = name;
		this.sound = sound;
		
	}
	
	public String play() {
		return sound;
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
		return "Name: " + name + " - Sound" + sound + "]";
	}

	
	
	
}
