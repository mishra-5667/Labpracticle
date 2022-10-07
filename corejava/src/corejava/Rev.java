package corejava;

import java.util.Scanner;
// create class Rev
public class Rev {
// create main method
public static void main(String[] arg)
{
	// we take int a and res=0 and take n number
int a,res=0,n;
Scanner sc=new Scanner(System.in);// we create scanner object to take input from the users
System.out.println("Enter a number");// print ("enter a numbe")
n=sc.nextInt();
while(n!=0) // apply while condition
{
a=n%10;
res=(res*10)+a;
n=n/10;
}
System.out.println("reverse of a number is "+res); //print ("reverse of a number"+res)
} //close main method
} //end class body

