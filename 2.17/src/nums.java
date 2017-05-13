import java.util.Scanner;

public class nums {
	public static void main(String[] arg)
	{
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		int average;
		int sum;
		int product;
	
		
		System.out.print("enter num1: ");
		num1 = input.nextInt();
		
		System.out.print("enter num2: ");
		num2= input.nextInt();
		
		System.out.print("enter num3: ");
		num3= input.nextInt();
		
		average = (num1 + num2 + num3)% 3;
		sum = num1 + num2 + num3;
		product = num1 * num2 * num3;
		
		if (num1 <= num2 && num2 > num3)
			System.out.printf("%d is largest %n", num2);
		if (num1 > num2 && num1 >= num3)
			System.out.printf("%d is largest %n", num1);
		if (num3 >= num2 && num1 < num3)
			System.out.printf("%d is largest %n", num3);


		
		System.out.printf("sum is is %d%n", sum);
		System.out.printf(" average is %d%n", average);
		System.out.printf("product is %d%n", product);
	}
}
