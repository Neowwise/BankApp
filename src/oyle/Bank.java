package oyle;

public class Bank {
	
	private String name;
	private String surname;
	private String kartnumber;
	private int balance;
	private int change;
	
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getKartnumber() {
		return kartnumber;
	}
	public void setKartnumber(String kartnumber) {
		this.kartnumber = kartnumber;
	}
	public int getBalance() {
		return balance;
		
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Bank() {
		super();
	}
	public Bank(String name, String surname, String kartnumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.kartnumber = kartnumber;
	}
	public void Show() {
		System.out.println("Adiniz : " + name);
		System.out.println("Soyadiniz : " + surname);
		System.out.println("Kart nomreniz : " + kartnumber);
	}
	

}
