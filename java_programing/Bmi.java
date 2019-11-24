import java.util.Scanner;
class Bmi
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter Weight of Person in KG");
double w=sc.nextDouble();

System.out.println("Enter Height of Person in feet and inches");
double h=sc.nextDouble();

int feet=(int)h;
int inch=(int)((h-feet)*100);
double m=(feet*12+inch)*0.0254;

double bmi=w/(m*m);

System.out.println("BMI of a Person:"+bmi);
}
} 

