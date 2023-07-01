package decoratorPattern;

public abstract class CarParts implements Component{

	protected final Component BASIS;
	
	public CarParts(Component c) {
		BASIS = c;
	}
}
