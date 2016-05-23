
/**
 * a enumeration which refer to a different color that all the piece can use 
 * @author valayerb
 */
public enum Color
{
	/**
	 * black color (refer to black player)
	 */
	BLACK,
	/**
	 * WHITE color (refer to WHITE player)
	 */
	WHITE;
	
	public String toString()
	{
		if( this == BLACK)
			return "B";
			else return "W";
	}

}
