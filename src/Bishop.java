import java.util.List;
import java.util.Set;


/**
 * class refer to a particular piece : a bishop
 * @author valayerb
 *
 */
public class Bishop extends Piece
{

	/**
	 * constructor which created bishop associated with a color choose in param (black o withe)
	 * @param color (color of bishop what want to create)
	 */
	public Bishop(Color color)
	{
		super(color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "b"+super.toString();
	}


	@Override
	public Set<ChessGamePosition> possiblemovement(ChessGamePosition startpos)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
