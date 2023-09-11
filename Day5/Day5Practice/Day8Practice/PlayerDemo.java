package Day8Practice;
import java.util.Scanner;


public class PlayerDemo {

	public static void main(String[] args) {
		Player p=new Player("AX","Brazil",2);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Player Name:");
		p.setName(sc.nextLine());
		System.out.println("Enter Country Name:");
		p.setCountry(sc.nextLine());
		System.out.println("Enter No of Golds:");
		p.setNoOfGolds(sc.nextInt());
		
		System.out.println(p);
		
		sc.nextLine();
		System.out.println("Enter Country name to match");
		String x=sc.nextLine();
		
		
		if(x.equals(p.getCountry()))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();

	}

}
class Player{
	String name;
	String country;
	int noOfGolds;
	public String toString() {
		return "Name:"+name+" Country:"+country+" No. Of Golds:"+noOfGolds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getNoOfGolds() {
		return noOfGolds;
	}
	public void setNoOfGolds(int noOfGolds) {
		this.noOfGolds = this.noOfGolds+noOfGolds;
	}
	Player(){
		
	}
	Player(String name,String country,int noOfGolds){
		this.name=name;
		this.country=country;
		this.noOfGolds=noOfGolds;
	}
}
