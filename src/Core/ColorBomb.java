package Core;

import java.awt.Image;
import java.io.IOException;


public class ColorBomb extends SpecialLokum {

	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @requires the player brings the same colored five lokums into the same row
	 * @ensures  the color bomb lokum becomes visible
	 */
	public ColorBomb() {
		
	}

	/**
	 * 
	 * @requires a color bomb and any basic lokums becomes adjacent
	 * @ensures all the lokums which have the same type of the basic lokum destroy.
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
	 * @ensures  the image of colorBomb lokum is assigned to its name
	 */
	public Image[] loadImage(String path, int widht) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	public String toString() {
		return "ColorBomb []";
	}
	
	public boolean repOK(){
		return false;
		
	}


}
