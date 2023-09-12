package AssignmentDay9;
import java.util.Scanner;
import java.util.Random;

public class Problem20 {

	public static void main(String[] args) {
		Random x=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Min limit :");
		int min=sc.nextInt();
		
		System.out.print("Enter Min limit :");
		int max=sc.nextInt();
		
		int num=x.nextInt(max-min)+min;
		System.out.println("Random no = "+num);
		
		sc.close();
		

	}

}
