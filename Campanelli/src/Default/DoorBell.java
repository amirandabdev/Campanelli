package Default;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
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

}
