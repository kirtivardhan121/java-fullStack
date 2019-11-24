class ReverseString
{
public static void main(String args[])
{
String name="vardhan";
int len=name.length();
String rev="";
for(int i=len-1;i>=0;i--)
{
rev=rev+name.charAt(i);
}
System.out.println("Rverse of " +name+ " is "+rev);
}
}