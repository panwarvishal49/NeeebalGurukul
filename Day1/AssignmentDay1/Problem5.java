package AssignmentDay1;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :"); 
		int num1=sc.nextInt();//getting first number
		
		System.out.println("Enter second number :");
		int num2=sc.nextInt();//getting second number
		
		System.out.println("Enter second number :");
		int num3=sc.nextInt();//getting third number
		
		int l1= num1>num2?num1:num2;//getting larger number from first and second number
		int l2=l1>num3?l1:num3;//getting larger from result1 and third number
		System.out.println("Answer = "+l2);//answer
		
		sc.close();
		}

}
