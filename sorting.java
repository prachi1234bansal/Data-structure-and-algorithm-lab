public class sorting
{
	public static void main(String args[])
	{
		int array[]=new int[]{1,7,9,3};
		//elements are in ascending order;
		int i,j,temp;
		for(i=1;i<(array.length);i++)
		{
			for(j=0;j<(array.length)-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(i=0;i<(array.length);i++)
		{
				System.out.print(array[i]+" ");
		}
	}
}
