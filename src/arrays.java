
public class arrays {
	public static void main(String[] args) {
		int[] values;
		values = new int[3];

		System.out.println(values[0]);

		values[0] = 10;
		values[1] = 20;
		values[2] = 30;

		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}

		int[] numbers = { 5, 6, 7 };

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		/*
		 * for(int number: numbers) { System.out.println(number); }
		 */

		// string array
		String[] words = { "caca", "mama", "maca" };

		/*
		 * for(int i=0; i<words.length;i++) { System.out.println(words[i]); }
		 */

		for (String word : words) {
			System.out.println(word);
		}

		// multidimensional array
		int[][] grid = { { 3, 5, 2 }, { 1, 2, 4 }, { 8, 9 } };

		System.out.println(grid[1][1]);

		String[][] text = new String[2][3];
		System.out.println(text[0][1]);

		text[0][1] = "hello";

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}

	}
}
