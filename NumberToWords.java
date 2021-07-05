
public class NumberToWords {
	
	public static void numberToWords(int number) {
		if (number < 0)
			System.out.println("Negative");
			int reverse_number = getReverse(number);
			int trivial = getDigitCount(number) - getDigitCount(reverse_number);
			   int last_digit = 0;
			   while (true) {
				   last_digit = reverse_number % 10;
				   switch(last_digit) {
				   case 0:
					   System.out.println("Zero");
					   break;
				   case 1, -1: 
					   System.out.println("One");
					   break;
				   case 2, -2: 
					   System.out.println("Two");
					   break;
				   case 3, -3: 
					   System.out.println("Three");
					   break;
				   case 4, -4: 
					   System.out.println("Four");
					   break;
				   case 5, -5: 
					   System.out.println("Five");
					   break;
				   case 6, -6: 
					   System.out.println("Six");
					   break;
				   case 7, -7: 
					   System.out.println("Seven");
					   break;
				   case 8, -8: 
					   System.out.println("Eight");
					   break;
				   case 9, -9: 
					   System.out.println("Nine");
				   }
				   reverse_number /= 10;
				   if (reverse_number == 0) {
					   break;
				   }
			   }
			   for (int i = 0; i < trivial; i++) {
				   System.out.println("Zero");
			   }
		}
		   
	public static int getDigitCount(int number) {
		int counter = 1; // points number of digits of given number
		    while (number >= 10 || number <= -10) {
			 counter++;
             number /= 10;
		}
		return counter;
	}
	
	public static int getReverse(int number) {
		int reverse_number = 0;
		
			while (number >= 1 || number <= -1) {
				reverse_number += number %10 ;
				reverse_number *= 10;
				number /= 10;
			}
		return reverse_number/10;
	}
	
	public static boolean canPack(int bigCount, int smallCount, int goal) {
		if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
			return false;
		} 
		if ((bigCount * 5) + smallCount < goal) {
			return false;
		} 
			int requiredBigCount = bigCount;
		    while (requiredBigCount * 5 > goal) {
		    	requiredBigCount--;
		    }
		    
		    if (requiredBigCount * 5 + smallCount >= goal) {
		    	return true;
		    }
		    return false;
	}
  
}