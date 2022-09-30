 package corejava;

class par{
	void text() {
		System.out.println("inside parent class");
	}
}
class child extends par{
	void text1() {
		System.out.println("inside child class");
	}
}
class baby extends child{
	void text2() {
		System.out.println("inside parent class 1");
	}
}
public class Parent {

	public static void main(String[] args) {
		baby obj=new baby();
		
		obj.text();
		obj.text1();

	}

}
