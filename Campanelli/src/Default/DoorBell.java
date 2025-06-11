package Default;

public class DoorBell implements BellSdk {
	private String name;
	private String sound;
	private String address;
	
	public DoorBell() {
		
	}
	
	public DoorBell(String name, String sound, String address) {
		this.name = name;
		this.sound = sound;
		this.address = address;
	}
	
	@Override
	public String play() {
		return sound;
	}

	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getSound() {
		return sound;
	}

	@Override
	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Name: " + name + " - Sound: " + sound + " - Address: " + address;
	}

	
	
	
}
