//DONE
import java.util.Scanner;

public class scan {
	Scanner x=new Scanner(System.in);
	public int num;
	public int[][] position;
	public int pos;
	
	public scan()
	{
		System.out.println("Enter total number of files :");
		num=x.nextInt();
		System.out.println("Enter head's initial position : ");
		pos=x.nextInt();
		position=new int[num][2];
	}
	public void input()
	{
		for(int i=0;i<num;i++)
		{
			position[i][0]=x.nextInt();
			position[i][1]=i+1;
		}
	}
	public void sort()
	{
		for(int i=0;i<num;i++)
		{
			int min=i;
			for(int j=i;j<num;j++)
			{
				if(position[min][0]>position[j][0])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp1=position[min][0];
				int temp2=position[min][1];
				position[min][0]=position[i][0];
				position[min][1]=position[i][1];
				position[i][0]=temp1;
				position[i][1]=temp2;
			}
		}
	}
	public void algo()
	{
		sort();
		int i;
		for(i=0;i<num-1;i++)
		{
			if(position[i][0]<=pos && position[i+1][0]>pos)
				break;
		}
		int start=i;
		for(i=start;i>=0;i--)
		{
			System.out.println("1"+i+"File Accessed "+position[i][1]+" at "+position[i][0]);
		}
		if(position[i+1][0]!=0)
			System.out.println("Head moves to 0");
		for(i=start+1;i<num;i++)
		{
			System.out.println("2"+i+"File Accessed "+position[i][1]+" at "+position[i][0]);
		}		
	}
}






















