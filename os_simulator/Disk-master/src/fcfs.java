//DONE
import java.util.Scanner;

public class fcfs {
	Scanner x=new Scanner(System.in);
	public int[] position;
	public int num;
	public fcfs()
	{
		System.out.println("Enter total number of files :");
		num=x.nextInt();
		position=new int[num];
	}
	public void input()
	{
		int i=0;
		for(i=0;i<num;i++)
			position[i]=x.nextInt();
	}
	public void algo()
	{
		int i=1;
		for(i=1;i<=num;i++)
			System.out.println("File Accessed "+i+" at "+position[i-1]);
	}
}
