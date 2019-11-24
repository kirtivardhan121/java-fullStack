class Array10
{
static int[] swap(int a[])
{
int temp=0;
for(int i=0;i<a.length/2;i++)
{
temp=a[i];
a[i]=a[(a.length/2)+i];
a[(a.length/2)+i]=temp;
}
return a;
}
public static void main(String args[])
{
int a[]={23,45,56,78,89,32};
int b[]=swap(a);
for(int i=0;i<b.length;i++)
System.out.print(b[i]+",");
}
}