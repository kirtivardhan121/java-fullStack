import java.util.Scanner; 
class Factorial
{
static int fact(int n)
{
int fact=1;
while(n>1)
{
fact=fact*n;
n--;
}
return fact;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=6, y=9;
int f1=fact(x);
System.out.println("Factorial of " +x+ " is " +f1);
System.out.println("Factorial of " +y+ " is " +fact(y));
System.out.println("Enter the integer:");
int z=sc.nextInt();
System.out.println("Factorial of " +z+ " is " +fact(z));
}
  
}