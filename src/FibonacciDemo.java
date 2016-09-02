//Keller Han
//Write a demo class that will create an object of the class Fibonacci and then run it. The user will input how many Fibonacci numbers
//he/she would like calculated, and the program will display the numbers up to the input

import java.util.Scanner;

public class FibonacciDemo {

	/*-------------------------------------------------------------
	|  Method: [Main]
	|
	|  Purpose:  [To create a demo where we test the Fibonacci() class and display the Fibonacci numbers up until the user input number.]
	|
	|  Pre-condition:  [The Fibonacci() class must contain all the methods necessary to calculate the fibonacci numbers, and determine ratios.]
	|
	|  Post-condition: [The fibonacci numbers will be displayed, and the numbers after 2 will also have the ratios calculated and displayed.]
	|
	|  Parameters: [N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	
	public static void main(String[] args) {
		Fibonacci demo = new Fibonacci();
		System.out.println("How many Fibonacci numbers would you like calculated?: ");
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
        for (int i = 1; i <= 2; i++)
            System.out.println("Fibonacci #" + i + ": " + demo.calculate(i));
        for (int i = 3; i <= n; i++)
        	System.out.println("Fibonacci #" + i + ": " + demo.calculate(i) + "; " + demo.calculate(i) + "/" + demo.calculate(i-1) + " = " + demo.result(i));
	}

}
