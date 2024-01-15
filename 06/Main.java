public class Main {

    public static void main(String[] args) {
        int arglen = args.length;
        boolean argsOK = arglen >= 2;
        if (argsOK) {
            switch (args[0]) {
                case "removeVowels":
                    System.out.println(removeVowels(args[1]));
                    break;
                case "countStringOccurrences":
                    String what = args[1];
                    String[] where = new String[arglen - 2];
                    for (int i = 2; i < arglen; i++) {
                        where[i - 2] = args[i];
                    }
                    System.out.println(countStringOccurrences(where, what));
                    break;
                case "sumRows":
                    int w = Integer.parseInt(args[1]), h = Integer.parseInt(args[2]);
                    int[][] matrix = new int[h][w];
                    int y = 0, x = 0;
                    for (int i = 3; i < arglen; i++) {
                        if (x >= w) {
                            y += 1;
                            x = 0;
                        }
                        matrix[y][x] = Integer.parseInt(args[i]);
                        x += 1;
                    }
                    // output(matrix);
                    printIntArr(sumRows(matrix));
                    break;
            }
        }
    }


    /**
     * Removes all vowels (both uppercase and lowercase) from a given string.
     *
     * @param inputString The input string from which to remove vowels.
     * @return The input string with all vowels removed. Do not use String.replaceAll
     */
    public static String removeVowels(String inputString) {
        String res = "";
        char c, clow;
        for (int i = 0; i < inputString.length(); i++) {
            c = inputString.charAt(i);
            clow = Character.toLowerCase(c);
            if (clow != 'a' && clow != 'e' && clow != 'i' && clow != 'o' && clow != 'u') {
                res += c;
            }
        }
        return res;
    }

    /**
     * Counts the number of times a specified string appears in an array of strings.
     *
     * @param stringArray The array of strings to search within.
     * @param targetString The string to count occurrences of.
     * @return The number of times the target string appears in the array.
     */
    public static int countStringOccurrences(String[] stringArray, String targetString) {
        int res = 0;
        for (String s: stringArray) {
            if (s.equals(targetString)) {
                res += 1;
            }
        }
        return res;
    }

    /**
     * Calculates the sum of the elements in each row of a two-dimensional array of integers.
     *
     * @param matrix The two-dimensional array of integers.
     * @return An array of integers, where each element is the sum of the elements in a corresponding row of the input matrix.
     */
    public static int[] sumRows(int[][] matrix) {
        int[] res = new int[matrix.length];
        int rowsum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int n: matrix[i]) {
                rowsum += n;
            }
            res[i] = rowsum;
            rowsum = 0;
        }
        return res;
    }

    public static void printIntArr(int[] arr) {
        System.out.print('[');
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i]);
            if (i < len - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(']');
    }
    public static void output(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
