
public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Main <width> <height>");
            return;
        }
        output(generateRectangle(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    /**
     * Generates a 2D character array in the form of a rectangle with the specified width and height.
     * The rectangle contains 'x' characters on its border and '-' characters in its interior.
     *
     * @param width  The width of the rectangle.
     * @param height The height of the rectangle.
     * @return A 2D character array representing the rectangle.
     * @throws IllegalArgumentException If the width or height is less than or equal to zero.
     */
    public static char[][] generateRectangle(int width, int height) {
        char[][] res = new char[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (x == 0 || x == width-1 || y == 0 || y == height-1) {
                    res[y][x] = 'x';
                } else {
                    res[y][x] = '-';
                }
            }
        }
        return res;
    }

    /**
     * Outputs the contents of a given 2D character array to the console.
     *
     * @param table The 2D character array to be displayed.
     */
    public static void output(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j]);
            }
            System.out.print("\n");
        }
    }
}
