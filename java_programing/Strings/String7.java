//wajp to check second string is preset in first string or not and count how many times it is present

import java.util.Scanner;
class String7
{
public static void main(String args[])
{
String s1="Chitradurga is a fort city";
String s2="durga";
int count=countSubStr(s1,s2);
System.out.println(count +"Times it is there");
}
static int countSubStr(String s1,String s2)
{
char c1[]=s1.toCharArray();
char c2[]=s2.toCharArray();
int count=0;
for(int i=0;i<c1.length;i++)
{
int j=0,k=i;
while(j<c2.length&&k<c1.length&&c1[k]==c2[j])
{
j++;
k++;
}
if(j==c2.length)
count++;
i=k-1;
}
return count;
}
}