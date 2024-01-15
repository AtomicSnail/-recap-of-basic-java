public class Main {
	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		int w = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		int arr[][] = new int[h][w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				arr[i][j] = w * i + j + 1;
			}
		}
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				printWithLZeros(arr[i][j], ndigits(w * h));
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}

	static int ndigits (int num) {
		int _num = num;
		int res = 0;
		while (_num > 0) {
			_num = _num / 10;
			res += 1;
		}
		return res;
	}

	static void printWithLZeros(int num, int totalChars) {
		for (int i = 0; i < (totalChars - ndigits(num)); i++) {
			System.out.print("0");
		}
		System.out.print(num);
	}
}
