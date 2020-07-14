package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
	
		 public static void main(String[] args) {

		SkillPractice skills = new SkillPractice();
		           skills.skill1();
		           skills.skill2();
		           skills.skill3();
		           skills.skill4();
		           skills.skill5();
		 }

		 void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int cents = Integer.parseInt(dimes);

		// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + cents*10 + " cents");



		// Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog(null, "How tall are you in inches?");

int inches = Integer.parseInt(height);

		// If they are shorter than 36 inches, tell them to eat their Wheaties
if (inches<36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties!");
}



		 }

		 void skill2() {// Write a loop to print every third number between 1 and 30 to the console 

for (int i = 1; i < 31; i++) {
	if (i%3==0) {
		System.out.println(i);
	}
}





		 }

		 void skill3() {// Get a random number that is less than 20 and print it to the console 

int random1 = new Random().nextInt(20);
System.out.println(random1);
		// Get another random number that is less than 10 and print it to the console 
int random2 = new Random().nextInt(10);
System.out.println(random2);

		// Using a pop-up, tell the user the difference between the numbers// Hint: use subtraction 

if(random1>random2) {
JOptionPane.showMessageDialog(null,"The difference between the two random numbers is" +  (random1-random2));
}else {
	JOptionPane.showMessageDialog(null,"The difference between the two random numbers is" + (random2-random1));
}
			}

		 void skill4() {// In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog (null,"What city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City 
if(city.equals("San Diego")) {
	JOptionPane.showMessageDialog(null,"You live in America's Finest City!");
}else {
	JOptionPane.showMessageDialog(null,"Move to San Diego!");
}


		// Otherwise, tell them to move to San Diego 



		// Create a variable - cars - and initialize it to the number of cars your family has.// If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars = 3;

if (cars==0) {
	JOptionPane.showMessageDialog(null, "You probably use public transportation!");
}
		// If there is 1 car, use a pop-up to display the make/model of the car 

else if(cars==1) {
	JOptionPane.showMessageDialog(null, "You have a Lexus 450 H!");
}

		// If there is more than 1 car, use a pop-up to display how many wheels the// cars have between them. 
else {
	JOptionPane.showMessageDialog(null,"Your cars have" + (4*cars) + "wheels combined!");
}


		 }

		 void skill5() {// In a pop-up, ask the user for the name of their school 

String school = JOptionPane.showInputDialog(null, "What school do you go to?");

		// In another pop-up, tell the user, that their school is a fantastic school.// You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null,school + " is a fantastic school!");


		 }
		 }

