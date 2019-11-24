import java.util.Scanner;
class PatternA7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=1;j<=n-1-i;j++)
{
System.out.print(" ");
}
for(int j=1;j<=2*i+1;j++)
{
System.out.print((i+j)/2 +" ");
}
System.out.println();
}
}
}