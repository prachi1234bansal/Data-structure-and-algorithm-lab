class output
{
	static int[] evenArray(int []inputArray)
	{
		int size=0;
		int result[]=new int[inputArray.length];
	for(int n=0;n<inputArray.length;n++)
		{
			size=size+1;
		}
		for(int i=0;i<inputArray.length;i++)
		{
			if(inputArray[i]%2==0  && inputArray[i]!=0)
			{
			 result[i]=inputArray[i];
				}
		}
		return result;
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		int []arr={1,10,2,0,5,6,7,7,8,9,12,24,0,2};
		int o[]=evenArray(arr);
		for(int i=0;i<o.length;i++)
		{
			if(o[i]==0)
			{
		
		}
		else
			{
			System.out.print(o[i]+" ");
			}
	}
	}
}
