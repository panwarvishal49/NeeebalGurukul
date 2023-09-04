package NeebalGurukulDay1;
import java.util.Scanner;


public class Salary {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Salary :");
		int a=sc.nextInt();
		
		if(a<20000) {
			a+=5000;
		}
		System.out.println("Final Salary = "+a);
		sc.close();
	}
	
}
