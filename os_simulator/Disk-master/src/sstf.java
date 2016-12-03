//DONE
import java.util.Scanner;

public class sstf {
	Scanner x=new Scanner(System.in);
	public int[] position;
	public int[] visit;
	public int[][] dif;
	public int pos;
	public int num;
	public sstf()
	{
		System.out.println("Enter total number of files :");
		num=x.nextInt();
		System.out.println("Enter head's initial position : ");
		pos=x.nextInt();
		visit=new int[num];
		position=new int[num];
		dif=new int[num][2];
	}
	public void input()
	{
		int i=0;
		for(i=0;i<num;i++)
		{
			position[i]=x.nextInt();
			visit[i]=0;	
		}
	}
	public void sort()
	{
		for(int i=0;i<num;i++)
		{
			int min=i;
			for(int j=i;j<num;j++)
			{
				if(dif[min][0]>dif[j][0])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp1=dif[min][0];
				int temp2=dif[min][1];
				dif[min][0]=dif[i][0];
				dif[min][1]=dif[i][1];
				dif[i][0]=temp1;
				dif[i][1]=temp2;
			}
		}
	}
	public void closest(int n)
	{
		for(int i=0;i<num;i++)
		{
			int temp;
			temp=position[i]-n;
			if(temp<0)
				temp=temp*(-1);
			if(visit[i]==0)
				dif[i][0]=temp;
			else
				dif[i][0]=100000000;
			dif[i][1]=i+1;
		}
		sort();
		if(visit[dif[0][1]-1]==0)
		{
			System.out.println("File Accessed "+dif[0][1]+" at "+position[dif[0][1]-1]);
			visit[dif[0][1]-1]=1;
			closest(position[dif[0][1]-1]);
		}
		else
		{
			return;
		}
	}
	public void algo()
	{
		closest(pos);
	}
}