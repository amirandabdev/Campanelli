package Default;

public class Main {

	public static void main(String[] args) {
		Campanello[] Campanelli = new Campanello[2];

		Campanelli[0] = new Campanello("c1", "din");
		Campanelli[1] = new Campanello("c2", "dan");

		for (Campanello Campanello : Campanelli)
			System.out.println(Campanello + "," + Campanello.suona());

	}

}
