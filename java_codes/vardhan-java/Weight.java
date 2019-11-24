class Weight
{
	public static void main(String args[])
	{
		int weight = 70;
		double height = 5.5;
		double bmi = 10 * (weight / Math.pow (height,2));
		System.out.println("BMI Of the Person is " + bmi);

		if(bmi < 18.5)
		{
			System.out.println("You're in the range of underweight");
		}
		else if(bmi > 18.5 && bmi <= 24.9)
		{
			System.out.println("You're in the range of healthy weight");
		}

		else if(bmi > 25 && bmi <= 29.9)
		{
			System.out.println("You're in the range of over weight");
		}
		else if(bmi > 30 && bmi <= 39.9)
		{
			System.out.println("You're in the range of obese weight");
		}
	}
}