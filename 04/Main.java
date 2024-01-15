public class Main {
	public static void main(String[] args) {
		boolean valid = (args.length >= 3) && (args[0].equals("repeat1") || args[0].equals("repeat2")) && (args[1].length()) == 1 && strIsNumeric(args[2]);
		if (!valid) {
			System.out.println("Usage: java Main [repeat1/repeat2] [character] [amount]");
		} else {
			char character = args[1].charAt(0);
			int times = Integer.parseInt(args[2]);
			switch (args[0]) {
				case "repeat1":
					System.out.println(repeat1(character, times));
					break;
				case "repeat2":
					repeat2(character, times);
					break;
			}
		}
	}
	
	public static String repeat1(char character, int amount) {
		String res = "";
		for (int i = 0; i < amount; i++) {
			res += character;
		}
		return res;
	}
	
	public static void repeat2(char character, int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print(character);
		}
		System.out.print("\n");
	}
	
	static boolean strIsNumeric(String s) {
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}
}
