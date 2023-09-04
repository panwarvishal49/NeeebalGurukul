package AssignmentDay1;
import java.util.Scanner;

public class Problem4 {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of Passenger : ");
		int input= sc.nextInt();//Taking Input
		
		int no_of_buses = input/50; //Finding no of buses will be user of commuting
		
		int travelling_Passenger = no_of_buses*50; //Finding no of passenger gonna travel  
		
		System.out.println("No of passenger travelling = "+travelling_Passenger);//Answer
		
	sc.close();	
	}
}
