import java.util.Random;
/**
 * Define position
 * @author valayerb
 */
public class ChessGamePosition
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
	 * Constant which represent the maximum of chessboard's size
	 */
	public final static int DEFAULT_SIZE_MAX = 8;
	
	/**
	 * Constant which represent the minimum of chessboard's size
	 */
	public final static int DEFAULT_SIZE_MIN = 0;
	
	/**
	 * constructor which initialize a random position
	 */
	public ChessGamePosition()
	{
		Random randomGenerator = new Random();
		this.posX=randomGenerator.nextInt(DEFAULT_SIZE_MAX);
		this.posY=randomGenerator.nextInt(DEFAULT_SIZE_MAX);
	}
	
	/**
	 * constructor which initialize a position
	 * @param x0 abscissa's position
	 * @param y0 ordinate's position
	 * @throws OutOfChessboardException if the value of the column or line isn't in the chessboard
	 */
	public ChessGamePosition(int x0,int y0) throws OutOfChessboardException
	{
			if(x0 < DEFAULT_SIZE_MIN || x0 > DEFAULT_SIZE_MAX || y0 < DEFAULT_SIZE_MIN || y0 > DEFAULT_SIZE_MAX)
			{
				this.posX=x0;
				this.posY=y0;
			}
			else
				throw new OutOfChessboardException();
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
	
	/**
	 * a methode call on a position to found it neighbour position in a direction choose
	 * @param direction (up,down,left,right and all the diagonal)
	 * @return position
	 */
	public ChessGamePosition neighbourposition(Direction direction)
	{
		ChessGamePosition tet = null;
		try
		{
			tet = new ChessGamePosition(this.getPosX()+direction.getPosx(),this.getPosY()+direction.getPosy());
		}
		catch (OutOfChessboardException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tet;
	}
	/**
	 * a methode call on a position to found it neighbour position in a direction choose and at a rangechoose too
	 * @param direction (up,down,left,right and all the diagonal)
	 * @param range 
	 * @return position
	 */
	public ChessGamePosition neighbourposition(Direction direction, int range)
	{
		ChessGamePosition tet = null;
		try
		{
			tet = new ChessGamePosition(this.getPosX()+(direction.getPosx()*range),this.getPosY()+(direction.getPosy()*range));
		}
		catch (OutOfChessboardException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tet;	
	}

}
