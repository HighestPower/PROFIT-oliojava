package jarmokarppa;

public class SqrIntegers
{
	public static void main()
	{
		for (int value = 0; value <= 1000; value++)
		{
			if ((Math.sqrt(value) % 2.0) == 0.0)
			{
			    System.out.println("Luku: " + value);
            }
		}
	}

}
