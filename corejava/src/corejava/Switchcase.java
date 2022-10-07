package corejava;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		int a,b,c,ch;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: c=a+b;
		break;
		case 2: c=a-b;
		break;
		case 3: c=a*b;
		break;
		case 4: c=a/b;
		break;
		case 5: c=a%b;
		break;
		 
		}
		System.out.println("reminder"+ch);
		 
		  System.out.println("invalid choice");
	}
      
}
