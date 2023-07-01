package decoratorPattern;

public class AirCon extends CarParts{

	public AirCon(Component c) {
		super(c);
	}

	@Override
	public int getPrice() {
		return BASIS.getPrice() + 25;
	}

	@Override
	public String getDescription() {
		return BASIS.getDescription() + " with AC";
	}

}
