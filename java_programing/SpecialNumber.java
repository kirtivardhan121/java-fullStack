import java.util.Scanner;
class SpecialNumber
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer nuber:");
int x=sc.nextInt();
int d1=x/10;
int d2=x%10;
int sum=((d1+d2)+(d1*d2));
if(x==sum)
{
System.out.println("Entered number is Special:" +x);
}
else
{
System.out.println("Enterd nuber is not special:" +x);
}
}
}
