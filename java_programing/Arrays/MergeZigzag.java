class MergeZigzag
{
static int[] zigzag(int a[],int b[])
{
int c[]=new int[a.length+b.length];
int i=0,j=0;
while(i<a.length && i<b.length)
{
c[j++]=a[i];
c[j++]=b[i++];
}
while(i<b.length)
{
c[j++]=b[i++];
}
while(i<a.length)
{
c[j++]=a[i++];
}
return c;
}
public static void main(String args[])
{

int a[]={23,45,56,28,18,32};
int b[]={33,76,72};
int c[]=zigzag(a,b);
for(int i=0;i<c.length;i++)
System.out.print(c[i]+",");
}
}