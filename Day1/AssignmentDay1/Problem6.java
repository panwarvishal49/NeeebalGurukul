package AssignmentDay1;
import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :"); 
		int num=sc.nextInt();//getting input
		
		int d3=num%10;//finding digit at ones place
		int d2=num/10%10;//finding digit at tenth place
		int d1=num/10/10;// finding digit at hundredth place
		
		double result= Math.pow(d3, 3)+ Math.pow(d2, 3)+Math.pow(d1, 3); //Evaluating cubic sum of each individual digits
		
		if(result==num) {
			System.out.println(num + "is an armstrong number");
		}
		else {
			System.out.println(num + "is not an armstrong number");
		}
		
		sc.close();
	}
}
