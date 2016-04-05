import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;


/**
 * @author valayerb
 * define player
 */
public class Player
{
	
	// TODO write comment (done)
	
	/**
	 * ask to the player a move

	 * @return the move asked by player
	 */
	public Move askForMove()
	{
		// Note : rentre un movement du type "A1,B2" puis extraire avant virgule apres virgule puis transformer A1 en position et B2 en position puis retourne le mouvement composer de (A1 B2)
		try
		{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in,"US-ASCII"));
		}
		catch (UnsupportedEncodingException e)
		{
			// ...
		}
	
		
		// TODO to be completed
		return null;
		
	}

}
