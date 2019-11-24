import java.util.Scanner;
class Power
{
static int pow(int n, int p)//2,3
{
int pw=1;
while(p>0)
{
pw=pw*n;
p--;
}
return pw;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
int n=sc.nextInt();
System.out.println("Enter the value of p");
int p=sc.nextInt();
int c=pow(n , p);
System.out.println("Power of eneterd number is" +c);
}
}

