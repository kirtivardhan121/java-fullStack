import java.util.Scanner;
class String3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter input String");
String st=sc.nextLine();
String rs="";
for(int i=0;i<st.length();i++)
{
char ch=st.charAt(i);
if(ch>='A' && ch<='Z')
ch=(char)(ch+32);
rs=rs+ch;
}
System.out.println("Output String is:"+"-->"+rs);
}
}