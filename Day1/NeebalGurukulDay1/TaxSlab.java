package NeebalGurukulDay1;
import java.util.Scanner;

public class TaxSlab {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter CTC :");
		double a=sc.nextDouble();
		double tax;
		if(a>1500000) {
			tax=(a/100)*25;
		}
		else if(a>1000000) {
			tax=(a/100)*20;
		}
		else if(a>750000)
		{
			tax=(a/100)*10;
		}
		else {
			tax=0;
		}
		System.out.println("Total CTC = "+a);
		System.out.println("Total Tax = "+tax);
		System.out.println("In Hand = "+(a-tax));
		
		
		sc.close();
	}

}
