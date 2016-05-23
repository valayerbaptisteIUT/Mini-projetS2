import java.util.List;

/**
 * class refer to a particular piece : a Knight
 * @author valayerb
 */
public class Knight extends Piece
{

	/**
	 * constructor which created Knight associated with a color choose in param (black o withe)
	 * @param color (color of Knight what want to create)
	 */
	public Knight(Color color)
	{
		super(color);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "k"+super.toString();
	}



	@Override
	public List<ChessGamePosition> possiblemovement(ChessGamePosition startpos)
	{
		// TODO Auto-generated method stub
		return null;
	}

}
