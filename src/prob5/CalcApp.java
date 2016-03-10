package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">> ");
			String inputs = sc.nextLine();
			
			if(inputs.equals("quit"))
				break;
			
			String tokens[] = inputs.split(" ");
			
			Calc calc = null;
			switch(tokens[1]) {
				case "+" :
					calc = new Add();
					break;
				case "-" :
					calc = new Sub();
					break;
				case "*" :
					calc = new Mul();
					break;
				case "/" :
					calc = new Div();
					break;
			}
			
			int result = 0;
			if(calc != null){
				int lValue = Integer.parseInt(tokens[0]);
				int rValue = Integer.parseInt(tokens[2]);
				calc.setValue(lValue, rValue);
				result = calc.calculate();
			}
			System.out.print(">> ");
			System.out.println(result);
		}
	}

}
