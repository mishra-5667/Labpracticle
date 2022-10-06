package corejava;

import java.util.Scanner;

public class Pwd {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);	
		System.out.println("enter password");
	
	 int Pwd=obj.nextInt();
		if(Pwd==2731) {
			System.out.println("my name:=sachin");
			System.out.println("my age:=20");
			System.out.println("my contact number=9987679893");
		}
		else {
			System.out.println("incorrect password");
		}

	}

}
