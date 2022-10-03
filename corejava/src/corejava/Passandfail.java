package corejava;

import java.util.Scanner;

public class Passandfail {

	public static void main(String[] args) {
	//creating Scanner class object to take input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		String name=sc.next();
		System.out.println("enter marks of five subjects");
		//taking input from five sunjects
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		int mark4=sc.nextInt();
		int mark5=sc.nextInt();
		
		float total=(mark1+mark2+mark3+mark4+mark5)/5f;
		if (total>=60.0f) {
			System.out.println(name+"you are passed");
			if (total>=70.0f) {
				System.out.println(name+"your score grade c");
			}
			else if(total>80.0f) 
				{
					System.out.println(name+"your score detail b");
				}
			else if(total>=80.0f) 
					{
						System.out.println(name+"your score detail a");
						
					}
					else {
						System.out.println(name+"you are fail");
					}
			}
	}
}	
	


