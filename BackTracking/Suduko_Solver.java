package BackTracking;

public class Suduko_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		SudokuSolver(grid, 0, 0);

	}
	public static void SudokuSolver(int[][] grid, int row, int col) {
		//agar column saare bhar gye toh next row.
		if (col == 9) {
			row++;
			col = 0;
		}
		//agar saare row traverse ho gai toh answer mil gaya , toh grid print kara do.
		//row 0 se start kiya h, mtlb row 8 aur column 8 tak saare place fill ho jayenge. isliye 9 pe print kiya.[0 base]
		if (row == 9) {
			Display(grid);
			return;
		}
		// agaar value zero nhi h ,mtlb hum kuch nhi kar skte simply column bada do.
		// agaar value zero h , toh 1 se 9 tak elements try karo , agar place ho jaye usko rakh do aur column bada do
		// agar by chance answer nhi is path se toh humoo koi aur number try krna padega uske liye jaha element rakha tha usko wapis 0 krna padega[backtrack].
		if (grid[row][col] != 0) {
			SudokuSolver(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isitsafe(grid, row, col, val) == true) {
					grid[row][col] = val;
					SudokuSolver(grid, row, col + 1);
					grid[row][col] = 0;
				}

			}
		}

	}
	//display function
	public static void Display(int[][] grid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isitsafe(int[][] grid, int row, int col, int val) {
		// TODO Auto-generated method stub
		// agar column me h toh place nhi kar skte return false.
		for (int i = 0; i < grid.length; i++) {
			if (grid[i][col] == val) {
				return false;
			}

		}
		// agar row me h toh place nhi kar skte return false.
		for (int i = 0; i < grid.length; i++) {
			if (grid[row][i] == val) {
				return false;
			}

		}
		// 3*3 Matrix 
		// agar uske apne 3x3 matrix  me h toh place nhi kar skte return false.
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}

			}

		}
		//jab saare case pass mtlb place kar skte h toh return true.
		return true;
	}
}
