import java.util.List;
import java.util.Set;


/**
 * class refer to a particular piece : a king
 * @author valayerb
 */
public class King extends Piece
{

	/**
	 * constructor which created king associated with a color choose in param (black o withe)
	 * @param color (color of bishop what want to create)
	 */
	public King(Color color)
	{
		super(color);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		// TODO Auto-generated method stub
		return "K"+super.toString();
	}
	
	@Override
	public Set<ChessGamePosition> possiblemovement(ChessGamePosition startpos)
	{
		return null;
	}


}
