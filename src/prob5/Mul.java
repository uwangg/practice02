package prob5;

public class Mul extends Calc {

	public Mul() {
		super();
	}
	public Mul(int a, int b){
		super(a,b);
	}
	@Override
	public int calculate() {
		int result;
		result = a * b;
		return result;
	}

}
