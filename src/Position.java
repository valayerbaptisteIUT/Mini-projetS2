
/**
 * @author valayerb
 *define position
 */
public class Position
{
	/**
	 * Piece's abscissa
	 */
	private final int posX;
	/**
	 * Piece's ordinate
	 */
	private final int posY;
	
	
	/**
	 * constructor which initialize a position
	 * @param x0 abscissa's position
	 * @param y0 ordinate's position
	 */
	public Position(int x0,int y0)
	{
		this.posX=x0;
		this.posY=y0;
	}
	
	/**
	 * @return abscissa's position
	 */
	public int getPosX()
	{
		return this.posX;
	}
	/**
	 * @return ordinate's position
	 */
	public int getPosY()
	{
		return this.posY;
	}

}
