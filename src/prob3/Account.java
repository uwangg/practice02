package prob3;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	
	// getter & setter
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	// 입금
	public int save(int money) {
		System.out.println();
		System.out.println(accountNo+" 계좌에 "+money+"만원이 입급 되었습니다.");
		balance += money;
		return balance;
	}

	// 출금
	public int deposit(int money) {
		if( (balance - money) >= 0 )	// 0보다 크거나 같을때만 출금 가능
		{
			System.out.println();
			System.out.println(accountNo+" 계좌에 "+money+"만원이 출금 되었습니다.");
			balance -= money;
			return balance;
		}
		System.out.println("잔고가 부족합니다.");
		return 0;
	}
}
