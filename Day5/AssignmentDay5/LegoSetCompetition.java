package AssignmentDay5;
import java.util.Scanner;

public class LegoSetCompetition {

	public static void main(String[] args) {
		int m=0;
		int n=0;
		int p=0;
		
		CompetitionLog p1=new CompetitionLog(1,"","",0);
		CompetitionLog p2=new CompetitionLog(2,"","",0);
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Lego Set Competetion!");
		boolean f=true;
		while(f!=false) {

			String lname[]=new String[3];
			int npieces[]=new int[3];
			System.out.println("Enter Name of Lego Set 1 :");
			lname[0]=sc.next();
			System.out.println("Enter the number of pieces in Lego Set 1 :");
			npieces[0]=sc.nextInt();
			System.out.println("Enter Name of Lego Set 2 :");
			lname[1] =sc.next();
			System.out.println("Enter the number of pieces in Lego Set 2 :");
			npieces[1]=sc.nextInt();
			System.out.println("Enter Name of Lego Set 3 :");
			lname[2] =sc.next();
			System.out.println("Enter the number of pieces in Lego Set 3 :");
			npieces[2]=sc.nextInt();

		
			boolean flag=true;
			int j=1;
			while(flag)
			{
				System.out.println("Enter the no of pieces player 1 used for building on day "+(j+p));
				p1.setPiecesBuilt(sc.nextInt());
				System.out.println("Enter the no of pieces player 2 used for building on day "+(j+p));
				p2.setPiecesBuilt(sc.nextInt());
				
				if(p1.getPiecesBuilt()>=npieces[0]+npieces[1]+npieces[2]&&p2.getPiecesBuilt()>=npieces[0]+npieces[1]+npieces[2])
				{
					n+=p1.getPiecesBuilt();
					m+=p2.getPiecesBuilt();
					p+=j;
					
					p1.setEqual();
					p2.setEqual();
					
					System.out.println("The competetion ended in a tie! There will be a tiebreaker round");
					flag=false;
				}
				else if(p1.getPiecesBuilt()>=npieces[0]+npieces[1]+npieces[2])
				{
					p1.setCompleteSets(lname[0]+" "+lname[1]+" "+lname[2]);
					p1.setIncompleteSets("none");
					if(p2.getPiecesBuilt()<npieces[0])
					{
						p2.setCompleteSets("none");
						p2.setIncompleteSets(lname[0]+" "+lname[1]+" "+lname[2]);
					}
					else if(p2.getPiecesBuilt()<(npieces[0]+npieces[1]))
					{
						p2.setCompleteSets(lname[0]);
						p2.setIncompleteSets(lname[1]+" "+lname[2]);
					}
					else if(p2.getPiecesBuilt()<(npieces[0]+npieces[1]+npieces[2]))
					{
						p2.setCompleteSets(lname[0]+" "+lname[1]);
						p2.setIncompleteSets(lname[2]+" ");
						
					}
					System.out.println("Congratulations to player 1 for winning the Lego sets Competitions!");
					System.out.println("Additional information about the competition results is below");
					p1.setPiecesBuilt(m);
					p2.setPiecesBuilt(n);
					System.out.println(p1);
					System.out.println(p2);
					System.out.println("The Competetion lasted "+(j+p)+" days");
					
					flag=false;
					f=false;
				}
				else if(p2.getPiecesBuilt()>=npieces[0]+npieces[1]+npieces[2])
				{
					p2.setCompleteSets(lname[0]+" "+lname[1]+" "+lname[2]);
					p2.setIncompleteSets("none");
					if(p1.getPiecesBuilt()<npieces[0])
					{
						p1.setCompleteSets("none");
						p1.setIncompleteSets(lname[0]+" "+lname[1]+" "+lname[2]);
					}
					else if(p1.getPiecesBuilt()<(npieces[0]+npieces[1]))
					{
						p1.setCompleteSets(lname[0]);
						p1.setIncompleteSets(lname[1]+" "+lname[2]);
					}
					else if(p1.getPiecesBuilt()<(npieces[0]+npieces[1]+npieces[2]))
					{
						p1.setCompleteSets(lname[0]+" "+lname[1]);
						p1.setIncompleteSets(lname[2]+" ");
					}
					System.out.println("Congratulations to player 2 for winning the Lego sets Competitions!");
					System.out.println("Additional information about the competition results is below");
					p1.setPiecesBuilt(m);
					p2.setPiecesBuilt(n);
					System.out.println(p1);
					System.out.println(p2);
					System.out.println("The Competetion lasted "+(j+p)+" days");
					flag=false;
					f=false;
				}
				j++;
			}
			
			
			}
		sc.close();
		}

}
class CompetitionLog{
	private int playerNumber;
	private String completeSets;
	private String incompleteSets;
	private int piecesBuilt;
	
	CompetitionLog(int playerNumber,String completeSets,String incompleteSets,int piecesBuilt)
	{
		this.playerNumber= playerNumber;
		this.completeSets=completeSets;
		this.incompleteSets=incompleteSets;
		this.piecesBuilt=piecesBuilt;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getCompleteSets() {
		return completeSets;
	}

	public void setCompleteSets(String completeSets) {
		this.completeSets += this.completeSets+ completeSets;
	}

	public String getIncompleteSets() {
		return incompleteSets;
	}

	public void setIncompleteSets(String incompleteSets) {
		this.incompleteSets += this.incompleteSets+ incompleteSets;
	}

	public int getPiecesBuilt() {
		return piecesBuilt;
	}

	public void setPiecesBuilt(int piecesBuilt) {
		this.piecesBuilt = this.piecesBuilt+piecesBuilt;
	}
	public void setEqual()
	{
		this.piecesBuilt=0;
		//this.completeSets="";
	}
	public String toString() {
		return "Player "+playerNumber+" completed the following sets: "+completeSets+"\r\n"
				+ "Player "+playerNumber+" did not completed the following sets: "+incompleteSets+"\r\n"
				+ "Player "+playerNumber+" built total of "+piecesBuilt+" pieces";
				
	}
	
}
