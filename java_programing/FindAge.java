import java.util.Scanner;
class FindAge
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your Age:");

byte age=sc.nextByte();

System.out.println("Your Age was:"+(age-5)+"Five year back");

System.out.println("Your Age was:"+(age+5)+"Five year later");
}
}
