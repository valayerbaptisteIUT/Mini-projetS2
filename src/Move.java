
/**
 * @author valayerb
 * define move
 */
public class Move
{

	
	/**
	 * a position before move
	 */
	private final Position posDepart;
	/**
	 * a position completed
	 */
	private final Position posArrive;

	/**
	 * constructor which modify the position of pawn (like player ask)
	 * @param posDep position choose by player(abscissa,ordinate)
	 * @param posArr new position choose by player for the same pawn(abscissa,ordinate)
	 */
	public Move(Position posDep, Position posArr)
	{
		this.posDepart=posDep;
		this.posArrive=posArr;
	}

	/**
	 * @return posDepart
	 */
	public Position getPosDepart()
	{
		return this.posDepart;
	}

	/**
	 * @return posArrive
	 */
	public Position getPosArrive()
	{
		return this.posArrive;
	}
	
}
