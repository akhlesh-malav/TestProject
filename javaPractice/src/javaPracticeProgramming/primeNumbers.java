package javaPracticeProgramming;

public class primeNumbers {

	int n1 = 0, flag;
	static int num =13;

	public static void main(String[] args) {

		if (num==0 || num==1) {
			System.out.println("Not prime number");
		} 
		else {

			if (num % 2==0) {
				System.out.println("This is prime number");
			} else {

				System.out.println("Not prime number");
			}
		}
	}

}
