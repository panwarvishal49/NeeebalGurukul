package AssignmentDay1;
import java.util.Scanner;

public class Problem7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number :"); 
		boolean count=false;
		int num=sc.nextInt();//getting input
		
		int hours=num/100;
		if(hours==0)
		{
			hours=12;
		}
		else if(hours>=12) {
			if(hours>12) {
				hours-=12;
			}
			count=true;
		}
		int minutes=num%100;
		if(count) {
			System.out.printf("time in 12 hours format = %d : %d pm",hours,minutes);//12 hours time format
		}
		else {
			System.out.printf("time in 12 hours format = %d : %d am",hours,minutes);//12 hours time format
		}
		sc.close();
	}

}
