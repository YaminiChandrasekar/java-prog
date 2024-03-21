import java.util.Scanner;
public class Sumofdigits
{
	public static void main(String[] args)
	{
		int sum=0;
		System.out.print("enter the number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		while(number>0)
		{
			int digit = number%10;
			sum =sum+digit;
			number = number/10;
		}
	System.out.println("sum of digits:"+sum);
	}
}