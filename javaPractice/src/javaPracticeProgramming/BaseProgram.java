package javaPracticeProgramming;

public class BaseProgram {

	public static void main(String args[]){
		
		System.out.println("\n Hello Java");
		
		//if else case
		 int number=14;  
		    if(number%2==0){  
		        System.out.println("\n even number");  
		    }else{  
		        System.out.println("\n odd number");  
		    }  
		    
		    //if else if case
		    int marks=65;  
		      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("\n C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }
		    
		    //switch case
		    int num=20;  
		    switch(num){  
		    case 10: System.out.println("10");break;  
		    case 20: System.out.println("\n 20");break;  
		    case 30: System.out.println("30");break;  
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  
		    
		    //for loop case
		    for(int i=1;i<=4;i++){  
		        System.out.println(i);  
		    }  
		    
		    //for each loop
		    
		    int arr[]={12,23,44,56,78};  
		    for(int i:arr){  
		        System.out.println(i);  
		    }  
		   
		    //Infinite loop
		    
//		    for(;;){  
//		        System.out.println("infinitive loop");  
//		    }  
		    
		    //Labeled for loop
		    
		    aa:  
		        for(int i=1;i<=3;i++){  
		            bb:  
		                for(int j=1;j<=3;j++){  
		                    if(i==2&&j==2){  
		                        break aa;  
		                    }  
		                    System.out.println(i+" "+j);  
		                }  
		        }  
	}

}
