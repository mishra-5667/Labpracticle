package corejava;

import java.util.Scanner;

public class Checkpercentage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=sc.next();
		System.out.println("enter the marks of 1st subject");
		int m1=sc.nextInt();
		System.out.println("enter the marks of 2nd subject");
		int m2=sc.nextInt();
		System.out.println("enter the marks of 3rd subject");
		int m3=sc.nextInt();
		System.out.println("enter the marks of 4th subject");
		int m4=sc.nextInt();
		System.out.println("enter the marks of 5th subject");
		int m5=sc.nextInt();
		
		//calculating percentage
		float per=(m1+m2+m3+m4+m5)/5;
		System.out.println(name+"your percentage is:"+per);
		
		//checking the status of student (passed or fail)
		if(per>=60)
		{
			System.out.println("sorry!"+name+" you are failed");
	
			}
		}
		

	}


