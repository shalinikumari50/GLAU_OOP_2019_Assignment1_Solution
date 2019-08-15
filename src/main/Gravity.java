/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;// uncomment the above line to use input in your program.

public class Gravity {
	// TODO 1: Create the main method
	public static void main(String[] args) {
		/* TODO 2:
		 *   a. Declare all your necessary variables inside main method.
		 *   b. Declare a constant for 'gravity', assume the value to be 9.8
		 *   c. Calculate the result and print it to the screen.
		 * */
        double accOfGravity = 9.8;
        double time;
        double speed;
        double distance;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextDouble();
        speed = accOfGravity * time;
        distance = (accOfGravity * time * time) / 2;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " and the distance the object has travelled in the " + time + " seconds after the relase is " + distance);




	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
