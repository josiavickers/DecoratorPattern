package decoratorPattern;

public class Main {

	public static void main(String[] args) {
		Navi car = new Navi(new AirCon(new Heating(new Volkswagen())));
		System.out.println("Price of " + car.getDescription() + ": " + car.getPrice());
	}

}
