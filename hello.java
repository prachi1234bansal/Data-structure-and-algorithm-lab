import java.util.*;
class hello
{
    	static int i,j;
		static float k;
		static int array[]=new int[10];
		static
		{
		System.out.println("Static initialization");
		for( i=0;i<10;i++)
		{
		Scanner sx=new Scanner(System.in);
		int aj=sx.nextInt();
		array[i]=aj;
		}
		}
		void method1()
			{
		for ( i=0;i<10 ;i++ )
		{
			System.out.println("Inserted elements are:"+array[i]);
		}
		for(i=0;i<10;i++)
			{
			j=j+array[i];
			 k=j/10;
			}
			System.out.println("Sum of the elements is: "+j);
			System.out.println("Average of the elements is "+k);
		}
	public static void main(String args[])
	{
       hello h1=new hello();
	   h1.method1();
	}
}