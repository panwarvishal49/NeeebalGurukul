package Day8Practice;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		Customer c1=new Customer("Vishal",123,1000);
//		Customer c2=new Customer("Ram",124,1000);
		Customer a[]=new Customer[5];
		a[0]=new Customer("Gaurav",1,500);
		a[1]=new Customer("Ravi",2,500);
		a[2]=new Customer("Sagar",3,500);
		a[3]=new Customer("Udit",4,500);
		a[4]=new Customer("Deepu",5,500);
		
		
		int i=1;
		while(i!=5)
		{
			System.out.println("Option 1.Make A Deposit.");
			System.out.println("Option 2.Withdrawl amount.");
			System.out.println("Option 3.Check Balance.");
			System.out.println("Option 4 Total amount in bank.");
			System.out.println("Option 5 Exit.");
			System.out.println("Enter your choice :");
			int x =sc.nextInt();
			switch(x) {
			
			case 1:
				System.out.println("Enter Customer Id:");
				int c = sc.nextInt();
				
				for(int k=0;k<a.length;k++)
				{
					if(c==a[k].getC_id())
					{
						System.out.println("Enter Amount to be Deposit :");
						a[k].deposit(sc.nextInt());
					}
				}
				break;
				
			case 2:
				System.out.println("Enter Customer Id:");
				int d = sc.nextInt();
				
				for(int k=0;k<a.length;k++)
				{
					if(d==a[k].getC_id())
					{
						System.out.println("Enter Amount to be Withdrawl :");
						int z=sc.nextInt();
						if(z>a[k].getBal())
						{
							System.out.println("Insufficiant Balance");
						}
						else {
							a[k].minus(z);
						}
					}
				}
				break;
			case 3:
				System.out.println("Enter Customer Id:");
				int v=sc.nextInt();
				for(int k=0;k<a.length;k++)
				{
					if(v==a[k].getC_id()) {
						System.out.println(a[k].getBal());
					}
				}
				break;
			case 4:
				int amount=Customer.total();
				System.out.println("Total amount in Bank = "+amount);
				break;	
			case 5:
				i=5;
				break;
			
			default :
				System.out.println("Invalid choice");
				break;
			}
		}
		sc.close();
		

	}

}
class Customer{
	String name;
	int c_id;
	int bal;
	private static int amount=0;
	public static int total(){
		return amount;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getBal() {
		return bal;
	}
	public void deposit(int bal) {
		amount+=bal;
		this.bal = this.bal+bal;
	}
	public void minus(int bal) {
		amount-=bal;
		this.bal=this.bal-bal;
	}
	Customer(String name,int c_id,int bal){
		this.name=name;
		this.bal=bal;
		this.c_id=c_id;
		amount+=bal;
	}
	
}
