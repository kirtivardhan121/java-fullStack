class Ocurrence1
{
public static void main(String args[])
{
int ar[]={34,56,67,56,56,79,34,67,79};
int big=ar[0];
for(int i=0;i<ar.length;i++)
{
if(big<ar[i])
big=ar[i];
}
int count[]=new int[big+1];
for(int i=0;i<ar.length;i++)
{
count[ar[i]]++;
}
for(int i=0;i<count.length;i++)
{
if(count[i]!=0)
System.out.println(i+"-->"+count[i]);
}
}
}