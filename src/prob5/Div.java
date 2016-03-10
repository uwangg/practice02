package prob5;

public class Div extends Calc {

	public Div() {
		super();
	}
	public Div(int a, int b){
		super(a,b);
	}
	@Override
	public int calculate() {
		int result;
		result = a / b;
		return result;
	}

}
