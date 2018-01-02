package __arrayList;

public class Account implements Comparable<Account> {
	
	private String account_number;
	private String account_name;
	private Double account_balance;
	
	public Account(String account_number, String account_name, double account_balance) {
		super();
		this.account_number = account_number;
		this.account_name = account_name;
		this.account_balance = account_balance;
	}
	
	
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public Double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(Double account_balance) {
		this.account_balance = account_balance;
	}


	@Override
	public String toString() {
		return "\nAccount [account_number=" + account_number + ", account_name=" + account_name + ", account_balance="
				+ account_balance + "]";
	}

	@Override
	public int compareTo(Account acct) {
		return this.account_name.compareTo(acct.account_name);
	}	

}
