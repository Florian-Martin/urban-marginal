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
	// Méthodes à redéfinir dans les classes filles JeuClient et JeuServeur 
	/**
	 * Réception d'une connection
	 * @param connection
	 */
	public abstract void setConnection(Connection connection);
	
	/**
	 * Réception d'une information
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
	 * Déconnexion de l'ordinateur distant
	 * @param connection
	 */
	public abstract void deconnection(Connection connection);
}
