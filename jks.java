import java.util.*;
class jks
{
	public static void main(String args[])
	{
		String a="1+1+3+3";
			a=a.replace("+","");
		//System.out.println(a);
		char[]cg=a.toCharArray();
		Arrays.sort(cg);
			//System.out.println(cg);
		for(int i=0;i<cg.length;i++)
		{
			if(i==cg.length-1)
			{
			System.out.print(cg[i]);
			}
			else
			{
				System.out.print(cg[i]+"+");
			}
		}
	}
}