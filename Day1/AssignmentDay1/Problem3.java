package AssignmentDay1;
import java.util.Scanner;

public class Problem3 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Days : ");
		int input= sc.nextInt();//Taking Input
		
		int years = input/365; input-=365*years; //After getting years Subtract the days used in years
		int months = input/30; input-=30*months; //After getting months Subtract the days used in months
		int weeks = input/7; //Getting weeks in remaining days
		int days=input-7*weeks; //Getting remaining days
		
		System.out.printf("%d Years : %d Months : %d Weeks : %d Days",years,months,weeks,days).println();//Answer
		
		
	sc.close();			
	}
}
