package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot r = new Robot();
	
	void go() {
		r.hide();
		// 4. Make the robot move as fast as possible
		r.setSpeed(10);
		// 5. Set the pen width to 5
		r.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
		for(int i = 0; i<4; i++){
			// 7. Set the pen color to random
			r.setPenColor(0,0,0);
			// 1. Call the drawSquare() method
			drawSquare(256);
			// 8. Turn the robot 90 degrees to the right
			r.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare(int size) {
		for(int i = 0; i<4; i++){
			r.penDown();
			r.move(size);
			r.turn(90);
		}
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
