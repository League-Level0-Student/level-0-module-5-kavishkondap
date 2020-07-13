package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinesslevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog(null,"What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 8; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to get your pet happy?", "Pet Stuff", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "take for a walk", "feed", "cuddle" }, null);
System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	walk();
}else if(task==1) {
	feed();
}else {
	cuddle();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinesslevel>7) {
	JOptionPane.showMessageDialog(null, "You really love your pet!");
	break;
}
	}
	}

	// 4. Create methods to handle each of your user selections.
	public static void walk () {
		JOptionPane.showMessageDialog(null, "The walk felt nice, and your pet is feeling better");
		happinesslevel = happinesslevel+2;
	}
	public static void feed () {
		JOptionPane.showMessageDialog(null, "The food was tasty and your pet is now happy");
		happinesslevel = happinesslevel+1;
	}
	public static void cuddle() {
		JOptionPane.showMessageDialog(null,"Your pet feels nice after cuddling, and is in a good mood.");
		happinesslevel = happinesslevel+3;
	}
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}