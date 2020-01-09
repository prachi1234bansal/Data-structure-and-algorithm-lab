import java.util.*;
public class searching
{
	public static void main(String args[])
	{
		int array[]=new int[10];
		int i;
		for(i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Enter the element which you want to search");
		Scanner scx=new Scanner(System.in);
		int searching_element=scx.nextInt();
		for( i=0;i<array.length;i++)
		{
			if (searching_element==array[i])
			{
				 searching_element=1;
				break;
			}
		}
		if(searching_element==1)
		{
			System.out.println("Element is present");
		}
		else
		{
			System.out.println("Element is not present");
		}
}
}
