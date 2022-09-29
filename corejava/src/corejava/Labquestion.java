package corejava;

 class Labquestion {
	Labquestion(){
		System.out.println("i am a student");
	}
	void sing() {
		System.out.println("i am a teacher");
	}
	class child extends Labquestion{
		void speak() {
			System.out.println("i am a doctor");
		}
		class baby extends Labquestion{
			void dance() {
				System.out.println("i am a police");
			}
		}
	}
	public static void main(String[] args) {
       Labquestion l=new Labquestion();
       l.sing();
       
       
       
	}

}
