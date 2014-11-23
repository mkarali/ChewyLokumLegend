package Core;

import java.awt.Image;
import java.io.IOException;


public class WrappedLokum extends SpecialLokum{

	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @requires the player destroys two groups of three lokums at the same time
	 * @ensures the wrapped Lokum becomes visible
	 */
	public WrappedLokum() {
		
	}

	/**
	 * 
	 * @requires a wrapped lokum and two or more basic lokums, which are the same root with the wrapped lokum, comes into the same row
	 * @ensures all the lokums which are the neighbors of the wrapped lokum destroy.
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
	 * @ensures  the image of basic lokum is assigned to its name
	 */
	public Image[] loadImage(String path, int widht) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return "WrappedLokum []";
	}

	public boolean repOK(){
		return false;
		
	}


}
