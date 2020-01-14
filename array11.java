import java.util.*;
public class array1
{
	int i,j,temp;
	void method1(int arr[])
	{
		for(i=1;i<arr.length-1;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void method2(int arr2[])
	{
		for(i=1;i<arr2.length-1;i++)
		{
			for(j=0;j<arr2.length-1;j++)
			{
				if(arr2[j]>arr2[j+1])
				{
					temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
	}
	void method3(int arr3[])
	{
		for(i=1;i<arr3.length-1;i++)
		{
			int flag=0;
			for(j=0;j<arr3.length-1;j++)
			{
				if(arr3[j]>arr3[j+1])
				{
					temp=arr3[j];
					arr3[j]=arr3[j+1];
					arr3[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
	}
public static void main(String args[])
	{
	int i,j,size;
	System.out.println("Enter the size of first array");
	Scanner sc=new Scanner(System.in);
	size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the size of second  array");
	int size1=sc.nextInt();
	int arr2[]=new int[size1];
	System.out.println("Enter the size of third array");
	int size2=sc.nextInt();
	int arr3[]=new int[size2];
	System.out.println("Elements of first array are:");
	for(i=0;i<arr.length;i++)
		{
		arr[i]=sc.nextInt();
		}
		System.out.println("Elements of second array are:");
	for(i=0;i<arr2.length;i++)
		{
		arr2[i]=sc.nextInt();
		}
		System.out.println("Elements of third array are:");
	for(i=0;i<arr3.length;i++)
		{
		arr3[i]=sc.nextInt();
		}
		array1 ar=new array1();
		ar.method1(arr);
		ar.method2(arr2);
		ar.method3(arr3);
		System.out.print("The output of simple is: ");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("The output of optimized is: ");
		for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
			System.out.println();
		System.out.print("The output of reduced execution time is is: ");
			for(i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
}
}
