package Core;

import java.awt.Image;
import java.io.IOException;


public class BasicLokum extends Lokum{

	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @ensures the basic lokums(the green pistachio,the red rose, the brown hazelnut, and the white coconut lokums) become visible
	 */
	public BasicLokum() {
		
	}

	/**
	 * 
	 * @param path
	 * @param widht
	 * @return lokums which are implemented as image
	 * @throws IOException
	 * @requires a resource folder which keeps images
	 * @ensures the images of basic lokums are assigned to their name
	 */
	public Image[] loadImage(String path, int widht) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public String toString() {
		return "BasicLokum []";
	}

	public boolean repOK(){
		return false;
		
	}


}
