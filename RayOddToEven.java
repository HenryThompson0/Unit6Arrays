//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int i = 0;
		int x = 0;
		int nextEven=0;
		int firstOdd=0;
		
		while (i<ray.length)
		{
			if (x==0)
			{
				if ((ray[i])%2!=0)
				{
					firstOdd = i;
					x=1;
				}
			}

			if (x==1)
			{
				if ((ray[i])%2==0)
				{
					nextEven = i;
					x=2;
				}
			}

			i+=1;	
		}

		return nextEven-firstOdd;
	}
}
