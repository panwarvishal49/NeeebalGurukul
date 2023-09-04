package AssignmentDay1;
import java.util.Scanner;

public class Problem8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Name :"); 
		String name = sc.nextLine();//getting name
		
		System.out.print("Units :"); 
		int units = sc.nextInt();//getting units
		int un=units;//storing value of units for further use
		
		double res;
		
		if(units<=100)
		{
			res = units*4;
		}
		if(units<=300)
		{
			res=400;
			units-=100;
			res+=units*5;
		}
		else {
			res=1400;
			units-=300;
			res+=units*10;
		}
		if(res>1000) {
			res =((0.05*res)+res);//Adding surcharge to the amount if amount is greater than 1000
		}
		double total = (0.18*res + res);//Adding GST on overall amount
		
		System.out.println("Name : "+name);
		System.out.println("Units : "+un);
		System.out.println("Amount : "+total);
		
		sc.close();
	}

}
