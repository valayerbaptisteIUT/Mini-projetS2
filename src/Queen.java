import java.util.List;


/**
 * class refer to a particular piece : a Queen
 * @author valayerb
 *
 */
public class Queen extends Piece
{

	/**
	 constructor which created Queen associated with a color choose in param (black o withe)
	 * @param color (color of Queen what want to create)
	 */
	public Queen(Color color)
	{
		super(color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "Q"+super.toString();
	}


	@Override
	public List<ChessGamePosition> possiblemovement(ChessGamePosition startpos)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
