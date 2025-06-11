package Default;

public class Main {

	public static void main(String[] args) {
		Campanelli[] Campanelli = new Campanelli[2];

		Campanelli[0] = new Campanelli("c1", "din");
		Campanelli[1] = new Campanelli("c2", "dan");

		for (Campanelli Campanello : Campanelli)
			System.out.println(Campanello.getName() + "," + Campanello.suona());

	}

}
