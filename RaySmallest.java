//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
        int smallest = ray[0];
        int i = 0;

        while (i<ray.length)
        {
            if (ray[i]<smallest)
            {
                smallest = ray[i];
            }
            i++;
        }

		return smallest;
	}
}
