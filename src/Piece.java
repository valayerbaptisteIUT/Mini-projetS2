// TODO consider for now that there are only pawns
/**
 * This class represents Piece
 * @author valayerb
 */
public abstract class Piece
{	
	/**
	 * Piece's abscissa
	 */
	public int PosX;
	/**
	 * Piece's ordinate
	 */
	public int PosY;
	
	/**
	 * method move which dependent of the type of piece.
	 * @return
	 */
	public abstract Piece move();
}
