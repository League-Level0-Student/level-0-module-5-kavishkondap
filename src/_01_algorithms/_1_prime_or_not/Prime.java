


package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Prime {
public static void main(String[] args) {
	boolean stuff = true;
String num = 	JOptionPane.showInputDialog(null,"Enter in an integer");
	int number = Integer.parseInt(num);
	for (int i = 2; i < number; i++) {
		if ((number%i==0) ) {
			JOptionPane.showMessageDialog(null, "This is not a prime number");
			stuff = false;
			break;
		}
			
		}
	if(stuff) {
		JOptionPane.showMessageDialog(null, "Congrats you found a prime number!!");
	}
	

	
	
}}
