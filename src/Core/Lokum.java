package Core;


import java.awt.Image;
import java.io.IOException;

//import javax.imageio.ImageIO;
import javax.swing.JLabel;


public abstract class Lokum extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
	private int XofLokum;
	private int YofLokum;
	

	
	public Lokum() {
	
}



public abstract Image[] loadImage(String path, int widht) throws IOException;

public int getXofLokum(){
	return XofLokum;
}

public void setXofLokum(int XofLokum){
	this.XofLokum = XofLokum;
}

public int getYofLokum(){
	return YofLokum;
}

public void setYofLokum(int YofLokum){
	this.YofLokum = YofLokum;
}

public boolean isSpecial(Lokum lokum){
	return false;
	
}

public String toString() {
	return "Lokum [XofLokum=" + XofLokum + ", YofLokum=" + YofLokum + "]";
}

public boolean repOK(){
	return false;
	
}




}