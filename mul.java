import java.util.*;
public class madd{
publc static void main (String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System,out.println("enter the rows and colomns");
	int row1=sc.nextInt();
	int col1=sc.nextInt();
	System,out.println("enter the elements matrix 1");
	int [][]a=new int [row][col1];
	for(int i=0;i<=row1;i++)
	{
		for(int j=0;j<=col1;j++)
		{
			a[i][j]=sc.nextInt();
		}
	}

	for(int i=0;i<=row1;i++)
	{
		for(int j=0;j<=col1;j++)
		{
			System,out.println(" "+a[i][j]+" ");
		}
	}


	System,out.println("enter the rows and colomns")
	int row1=sc.nextInt();
	int col1=sc.nextInt();
	System,out.println("enter the elements matrix 1")
	int [][]b=new int [row][col1];
	for(int i=0;i<=row1;i++)
	{
		for(int j=0;j<=col1;j++)
		{
			b[i][j]=sc.nextInt();
		}
	}
	System,out.println("Display")
	int [][]c= new int[row1][col2];
	for(int i=0;i<=row1;i++)
	{
		for(int j=0;j<=col1;j++)
		{
			System,out.println(" "+b[i][j]+" ");
		}
	}
	int [][]c= new int[row1][col2];
	if(row1==col2)
	{
		for(int i=0;i<=row1;i++)
		{
			for(int j=0;j<=col2;j++)
			{
			   c[i][j]=0;
				for(int k=0;k<row2;k++)
				{
				c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
	for(int i=0;i<=row1;i++)
	{
		for(int j=0;j<=col2;j++)
		{
			System.out.println(c[i][j]);
		}
	}
	else
        System.out.println("not applicatble");
        
        }
}