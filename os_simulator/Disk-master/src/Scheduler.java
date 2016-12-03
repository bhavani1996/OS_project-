import java.util.Scanner;

public class Scheduler {
	public static void main(String[] args)
	{
		Scanner u=new Scanner(System.in);
		int choice=2;
		while(choice!=6)
		{
			System.out.println("Enter choice :");
			System.out.println("1)FCFS\n2)SSTF\n3)SCAN\n4)CSCAN\n5)LOOK\n6)QUIT");
			choice =u.nextInt();
			if(choice==1)
			{
				fcfs f=new fcfs();
				System.out.println("Enter addresses :");
				f.input();
				f.algo();
			}
			if(choice==2)
			{
				sstf s=new sstf();
				System.out.println("Enter addresses :");
				s.input();
				s.algo();
			}
			if(choice==3)
			{
				scan sc=new scan();
				System.out.println("Enter addresses :");
				sc.input();
				sc.algo();
			}
			if(choice==4)
			{
				cscan csc=new cscan();
				System.out.println("Enter addresses :");
				csc.input();
				csc.algo();
			}
			if(choice==5)
			{
				look lk=new look();
				System.out.println("Enter addresses :");
				lk.input();
				lk.algo();
			}
		}
	}
}
