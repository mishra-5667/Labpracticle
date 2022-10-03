package corejava;

import java.util.Scanner;

public class Bitwiseoperator {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first number:");
	int num1=sc.nextInt();
	System.out.println("enter second number:");
	int num2=sc.nextInt();
	
	//bitwise and operator
	System.out.println("num1&num2="+(num1 & num2));
	// 0 1 0 1
	// 0 1 1 0
	//------
	//0 1 0 0 = 4
	//bitwise or operator
	System.out.println("num1|num2="+(num1| num2));
	// 0 1 0 1
	// 0 1 1 0
	//--------
	// 0 1 1 1
	
	//bitwise XOR operator
	System.out.println("num1^num2="+(num1^num2));
	//  0 1 0 1
	//  0 1 1 0
	//  --------
	//  0 0 1 1=3 
	// bitwise not operator
	System.out.println("~num1="+~num1);
    // 0 1 0 1
	// -------
	// 1 0 1 0=-6 
	}

}
