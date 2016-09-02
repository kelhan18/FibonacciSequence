//Keller Han
//Fibonacci class contains all the methods necessary to calculate Fibonacci numbers and calculate the ratio for numbers after 2

public class Fibonacci {

	//default constructor
	public Fibonacci(){
	}
	
	/*-------------------------------------------------------------
	|  Method: [calculate(int n)]
	|
	|  Purpose:  [This method, if called, will display the fibonacci numbers up until the passed int parameter n. If n is > 2, it will add the two previous fibonacci numbers.]
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The fibonacci numbers will be calculated and returned.]
	|
	|  Parameters:
	|      	n - defined integer, how many fibonaci numbers calculated
	|
	|  Returns:  [double]
	*------------------------------------------------------------------*/
	
	public double calculate(int n) {
		if (n-1 == 0)
			return 0;
		else if (n-1 == 1)
			return 1;
		else
			return calculate(n-1) + calculate (n-2);
	}
	
	/*-------------------------------------------------------------
	|  Method: [result(int n)]
	|
	|  Purpose:  [This method, if called, will display the fibonacci numbers ratios if n is > 2.
	|
	|  Pre-condition:  [N/A]
	|
	|  Post-condition: [The fibonacci numbers ratio will be returned.]
	|
	|  Parameters:
	|      	n - defined integer, how many fibonaci numbers calculated
	|
	|  Returns:  [double]
	*------------------------------------------------------------------*/
	
	public double result(int n) {
		return calculate(n) / (double)calculate(n-1);
	}
}
	


