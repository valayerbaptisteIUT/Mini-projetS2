
/**
 * @author valayerb
 * define move
 */
public class Move
{

	
	/**
	 * a position before move
	 */
	private Position PosDepart;
	/**
	 * a position completed
	 */
	private Position PosArrive;

	/**
	 * method which modify the position of pawn (like player ask)
	 * @param PosXArr new abscissa position choose by player
	 * @param PosYArr new ordinate position choose by player
	 */
	public Move(Position PosDep, Position PosArr)
	{
		this.PosDepart=PosDep;
		this.PosArrive=PosArr;
	}
}
