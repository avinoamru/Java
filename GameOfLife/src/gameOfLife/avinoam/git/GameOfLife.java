package gameOfLife.avinoam.git;

@SuppressWarnings("unused")
public class GameOfLife {

	 static final int rows = 8, cols = 8;
	static final boolean[][] grid =
		{
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false},
				{false,false,false,false,false,false,false,false}
		};
	
	static void cellChecker()	{
		for (int x = 0; x < rows; x++) {
			for (int y = 0; y < cols; y++) {
				System.out.print(grid[x][y]);
				System.out.println();
			}
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		cellChecker();

	}

}
