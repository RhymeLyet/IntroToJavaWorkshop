package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
		Robot robot = new Robot();
		robot.penDown();
		for(int t=1;t<9;t++){
			if(t%2==0){robot.setPenColor(0,0,255);}
			else{robot.setPenColor(255,255,0);}
			robot.move(128);
			robot.turn(45);
		}
		robot.penUp();
		robot.hide();
	}
}
