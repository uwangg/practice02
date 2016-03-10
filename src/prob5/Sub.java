package prob5;

public class Sub extends Calc {

	public Sub() {
		super();
	}
	public Sub(int a, int b){
		super(a,b);
	}
	@Override
	public int calculate() {
		int result;
		result = a - b;
		return result;
	}

}
