import java.util.*;
public class Assignment8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);		//creating scanner object
		System.out.println("Enter number.");	
		int number= sc.nextInt(); 				//user input
		prime n= new prime(number);				//creating object for class prime
		PrimeThread t= new PrimeThread(number);		//creating object for class primethread
		t.start();
	}
}
class prime implements Runnable{
	Thread t1;
	int num;
	prime(int i){				//parameterized constructor
		num=i;
    t1=new Thread(this,"Prime number");
    System.out.println("t1 is created");
    t1.start();
    }
	public void run(){			//run method for performing action for prime number
		try{
			for(int i=2; i<=num/2; i++){
	            if(num % i == 0){
	            	System.out.println("number is not prime");		//prints not prime if the number is not prime
	            	return;
	            }
	        }
	        System.out.println("Number is prime");
		}
		catch(Exception e)				
        	{
            	System.out.println(e);
            }
	}
}
class PrimeThread extends Thread
{
	int num;
	public PrimeThread(int i) {			//primethread parameterized constructor
		num=i;
	}
	public void run()			//run method
	{
		System.out.println("Running Primethread which extended from thread class");
		try{
	         
	        for(int i=2; i<=num/2; i++){
	            if(num % i == 0){
	            	System.out.println("number is not prime-->PrimeThread");	//prints not prime if the number is not prime
	            	return;
	            }
	        }
	        System.out.println("Number is prime-->PrimeThread");
		}
		catch(Exception e){
        	System.out.println(e);
		}
	}
}