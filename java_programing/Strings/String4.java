import java.util.Scanner;
class String4
{
static String toCapital(String str)
{
String rs="";
for(int i=0;i<str.length();i++)
{
char ch=str.charAt(i);
if(ch>='a' && ch<='z')
ch=(char)(ch-32);
rs=rs+ch;
}
return rs;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Input String:");
String st=sc.nextLine();
st=toCapital(st);
System.out.println(st);
}
}