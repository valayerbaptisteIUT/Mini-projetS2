import java.util.List;
import java.util.Set;


/**
 * class refer to a particular piece : a Rook
 * @author valayerb
 *
 */
public class Rook extends Piece
{

	/**
	 * constructor which created Rook associated with a color choose in param (black o withe)
	 * @param color (color of Rook what want to create)
	 */
	public Rook(Color color)
	{
		super(color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "R"+super.toString();
	}


	@Override
	public Set<ChessGamePosition> possiblemovement(ChessGamePosition startpos)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
