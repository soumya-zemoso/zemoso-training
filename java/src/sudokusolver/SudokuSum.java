package sudokusolver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SudokuSum {
	public static void main(String a[]) throws NumberFormatException, IOException {
		long startTime = System.nanoTime();

		int game[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		int lineNum = 0;
		int r = 0;
		int sum = 0;
		BufferedReader in = new BufferedReader(new FileReader("src/sudoku.txt"));
		String line = null;
		while ((line = in.readLine()) != null) {
			if (lineNum != 0) {
				if (lineNum % 10 == 0 && lineNum != 0) {
					r = 0;
					if (getval(game) == true) {
						sum += game[0][0] * 100 + game[0][1] * 10 + game[0][2];
					}

				} else {
					String[] tokens = line.split("");
					for (int j = 0; j < tokens.length; j++) {
						game[r][j] = Integer.parseInt(tokens[j]);
					}
					r++;
				}
			}
			lineNum++;
		}
		if (getval(game) == true) {
			sum += game[0][0] * 100 + game[0][1] * 10 + game[0][2];
		}
		System.out.println("Answer=" + sum);
		in.close();
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");

	}

	private static boolean getval(int[][] game) {
		int row = 0, col = 0, flag = 0;

		for (row = 0; row < 9; row++) {
			for (col = 0; col < 9; col++) {
				if (game[row][col] == 0) {
					flag = 1;
					break;
				}

			}
			if (flag == 1)
				break;

		}
		if (flag == 0)
			return true;
		for (int num = 1; num <= 9; num++) {
			if (check(game, row, col, num)) {
				game[row][col] = num;

				if (getval(game))
					return true;
				game[row][col] = 0;
			}
		}
		return false;
	}

	private static boolean check(int[][] game, int row, int col, int num) {
		if (!rowChecking(game, row, num) && !colChecking(game, col, num) && !boxChecking(game, row, col, num))
			return true;
		return false;

	}

	private static boolean boxChecking(int[][] game, int row, int col, int num) {
		int r, c;
		r = row - row % 3;
		c = col - col % 3;
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				if (game[i + r][j + c] == num)
					return true;
		return false;
	}

	private static boolean colChecking(int[][] game, int col, int num) {
		for (int row = 0; row < 9; row++)
			if (game[row][col] == num)
				return true;
		return false;
	}

	private static boolean rowChecking(int[][] game, int row, int num) {
		for (int col = 0; col < 9; col++)
			if (game[row][col] == num)
				return true;
		return false;
	}

}
