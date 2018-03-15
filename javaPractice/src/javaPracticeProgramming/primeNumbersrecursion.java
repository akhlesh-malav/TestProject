package javaPracticeProgramming;

public class primeNumbersrecursion {

	int n1 = 0, flag;
	//static int num =13;
	
	static void primeNumber(int num){

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
	
	

	public static void main(String[] args) {
		
		
		primeNumber(11);
		primeNumber(12);
		primeNumber(13);
		primeNumber(14);
		
		

	}
}
