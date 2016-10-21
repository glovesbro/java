import java.util.Scanner;
import java.math.BigInteger;
public class factorial{
	public static BigInteger factorial(BigInteger n){
		BigInteger bi = new BigInteger("1");//1
		if(n.equals(new BigInteger("1"))){
			return bi;
		}
		else
			return n.multiply(factorial(n.subtract(bi)));//n*f(n-1)
	}
	public static void main(String args []){
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger result = factorial(a);
		
		String s = result.toString();
		int start = sc.nextInt();
		int end = sc.nextInt();
		s = s.substring(start,end);
		System.out.println(s);
	}
}