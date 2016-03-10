package prob5;


abstract public class Calc{
	protected int a;
	protected int b;
	
	public Calc() {}
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	abstract public int calculate();
}
