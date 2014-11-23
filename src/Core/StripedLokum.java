package Core;

import java.awt.Image;
import java.io.IOException;


public class StripedLokum extends SpecialLokum {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @requires the player brings the same typed four lokums into the same row
	 * @ensures the striped Lokum becomes visible
	 */
	public StripedLokum() {
		
	}

	
	/**
	 * 
	 * @requires a striped lokum and two or more basic lokums, which are the same root with the wrapped lokum, comes into the same row
	 * @ensures all the lokums which are located in the direction of strips destroy.
	 * @modifies gameBoard, the board brings new lokums instead of the destroyed ones.
	 */
	
	public void explode() {
		// TODO Auto-generated method stub
		
	}


	/**
	 * 
	 * @param path
	 * @param widht
	 * @return lokums which are implemented as image
	 * @throws IOException
	 * @requires a resource folder which keeps images
	 * @ensures  the image of striped lokum is assigned to its name
	 */
	
	public Image[] loadImage(String path, int widht) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean repOK(){
		return false;	
	}


	public String toString() {
		return "StripedLokum []";
	}


}
