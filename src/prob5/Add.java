package prob5;

public class Add extends Calc {
	public Add(){
		super();
	}
	@Override
	public int calculate() {
		int result;
		result = a + b;
		return result;
	}

}
