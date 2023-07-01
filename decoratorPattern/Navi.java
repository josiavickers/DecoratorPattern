package decoratorPattern;

public class Navi extends CarParts{

	public Navi(Component c) {
		super(c);
	}

	@Override
	public int getPrice() {
		return BASIS.getPrice() + 50;
	}

	@Override
	public String getDescription() {
		return BASIS.getDescription() + " with GPS";
	}

}
