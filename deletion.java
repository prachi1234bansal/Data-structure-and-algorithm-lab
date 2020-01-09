import java.util.*;
public class deletion
{
	public static void main(String args[])
	{
	int i;
	int array[]=new int[10];
		for(i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
		}
		System.out.println("Enter the position: ");
		Scanner sx=new Scanner(System.in);
		int position=sx.nextInt();
		for(i=position;i<(array.length)-1;i++)
		{
			array[i]=array[i+1];
		}
		System.out.println("Deletion has been successfull: " );
		for(i=0;i<(array.length)-1;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}
