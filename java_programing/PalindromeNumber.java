import java.util.Scanner;
class PalindromeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println(n + " Number is Palindrome ");
		}
		else
		{
			System.out.println(n + " Number is not Palindrome ");
		}
	}

}
