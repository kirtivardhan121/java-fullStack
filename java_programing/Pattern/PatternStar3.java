import java.util.Scanner;
class PatternStar3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of lines to print");
int n=sc.nextInt();
for(int i=n;i>0;i--)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print("*");
}
System.out.println();
}
}
}