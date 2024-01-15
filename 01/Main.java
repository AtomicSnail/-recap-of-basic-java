import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		float num1, num2, res = 0xbad;
		String op;
		boolean success = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Give number 1: ");
		num1 = sc.nextFloat();
		System.out.print("Give operator (+, -, *, /): ");
		sc.nextLine();
		op = sc.nextLine();
		System.out.print("Give number 2: ");
		num2 = sc.nextFloat();
		switch (op) {
			case "+":
				res = num1 + num2;
				break;
			case "-":
				res = num1 - num2;
				break;
			case "*":
				res = num1 * num2;
				break;
			case "/":
				if (num2 == 0) {
					System.out.println("Division by zero is not allowed.");
					success = false;
				} else {
					res = num1 / num2;
				}
				break;
		}
		if (success) {
			System.out.println("Result: " + res);
		}
	}
}
