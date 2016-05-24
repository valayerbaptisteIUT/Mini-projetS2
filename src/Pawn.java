import java.util.List;
import java.util.Set;
/**
 * class refer to a particular piece : a Pawn
 * @author valayerb
 */
public class Pawn extends Piece
{

	/**
	 * constructor which created Pawn associated with a color choose in param (black o withe)
	 * @param color (color of Pawn what want to create)
	 */
	public Pawn(Color color)
	{
		super(color);
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return "P"+super.toString();
	}

	@Override
	public Set<ChessGamePosition> possiblemovement(ChessGamePosition startpos)
	{
		// TODO Auto-generated method stub
		return null;
	}


}
