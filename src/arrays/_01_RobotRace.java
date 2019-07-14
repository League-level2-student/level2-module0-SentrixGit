package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		Robot[] Robots = new Robot[1000];
		
		for (int i = 0; i < Robots.length; i++) {
			Robots[i] = new Robot();
			
			Robots[i].moveTo((i) + 50, 1080);
			Robots[i].setSpeed(50);
			Robots[i].setWindowSize(1920,1080);
			Robots[i].miniaturize();
		}
		
		Random pos = new Random();
		int robotWon = 0;
		
		for (int i = 0; robotWon == 0; i++) {
			if (i == Robots.length)
				i = 0;
				
			Robots[i].move(pos.nextInt(5));
			
			if (Robots[i].getY() <= 10) {
				robotWon = i;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Robot " + (robotWon + 1) + " won the game!");
	}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
