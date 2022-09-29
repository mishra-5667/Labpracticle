package corejava;
// crate parent class
 class Labquestion {
	 //create constructor
	Labquestion(){
		System.out.println("i am a student");//print i am a student
	}
	//create method
	void sing() {
		System.out.println("i am a teacher");//print (i am a teacher)
	}
	//create chjld class extends parent class
	class child extends Labquestion{
		//create method speak
		void speak() {
			System.out.println("i am a doctor");//print (i am a doctor)
		}
		//create baby class which extends parent class
		class baby extends Labquestion{
			//create method
			void dance() {
				System.out.println("i am a police");//print (i am a police)
			}
		}
	}
	//create main method
	public static void main(String[] args) {
		//create object of parent class
       Labquestion l=new Labquestion();
       l.sing();//calling method sing
       
       
       
       
	}

}
