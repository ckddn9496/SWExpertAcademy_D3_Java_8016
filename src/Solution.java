import java.math.BigInteger;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(sc.nextLine());
			BigInteger left = new BigInteger(String.valueOf(N-1));
			left = left.multiply(left).multiply(BigInteger.valueOf(2)).add(BigInteger.ONE);
			
			BigInteger right = new BigInteger(String.valueOf(N));
			right = right.multiply(right).multiply(BigInteger.valueOf(2)).subtract(BigInteger.ONE);
 
			System.out.println("#"+test_case+" "+left+" "+right);
		}
	}
}