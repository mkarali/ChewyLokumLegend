package Core;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
//import javax.imageio.ImageIO;
import javax.swing.JLabel;

public abstract class Lokum extends JLabel {

	private static final long serialVersionUID = 1L;

	private int XofLokum;
	private int YofLokum;

	public Lokum() {

	}

	public static Image loadImage(String path) throws IOException {

		BufferedImage loadImage = ImageIO.read(Lokum.class.getResource(path));
		//Image image = new Image[loadImage.getWidth()/ widht];
		
		 return loadImage;
	}

	public int getXofLokum() {
		return XofLokum;
	}

	public void setXofLokum(int XofLokum) {
		this.XofLokum = XofLokum;
	}

	public int getYofLokum() {
		return YofLokum;
	}

	public void setYofLokum(int YofLokum) {
		this.YofLokum = YofLokum;
	}

	public boolean isSpecial(Lokum lokum) {
		return false;

	}

	public String toString() {
		return "Lokum [XofLokum=" + XofLokum + ", YofLokum=" + YofLokum + "]";
	}

	public boolean repOK() {
		return false;

	}

}