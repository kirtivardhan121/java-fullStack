import java.util.Scanner;
class PerfectNo
{
static int isPerfect(int n)
{
int temp=0;
for(int i=1; i<=n/2; i++)
{
   if(n%i==0)
    {
	temp=temp+i;
    }
}
return temp;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check:");
int n=sc.nextInt();
int b=isPerfect(n);
if(b==n)
System.out.println("True");
else
System.out.println("False");
}
}
