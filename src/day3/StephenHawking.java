package day3;

import java.util.Random;

public class StephenHawking {

	// 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args){
		String s;
		while(true){
			//s = JOptionPane.showInputDialog("input");
			//speak(s);
			int x = new Random().nextInt(128);
			String X = ((char) x)+"";
			speak(X);
		}
		// 2. ask the user for a sentence
		
		// 3. call the speak method below and send it the sentence
		
		// 4. repeat steps 2 and 3 a lot of times
	}
	

	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
