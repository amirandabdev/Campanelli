package Default;

public class Main {

	public static void main(String[] args) {
		Bell[] bells = new Bell[2];

		bells[0] = new Bell("c1", "din");
		bells[1] = new Bell("c2", "dan");

		for (Bell dummyBell : bells)
			System.out.println(dummyBell.getName() + ": " + dummyBell.play());

	}

}
