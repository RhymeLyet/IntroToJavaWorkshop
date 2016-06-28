package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot r = new Robot();
	
	void go() {
		//drawTriangle(100); // 3. delete this line (used only for testing)
		r.hide();
		// 6. Make the robot go as fast as possible
		r.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int size = 1;
		// 7. Do the following (up to step 10) 60 times
		while(true){
			// 9. Change the color of the pen to a random color
			r.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
			size=size+(10/6);
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(size);
			// 10. Turn the tortoise 6 degrees to the right
			r.turn(1);
		}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {
		
		for(int i = 0; i<3; i++){
			r.penDown();
			r.move(length);
			r.turn(120);
			r.penUp();
		}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
