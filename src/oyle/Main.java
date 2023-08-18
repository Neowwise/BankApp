package oyle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bank b = new Bank("Nazi" , "Ibrahmova" , "4044040000404404"); 
		b.Show();
		Methodlar m = new Methodlar();
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter your choice\n 1)Increase the balance  2)Reduce the balance ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1 : System.out.println("your balance:"); m.Increase();break;
		case 2 : System.out.println("your balance:");  m.Reduce();break;
		}
		sc.close();

	}

}
