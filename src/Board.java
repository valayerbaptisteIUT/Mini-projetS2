
/**
 * This class represents a chess board like this : http://www.echecs.club/wp-content/uploads/2015/11/regles-disposition.png 
 * @author valayerb 
 */
public class Board
{
	// TODO fix array field declaration
	// visibility / type / name
	
	// TODO rename field
	/**
	 * initialize of the this.square variable
	 */
	private Pawn square[][];

	/**
	 * Create a new board, that contains the pawn at their initial locations
	 */
/*	public Board()
	{
		square = new Piece[8][8];
		int i=0;
		
		while(i<8)
			{
				this.square[i][1]= new Pawn();
				this.square[i][6]= new Pawn();
				i++;
			}
		
		this.square[0][0]=Pawn();
		this.square[1][0]=Pawn();
		this.square[2][0]=Pawn();
		this.square[3][0]=Pawn();
		this.square[4][0]=Pawn();
		this.square[5][0]=Pawn();
		this.square[6][0]=Pawn();
		this.square[7][0]=Pawn();
		
		this.square[0][7]=Pawn();
		this.square[1][7]=Pawn();
		this.square[2][7]=Pawn();
		this.square[3][7]=Pawn();
		this.square[4][7]=Pawn();
		this.square[5][7]=Pawn();
		this.square[6][7]=Pawn();
		this.square[7][7]=Pawn();
		
	}*/
	
	/** returns an ASCII-art representation of the board
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return ".";
	}
}
