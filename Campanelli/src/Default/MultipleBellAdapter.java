package Default;

import lombok.Data;

@Data
public class MultipleBellAdapter implements BellSdk  {
	
	private BellInstance bell;
	
	public MultipleBellAdapter(BellInstance bellIstance) {
		this.bell = bellIstance;
	}

	@Override
	public String play() {
		
		return triplePlay();
	}

	private String triplePlay() {
		return bell.play() + " " + bell.play() + " " + bell.play();
		
		
	}

	

}
