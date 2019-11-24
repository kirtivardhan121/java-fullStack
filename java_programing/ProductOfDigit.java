import java.util.Scanner;
class ProductOfDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number:");
int n=sc.nextInt();
int p=1;
while(n!=0)
{
int r=n%10;
p=p*r;
n=n/10;
}
 System.out.println("Product of digit of no:" +p);

}
}