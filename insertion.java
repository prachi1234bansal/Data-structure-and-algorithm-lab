class insertion
{
	public static void main(String args[])
	{
		int array[]=new int[10];
		int i;
		int arr;
		for(i=0;i<array.length;i++)
		{
			array[i]=Integer.parseInt(args[i]);
		}
		for(int k:array)
		{
			System.out.print("Inserted elements are: "+k);
		}
	}
}