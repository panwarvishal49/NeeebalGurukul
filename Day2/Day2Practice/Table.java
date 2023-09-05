package Day2Practice;
import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d X %d = %d",a,i,a*i).println();
		}
		sc.close();
	}

}
