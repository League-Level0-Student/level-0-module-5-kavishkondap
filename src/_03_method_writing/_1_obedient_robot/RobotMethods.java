package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotMethods {
	static Robot bob = new Robot();
	public static void main(String[] args) {
	
	String shape = 	JOptionPane.showInputDialog(null,"What shape do you want? The options are circle, triangle, or square");
	String color = JOptionPane.showInputDialog(null, "What color do you want? the options are red, blue, green, and random!");
	if (color.equals("red")) {
		bob.setPenColor(255, 0, 0);
	}else if (color.equals("green")) {
		bob.setPenColor(0, 255, 0);
	}else if(color.equals("blue")) {
		bob.setPenColor(0,0, 255);
	}else {
		bob.setRandomPenColor();
	}
	if (shape.equals("circle")) {
		drawCircle();
	}else if(shape.equals("triangle")) {
		drawTriangle();
	}else {
		drawSquare();
	}
}
public static void drawSquare(){
	bob.setSpeed(100);
	bob.penDown();
	for (int i = 0; i < 4; i++) {
	bob.move(200);
	bob.turn(90);
	}
}
	public static void drawTriangle() {
		bob.setSpeed(100);
		bob.penDown();
		for (int i = 0; i < 3; i++) {
			bob.move(200);
			bob.turn(60);
		}
	}
	public static void drawCircle() {
		bob.setSpeed(100);
		bob.penDown();
		for (int i = 0; i < 100; i++) {
			bob.move(30);
			bob.turn(10);
		}
	}

}

