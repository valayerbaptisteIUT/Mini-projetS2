//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;


/**
 * @author valayerb
 * define player
 */
public class Player
{
	
	// TODO write comment (done)
	
	/**
	 *ask to the player a move (in comment)
	 *return a move with random position
	 * @return the move asked by player
	 */
	public Move askForMove()
	{
		/*// Note : rentre un movement du type "A1,B2" puis extraire avant virgule apres virgule puis transformer A1 en ChessGamePosition et B2 en ChessGamePosition puis retourne le mouvement composer de (A1 B2)
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in,"US-ASCII"));
		}
		catch (UnsupportedEncodingException e)
		{
			// ...
		}
		String posdep=reader.substring(1, 2);
		String posarr=reader.substring(4, 5);
		
		// TODO to be completed
		return null;*/

		
		return new Move(new ChessGamePosition(),new ChessGamePosition());
	}

}
