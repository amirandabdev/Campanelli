package Default;

import lombok.Data;

@Data
public class DoorBell implements BellSdk {
	private String name;
	private String sound;
	private String address;
	
	public DoorBell() {
		
	}
	
	public DoorBell(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}
	
	@Override
	public String play() {
		return name + " " + sound;
	}
	
	
	
}
