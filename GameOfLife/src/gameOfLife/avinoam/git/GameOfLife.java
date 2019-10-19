package gameOfLife.avinoam.git;


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

	static boolean cellChecker() {
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
		return false;
	}

	static int neighbors(boolean deadOrAlive) {
		int count = 0;
		boolean neighbors = grid[x-1][y] || grid[x+1][y] || grid [x][y-1] || grid [x][y+1] || grid[x-1][y-1] || grid[x+1][y+1] || grid[x-1][y+1] || grid[x+1][y-1];
//		if (neighbors != grid[-1][8] || grid[8][-1] || grid[-1][-1] || grid[8][8]) {
			while (neighbors != grid[-1][8] || grid[8][-1] || grid[-1][-1] || grid[8][8]){
					continue;
			}while (neighbors == true){
				count++;
		}


		 return count;
		}


	static void refreshScreen(){
		String frontGrid = " ";
		String backGrid = " ";
		for (int refresh = 1; refresh > 0; refresh++){
			System.out.println(cellChecker());
		}


	}

	static void rules() {
//		first rule: Any live cell with fewer than two live neighbours dies, as if by underpopulation.
		if (neighbors() < 2 ) {
			grid [x][y] = false;
		}
//		second rule: Any live cell with two or three live neighbours lives on to the next generation.
		if (neighbors() == 3){

		}
//		third rule: Any live cell with more than three live neighbours dies, as if by overpopulation.

//		forth rule: Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

	}



	public static void main(String[] args) {

		cellChecker();
        boolean terminateGame = false;
        while (terminateGame == false){
            refreshScreen();
        }

		rules();

	}

}
