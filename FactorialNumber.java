package week1.day1;

public class FactorialNumber {

	public static void main(String[] args) {

		int Input = 5;

		int fact = 1;

		for (int i = 1; i <= Input; i++) 
		{
			
      fact = i * fact;

		}

		System.out.println("The factorial of 5 is "+fact);
	}

}
