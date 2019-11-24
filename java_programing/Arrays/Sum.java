class Sum
{
public static void main(String args[])
{
ArrayOperation ao=new ArrayOperation();
System.out.println("Read Array");
int x[]=ao.readArr();
int c[]=ao.countEO(x);
System.out.println("Number of Even Numbers : " +c[0]);
System.out.println("Number of odd Numbers : " +c[1]);
int z[]=ao.readArr();
int s[]=ao.sumOfEO(z);
System.out.println("Sum of Even Numbers : " +c[0]);
System.out.println("Sum of odd Numbers : " +c[1]);
int a[]=ao.readArr();
int m[]=ao.mergeSort(a);
System.out.println("Array After Merging:" + a[]);

}
}