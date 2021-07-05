
public class LargestPrime {

	public static int getLargestPrime(int number) {
		  if (number < 2)
			  return -1; // Invalid value
		  
		  	int largestPrime = 2;
		  	while (number > 1) {
		  		while (number % largestPrime != 0) {
		  			largestPrime++;
		  		} 
		  		number /= largestPrime;
		  	}
		  	
		  	return largestPrime;
	  }
}
