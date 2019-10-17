package gameOfLife.avinoam.git;

@SuppressWarnings("unused")
public class GameOfLife {

	static final int rows = 8, cols = 8;
	static final boolean[][] grid = { 
			{ false, false, false, false, false, false, false, false },
			{ false, false, false, false, true, false, false, false },
			{ false, false, false, false, false, true, false, false },
			{ false, false, false, false, false, false, false, false },
			{ false, false, false, false, false, false, false, false },
			{ false, false, false, false, false, false, false, false },
			{ false, false, false, false, false, false, false, false },
			{ false, false, false, false, false, false, false, false } };
	
	static int x;
	static int y;

	static String liveCell = "[#]", deadCell = "[ ]";

	static void cellChecker() {
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				if (grid[x][y] == false) {
					System.out.print(deadCell);
				} else {
					System.out.print(liveCell);
				}

			}
			System.out.println();
		}
	}

	static int neighbors(boolean b) {
		int count = 0;
		boolean neighbors = grid[x-1][y] && grid[x+1][y] && grid [x][y-1] && grid [x][y+1] && grid[x-1][y-1] && grid[x+1][y+1] && grid[x-1][y+1] && grid[x+1][y-1];
		while (neighbors == true) {
			count++;
		} return count;
		
	}

	static void rules() {
//		first rule: Any live cell with fewer than two live neighbours dies, as if by underpopulation.
		if (neighbors(false) < 2 ) {
			grid [x][y] = false;
		}
//		second rule: Any live cell with two or three live neighbours lives on to the next generation.

//		third rule: Any live cell with more than three live neighbours dies, as if by overpopulation.

//		forth rule: Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

	}

	public static void main(String[] args) {
		cellChecker();
		rules();

	}

}
