package Default;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class ChurchBell implements BellSdk {	
	private String name;
	private String sound;
	
	public ChurchBell() {
		
	}
	
	public ChurchBell(String name, String sound) {
		this.name = name;
		this.sound = sound;
		
	}
	
	@Override
	public String play() {
		return sound;
	} 

	
	
	
}
