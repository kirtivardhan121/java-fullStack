import java.util.Scanner;
class countPerfect
{
boolean isPerfect(int n)
{
int temp=0,t=n;
for(int i=1; i<=n/2; i++)
{
   if(n%i==0)
    {
	temp=temp+i;
    }
}
return temp==n;
}
int countDigits(int n)
{
int c=0;
do
{
c++;
n=n/10;
}while(n!=0);
return c;
}
void Count(int n){
int c=0;
for(int i=0;i<=n;i++)
do
{
c++;
n=n/10;
}while(n!=0);
boolean rs=isPerfect(i);
if(rs==true)
System.out.println(i);
}
public static void main(String args[])
{
countPerfect sc=new countPerfect();
boolean rs=sc.isPerfect(28);
System.out.println(rs);
sc.Count(100);
}
}

