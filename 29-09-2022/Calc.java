package corejava;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
	int num1,num2,oper;
	Scanner sc=new Scanner(System.in);//object of scanner class
	Calc obj=new Calc();//object for Calc class
    System.out.println("enter the first number number");
    num1=sc.nextInt();
    System.out.println("enter the second number");
    num2=sc.nextInt();
    System.out.println("press 1 for addition \n press 2 for substraction \n press 3 for multiplication \n press 4 for division");
    oper=sc.nextInt();
    //based on oper value calling different methods
    switch(oper)
    {
    case 1:
    	obj.addition(num1,num2);
    	break;
    case 2:
    	obj.subtraction(num1,num2);
    	break;
    case 3:
    	obj.multiplication(num1,num2);
    	break;
    case 4:
    	obj.division(num1,num2);
    }
    
	}

	private void division(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	private void multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	private void subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

	private void addition(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}

}
