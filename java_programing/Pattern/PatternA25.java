import java.util.Scanner;
class PatternA25
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of n:");
int n=sc.nextInt();
int space=n/2,st=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
int k=st/2+1;
for(int j=1;j<=st;j++)
{
System.out.print(k);
if(j<=st/2)
k--;
else
k++;
}
System.out.println();
if(i<=n/2)
{
space--;
st=st+2;
}
else
{
space++;
st=st-2;
}
}
}
}
 