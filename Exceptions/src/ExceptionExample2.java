import java.io.*;
public class ExceptionExample2 {
	public static void main(String ar[]) {
		try(InputStreamReader i=new InputStreamReader(System.in);BufferedReader br=new BufferedReader(i);) {
			System.out.println("enter 1st value");
			int a=Integer.parseInt(br.readLine());
			System.out.println("enter 2nd value");
			int b=Integer.parseInt(br.readLine());
			System.out.println("the quotient is:"+(a/b));
		}
		catch(IOException e) {
			System.out.println("System.busy");
		}
		catch(ArithmeticException e) {
			System.out.println("no zero denominator");
		}
		catch(NumberFormatException e) {
			System.out.println("enter a number only");
		}
		finally {
			System.out.println("done");
		}
	}
}
