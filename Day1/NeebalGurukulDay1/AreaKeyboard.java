package NeebalGurukulDay1;
import java.util.Scanner;

public class AreaKeyboard {
	
	public static void main(String[] args) {

		System.out.print("Enter radius of circle : ");
		Scanner sc =new Scanner(System.in);

		double r=sc.nextDouble();
		double a = 3.14*r*r;
		System.out.println("Answer = "+a);
		sc.close();
	}
}