//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
        boolean isThere = false;
        int i = 1;
        int firstNum = ray[0];

        while(isThere == false && i<ray.length)
        {
            if (ray[i]==firstNum)
            {
                isThere = true;
                return true;
            }
            i++;
        }

        return false;
	}
}
