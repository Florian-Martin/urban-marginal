/**
 * Urban Marginal
 * Jeu de combat 2D multijoueurs
 * Author : Florian MARTIN
 * Date : 05/10/20199
 */


package modele;


// -----------------------------------------
/**
 * 		IMPORTS
 */
// -----------------------------------------
import controleur.Controle;
import outils.connexion.Connection;

public abstract class Jeu {

	// -----------------------------------------
	/**
	 * 		VARIABLES
	 */
	// -----------------------------------------
	protected Controle controle;
	
	
	
	// -----------------------------------------
	/**
	 * 		METHODES
	 */
	// -----------------------------------------
	// M�thodes � red�finir dans les classes filles JeuClient et JeuServeur 
	/**
	 * R�ception d'une connection
	 * @param connection
	 */
	public abstract void setConnection(Connection connection);
	
	/**
	 * R�ception d'une information
	 * @param connection
	 * @param info
	 */
	public abstract void reception(Connection connection, Object info);
	
	/**
	 * Envoi d'une information
	 * @param connection
	 * @param info
	 */
	public void envoi(Connection connection, Object info) {
		connection.envoi(info);
	}
	
	/**
	 * D�connexion de l'ordinateur distant
	 * @param connection
	 */
	public abstract void deconnection(Connection connection);
}
