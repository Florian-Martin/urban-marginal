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
import java.io.Serializable;

import javax.swing.JLabel;

/**
 * Permet de savoir si un JLabel est déjà présent sur le JPanel 
 * @author Florian MARTIN
 *
 */

public class Label implements Serializable {
	
	// -----------------------------------------
	/**
	 * 		VARIABLES
	 */
	// -----------------------------------------
	private static int nbLabel;
	private int numLabel;
	private JLabel jLabel;
	
	
	// -----------------------------------------
	/**
	 * 		METHODES
	 */
	// -----------------------------------------
	/**
	 * Constructor
	 * @param numLabel
	 * @param jLabel
	 */
	public Label(int numLabel, JLabel jLabel){
		this.jLabel = jLabel;
		this.numLabel = numLabel;
	}
	
	/**
	 * GETTER nbLabel
	 * @return nbLabel
	 */
	public static int getNbLabel() {
		return nbLabel;
	}
	
	/**
	 * SETTER nbLabel
	 * @param nbLabel
	 */
	public static void setNbLabel(int nbLabel) {
		Label.nbLabel = nbLabel;
	}
	
	/**
	 * GETTER numLabel
	 * @return numLabel
	 */
	public int getNumLabel() {
		return numLabel;
	}
	
	/**
	 * GETTER jLabel
	 * @return jLabel
	 */
	public JLabel getjLabel() {
		return jLabel;
	}
}
