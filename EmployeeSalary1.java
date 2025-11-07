import java.util.Scanner;

public class EmployeeSalary1
{
	public static void selectionSort(int A[])
	{
		for(int i=0; i<A.length-1; i++)
		{
			int maxIndex = i;
			for(int j=i+1; j<A.length; j++)
			{
				if(A[j] > A[maxIndex])   
				{
					maxIndex = j;
				}
			}
			int temp = A[i];
			A[i] = A[maxIndex];
			A[maxIndex] = temp;
		}
	}
	
	public static void top5Salaries(int A[])
	{
		System.out.println("Top 5 Employees salaries are:");
		for(int i=0; i<5; i++)
		{
			System.out.print(A[i] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		int A[] = new int[10];
		System.out.println("Enter the Employees salaries:");
		for(int i=0; i<A.length; i++)
		{
			A[i] = sc.nextInt();
		}
		selectionSort(A);
		System.out.println("List of Employees Salaries is:");
		for(int i=0; i<A.length; i++)
		{
			System.out.print(A[i] + "\t");
		}
		System.out.println();
		top5Salaries(A);
		sc.close();
	}
}