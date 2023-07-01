package decoratorPattern;

public class Heating extends CarParts{

	public Heating(Component c) {
		super(c);
	}

	@Override
	public int getPrice() {
		return BASIS.getPrice() + 75;
	}

	@Override
	public String getDescription() {
		return BASIS.getDescription() + " with heating";
	}

}
