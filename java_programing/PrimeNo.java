import java.util.Scanner;
class PrimeNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n");
int n=sc.nextInt();
int count=0;
for(int i=2;i<=n-1;i++)
{
if(n%i==0)
{
count=count+1;;
}
}
if(count==0)
{
System.out.println(n +" Number is Prime");
}
else
{
System.out.println(n +" Number is not prime");
}
}
}