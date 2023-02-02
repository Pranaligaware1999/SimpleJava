package example;
public class Pattern {
	
		static void PatternRecur(int n, int i)
				{
					if (n < 1)           // base condition
						return;
					if (i <= n)
					{
						System.out.print ( "* ");
						PatternRecur(n, i + 1);
					}
					else{
						System.out.println( );
					PatternRecur(n - 1, 1);
					}
				}
				public static void main (String[] args)
				{
					int n = 5;
					PatternRecur(n, 1);
					}
	}


