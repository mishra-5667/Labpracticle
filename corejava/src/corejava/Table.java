package corejava;

import java.util.Scanner;

public class Table {
      
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number");
       int num=s.nextInt();
       for (int i=1;i<=10;i++)
       {
    	   System.out.println(num*i);
       }
	}

}
