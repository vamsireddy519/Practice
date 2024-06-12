class Level {
	private int target;
	private int numRows;
	private int numCols;
	private char[][] map;
	
	public Level(int numRows, int numCols, int target, char[][] map) {
		this.numRows = numRows;
		this.numCols = numCols;
		this.target = target;
		this.map = new char[numRows][numCols];
		
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) 
				this.map[i][j] = map[i][j];
		}
	}

	public void swapCandy(int row1, int col1, int row2, int col2) {
		char temp = map[row1][col1];
		map[row1][col1] = map[row2][col2];
		map[row2][col2] = temp;
	}
	
	public void scanMap() {
		Boolean exit = true;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numCols; j++) {
				if (map[i][j] != '0' && map[i][j] != '-' && (horiCheck(i, j) || VertiCheck(i, j))) {
					markCandy(i, j);
					exit = false;
				}
			}
		}
		removeCrushedCandy();
		
		if (exit) return;
		else scanMap();
	}
