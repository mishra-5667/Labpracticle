package Java.ac;

import java.util.Scanner;

public class Arrayuser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("enter the elements");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a;i++) {
			sum=sum+arr[i];
		}
       System.out.println("sum of all elements of the array is"+sum);
	}

}
