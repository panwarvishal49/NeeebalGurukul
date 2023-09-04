package NeebalGurukulDay1;
import java.util.Scanner;

public class leapYear {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Year :");
		int a=sc.nextInt();
		
		if((a%4==0&&a%100!=0)||a%400==0) {
			System.out.println("It is leap year");
		}
		else{
			System.out.println("It is not leap year");
		}
		
		sc.close();
	}

}
