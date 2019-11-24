import java.util.Scanner;
class Pattern4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of lines to print");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=1;j<=n;j++)
{
if((i+j)%2==0)
{
System.out.print("0 ");
}
else
{
System.out.print("1 ");
}
}
System.out.println();
}
}
}