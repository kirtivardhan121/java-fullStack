class MergeArray
{
public static void main(String args[])
{
ArrayOperation ao=new ArrayOperation();
System.out.println("First Array:");
int a[]=ao.readArr();
System.out.println("Second Array:");
int b[]=ao.readArr();

System.out.println("Entered first array elements:");
ao.dispArr(a);
System.out.println("Entered second array Elements:");
ao.dispArr(b);

int c[]=ao.merge(a,b);
System.out.println("Array After Merge:");
ao.dispArr(c);
}
}