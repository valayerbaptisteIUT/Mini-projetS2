
/**
 * @author valayerb
 * define move
 */
public class Move
{

	
	/**
	 * a ChessGamePosition before move
	 */
	private final ChessGamePosition posDepart;
	/**
	 * a ChessGamePosition completed
	 */
	private final ChessGamePosition posArrive;

	/**
	 * constructor which modify the ChessGamePosition of pawn (like player ask)
	 * @param posDep ChessGamePosition choose by player(abscissa,ordinate)
	 * @param posArr new ChessGamePosition choose by player for the same pawn(abscissa,ordinate)
	 */
	public Move(ChessGamePosition posDep, ChessGamePosition posArr)
	{
		this.posDepart=posDep;
		this.posArrive=posArr;
	}

	/**
	 * @return posDepart
	 */
	public ChessGamePosition getPosDepart()
	{
		return this.posDepart;
	}

	/**
	 * @return posArrive
	 */
	public ChessGamePosition getPosArrive()
	{
		return this.posArrive;
	}
	
}
