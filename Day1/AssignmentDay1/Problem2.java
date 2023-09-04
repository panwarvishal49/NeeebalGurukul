package AssignmentDay1;
import java.util.Scanner;

public class Problem2 {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number : ");
	int a= sc.nextInt();//Taking Input
	int f1 = a/100;//Getting first half
	int f2 = a%100;//Getting second half
	
	int swapped=f2*100+f1;//Swapping of first half with second half
	
	System.out.println("Answer = "+swapped);//Answer
	
	sc.close();
	}
}
