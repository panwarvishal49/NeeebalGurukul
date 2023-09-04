package AssignmentDay1;
import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :"); 
		int num=sc.nextInt();//getting input
		
		int hours=num/100;
		if(hours>12) {
			hours-=12;
		}
		
		int minutes=num%100;
		
		System.out.printf("time in 12 hours format = %d : %d",hours,minutes);//12 hours time format
		
		sc.close();
	}

}
