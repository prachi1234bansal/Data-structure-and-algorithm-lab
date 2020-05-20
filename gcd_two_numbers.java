package Prachi_query_folder;
import java.util.*;
public class gcd_two_numbers
{
	private static int i,j;
	private static int count=1;
	public static void method1(int a,int b)
	{
		for(i=1;i<=a&&i<=b;++i)
		{
			if(a%i==0&&b%i==0)
			{
				count=i;
			}
		}
	System.out.print("GCD of two numbers is"+" "+count);
}
public static void main(String args[])
	{
	int n1,n2;
	System.out.println("Enter two numbers to find gcd :");
	Scanner m=new Scanner(System.in);
	n1=m.nextInt();
	n2=m.nextInt();
	method1(n1,n2);
	}

}