
public class LargestPrime {
	public static int getLargestPrime(int number) {
		  if (number < 2)
			  return -1; // Invalid value
		  
		  	int largestPrime = 2; // possible largest prime factor initially
		  	while (number > 1) { // search for factors until number goes to 1
				// Find next prime
		  		while (number % largestPrime != 0) {
		  			largestPrime++;
		  		} 
		  		number /= largestPrime; // update number
		  	}
		  	
		  	return largestPrime;
	  }
}
