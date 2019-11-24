import java.util.Scanner;
class Deserium
{
static int countDigits(int n)
{
int c=0;
do
{
c++;
n=n/10;
}
while(n!=0);
{
return c;
}
}
static int Pow(int n, int p)
{
int res=1;
while(p>0)
{
res=res*n;
p--;
}
return res;
}
 
static boolean isDeserium(int x)
{
int temp=x;
int p=countDigits(x);
int sum=0;
while(x!=0)
{
int digit=x%10;
sum=Pow(digit,p);
p--;
x=x/10;
}
return(sum==temp);
}

public static void main(String args[])
{
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the Number to Check:");
//int n=sc.nextInt();
//boolean b=isDeserium(n);
int x=135;
if(isDeserium(x))
 System.out.println("Yes");
else
 System.out.println("No");
}
}