package Default;

@Data
public class Bell implements BellSdk {	
	private String name;
	private String sound;
	
	public Bell() {
		
	}
	
	public Bell(String name, String sound) {
		this.name = name;
		this.sound = sound;
		
	}
	
	@Override
	public String play() {
		return sound;
	} 

	
	
	
}
