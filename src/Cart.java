import java.util.InputMismatchException;
import java.util.Scanner;

public class Cart {
	public static void main(String[] args) {
		int id = 0,price = 0;
		String name = null,publisher = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose between book and dvdplayer");
		String s=sc.next();
		System.out.println("enter the no of day you are borrowing for");
		int day=sc.nextInt();
		boolean repeat=true;
		while(repeat) {
		try {
			System.out.println("enter the id");
			id=sc.nextInt();
			System.out.println("enter the name");
			name=sc.next();
			System.out.println("enter the publisher/author");
			publisher=sc.next();
			repeat=false;
		} 
		catch (InputMismatchException e) {
			System.err.println("Please enter correct id ");
			sc.nextLine();
			repeat=true;
		}
		}
		boolean repeatagain=true;
		while(repeatagain) {
		try {

			System.out.println("enter the price per day");
		    price=sc.nextInt();
			repeatagain=false;
		} 
		catch (InputMismatchException e) {
			System.err.println("Please enter correct price ");
			sc.nextLine();
			repeatagain=true;
		}	
			
	
	}
		
		//implementation of polymorphism
		
		Library l=null;
		if(s.equalsIgnoreCase("book")) {
			l=new Book(id, name, publisher, price);
			
		}
		if(s.equalsIgnoreCase("dvdplayer")) {
			l=new DvdPlayer(id, name, publisher, price);
			
		}
		l.rent(day);
	}
	
}
