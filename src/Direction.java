
/**
 * a enumeration which refer to a different color that all the piece can go
 * @author valayerb
 */
public enum Direction
{
	/**
	 * up movement
	 */
	UP(-1,0),
	
	/**
	 * down movement
	 */
	DOWN(1,0),
	
	/**
	 * right movement
	 */
	RIGHT(0,1),
	
	/**
	 * left movement
	 */
	LEFT(0,-1),
	
	/**
	 * left and up movement (diagonal)
	 */
	LEFTUP(-1,-1),
	/**
	 * left and down movement (diagonal)
	 */
	LEFTDOWN(1,-1),
	/**
	 * right and up movement (diagonal)
	 */
	RIGHTUP(-1,1),
	/**
	 * right and down movement (diagonal)
	 */
	RIGHTDOWN(1,1);

	
	/**
	 * abscissa position
	 */
	private final int posx;
	/**
	 * ordinate position
	 */
	private final int posy;
	
	/**
	 * @param posx
	 * @param posy
	 */
	private Direction(int posx,int posy)
	{
		this.posx=posx;
		this.posy=posy;
	}
	

	/**
	 * getter of posx
	 * @return int position abscissa
	 */
	public int getPosx()
	{
		return this.posx;
	}


	/**
	 * getter of posy
	 * @return int position ordinate
	 */
	public int getPosy()
	{
		return this.posy;
	}

	
}