package jarmokarppa;

public class SqrIntegers
{
	public static void main(String[] args)
	{
		for (int value = 0; value <= 1000; value++)
		{
			if ((Math.sqrt(value) % 1) == 0.0)
			{
			    System.out.println("Luku: " + value);
            }
		}
	}
}
