package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {

		int Input = 13;

		boolean flag = false;

		for (int i = 2; i <= (Input / 2); i++) {

			if ((Input % i) == 0) {

				flag = true;

			}
		}

		if (flag == false) {

			System.out.println(Input+" is"+" Prime Number");

		}

		else {

			System.out.println(Input+" is"+" Not a Prime Number");

		}

	}

}
