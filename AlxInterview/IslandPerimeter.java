public class IslandPerimeter{
	public static void main(String[] args){
		int[][] grid = {
			{0, 0, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{0, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 0},
			{0, 0, 0, 0, 0, 0}
		};

		System.out.println(calculateIslandPerimeter(grid));
	}

	public static int calculateIslandPerimeter(int[][] grid){
		int perimeter = 0;

		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++){
				// Check if its land
				if(grid[row][col] == 1){
					// Top
					if(grid[row - 1][col] == 0)
						perimeter += 1;
					// Left
					if(grid[row][col - 1] == 0)
						perimeter += 1;
					// Right
					if(grid[row][col + 1] == 0)
						perimeter += 1;
					// Bottom
					if(grid[row + 1][col] == 0)
						perimeter += 1;
				}
			}
		}

		return perimeter;
	}
}
