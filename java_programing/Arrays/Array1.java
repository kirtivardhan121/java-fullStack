class Array1
{
public static void main(String args[])
{
int ar[];
ar=new int[5];
ar[0]=34;
ar[1]=65;
ar[3]=98;
ar[4]=75;
for(int i=0;i<=ar.length;i++)
{
System.out.println(i + "->" + ar[i]);
}
}
}