package oyle;

import java.util.Scanner;

public class Methodlar {
	Bank b = new Bank();
	Scanner sc = new Scanner(System.in);
	
	public void Increase() {		
		b.setBalance(sc.nextInt());
		System.out.println("change:");
		b.setChange(sc.nextInt());
	    int a = (b.getBalance() + b.getChange());
	    System.out.println("The Balance Increased: " +  a);
	}
	public void Reduce() {
		b.setBalance(sc.nextInt());
		System.out.println("change:");
		b.setChange(sc.nextInt());
	    int a = (b.getBalance() - b.getChange());
	    System.out.println("The Balance Decreased" + a);
	}
	
	
	
}
