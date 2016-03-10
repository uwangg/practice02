package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 입력
		
		// 배열  생성
		Goods goods[] = new Goods[3];
		
		// 3개 입력 받고 객체 생성
		for(int i=0 ; i<3 ; i++){
			String name = sc.next();
			int price = sc.nextInt();
			int stock = sc.nextInt();
			goods[i] = new Goods(name, price, stock);
		}
		
		// 입력받은 객체 3개 출력
		for(int i=0 ; i<3 ; i++)
			goods[i].print();
		
	}
}
