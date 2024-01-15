import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String string;
		char target;	
		Scanner sc = new Scanner(System.in);
		System.out.print("Give string: ");
		string = sc.nextLine();
		System.out.print("Give character: ");
		target = sc.nextLine().charAt(0);
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == target) {
				System.out.println("the first '" + target + "' character was found in index " + i);
				return;
			}
		}
		System.out.println("no '" + target + "' characters found from the given string");
	}
}
