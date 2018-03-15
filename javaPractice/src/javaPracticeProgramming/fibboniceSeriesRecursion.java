package javaPracticeProgramming;

public class fibboniceSeriesRecursion {
	
	static int n1=0,n2=1,n3=0;
	
	static void printFabbonacci(int count){
		
		if(count>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(","+n3);
			printFabbonacci(count-1);
		}
		
	}
	
	public static void main(String[] args)
	{
		int count=10;
		System.out.print("fabbonacci series using recursion is "+n1+","+n2);
		printFabbonacci(count-2);
		
	}

}
