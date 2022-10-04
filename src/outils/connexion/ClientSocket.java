/**
 * Urban Marginal
 * Jeu de combat 2D multijoueurs
 * Author : Florian MARTIN
 * Date : 05/10/20199
 */


package outils.connexion;

//-----------------------------------------
/**
* 		IMPORTS
*/
//-----------------------------------------
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JOptionPane;
import java.io.IOException;

public class ClientSocket {
	// -----------------------------------------
	/**
	 * 		VARIABLES
	 */
	// ----------------------------------------- 
	private boolean connexionOk;
	
	
	// -----------------------------------------
	/**
	 * 		METHODES
	 */
	// -----------------------------------------
	/**
	 * Constructor
	 * @param ip
	 * @param port
	 * @param leRecepteur
	 */
	public ClientSocket(String ip, int port, Object leRecepteur){
		connexionOk = false;
		try {
			Socket socket = new Socket(ip, port);
			System.out.println("Connexion au serveur réussie");
			connexionOk = true;
			new Connection(socket, leRecepteur);
		} catch (UnknownHostException e) {
			JOptionPane.showMessageDialog(null, "Serveur indisponible");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Problème d'entrée/sortie");
		}
	}

	/**
	 * @return the connexionOk
	 */
	public boolean isConnexionOk() {
		return connexionOk;
	}
	
	
	
}
