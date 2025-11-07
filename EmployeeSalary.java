import java.util.Scanner;
public class EmployeeSalary
{
	public static int bubbleSort(int A[])
	{
		int temp=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]<A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		return -1;
	}
	public static void top5Salaries(int A[])
	{
		System.out.println("Top 5 Employees salaries are:");
		for(int i=0;i<5;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println();
	}
	public static void main(String s[])
	{
		Scanner sc= new Scanner(System.in);
		int A[]=new int[10];
		System.out.println("Enter the Employees salaries:");
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		bubbleSort(A);
		System.out.println("List of Employees Salaries is:");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		top5Salaries(A);
		sc.close();
	}
}