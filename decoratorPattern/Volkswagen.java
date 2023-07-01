package decoratorPattern;

public class Volkswagen implements Component{
	
	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getDescription() {
		return "Volkswagen";
	}

}
