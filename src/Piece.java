import java.util.List;


/**
 * a abstract class whiçh represent a piece
 * @author valayerb
 * 
 */
public abstract class Piece
{
	/**
	 * a variable color which represent the piece color
	 */
	private final Color color;
	
	
	/**
	 * @return color of piece
	 */
	public Color getColor()
	{
		return this.color;
	}

	/**
	 * constructor of piece with a color choosen
	 * @param color (color of piece what want to create)
	 */
	public Piece(Color color)
	{
		this.color=color;
	}
	
	public String toString()
	{
		return this.color.toString();
	}
	
	/**
	 * @param startpos 
	 * @return a list of position where piece can go
	 */
	public abstract List<ChessGamePosition> possiblemovement(ChessGamePosition startpos);
	// 3 methodes : - Bouger une piece
	//				- manger une piece
	//				- piece peut elle sauter par dessus d'autre piece
}
