import java.util.Scanner;
class Odd2
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Integer nuber:");
int n=sc.nextInt();

switch(n%2)
{
case 0 : System.out.println("Number is Even" + n);
break;

case 1 : System.out.println("Number is Odd" + n);
break;
}
}
}