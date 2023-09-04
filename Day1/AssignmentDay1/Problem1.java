package AssignmentDay1;
import java.util.Scanner;

public class Problem1 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter milliseconds : ");
	int a= sc.nextInt();//Taking Input
	int hours = a/3600000;a-=3600000*hours;//After getting hours Subtract the milliseconds used in hours
	int minutes= a/60000; a-=60000*minutes;//After getting minutes Subtract the millisecond using in minutes
	int seconds= a/1000;//Getting seconds
	
	System.out.println("Time = "+ hours+":"+minutes+":"+seconds);//Here is our answer
	sc.close();
	}
}
