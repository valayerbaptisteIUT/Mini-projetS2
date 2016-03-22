
/**
 * This class represents a chess board like this : http://www.echecs.club/wp-content/uploads/2015/11/regles-disposition.png 
 * @author valayerb 
 */
public class Board
{
	// TODO fix comment
	/**
	 * initialize of grid variable
	 */
	private Piece[][] grid;

	/**
	 * Create a new board, that contains pawns at their initial locations
	 */
/*	public Board()
	{
		grid = new Piece[8][8];
		int i=0;
		
		while(i<8)
			{
				this.grid[i][1]= new Piece();
				this.grid[i][6]= new Piece();
				i++;
			}
		
		this.grid[0][0]=Piece();
		this.grid[1][0]=Piece();
		this.grid[2][0]=Piece();
		this.grid[3][0]=Piece();
		this.grid[4][0]=Piece();
		this.grid[5][0]=Piece();
		this.grid[6][0]=Piece();
		this.grid[7][0]=Piece();
		
		this.grid[0][7]=Piece();
		this.grid[1][7]=Piece();
		this.grid[2][7]=Piece();
		this.grid[3][7]=Piece();
		this.grid[4][7]=Piece();
		this.grid[5][7]=Piece();
		this.grid[6][7]=Piece();
		this.grid[7][7]=Piece();
		
	}*/
	
	/** returns an ASCII-art representation of the board
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return ".";
	}
}
