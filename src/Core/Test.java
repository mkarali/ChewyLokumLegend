package Core;

import java.awt.*;

import javax.swing.*;




public class Test extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Lokum selectedLokum1;
	Lokum selectedLokum2;
	GameBoard gameBoard ;
	SidePanel sidePanel ;
	int moveCount;
	
	/**
	 * @Requires: Game has to be opened.
	 * @Ensures : Adds gameBoard and SidePanel to our screen
	 * @Modifies:
	 */
	public Test(){

		super("Chewy Lokum Legend");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		gameBoard = new GameBoard();
		this.add(gameBoard, BorderLayout.CENTER);
		this.sidePanel = new SidePanel(this);
		add(sidePanel, BorderLayout.EAST);
		this.requestFocus();
		this.setSize(875, 600);
		this.setLocation(getWidth()/2 -250, (getHeight() - 450) / 2);
		this.setResizable(false);
	
	}
	

/**
 * 
 * @param selectedLokum1
 * @param selectedLokum2
 * 
 * @Requires: Clicked to two lokums that are adjacent to each other
 * @Ensures : Changes two lokums places 
 * @Modifies: 
 */
	public static void switchLokums(Lokum selectedLokum1,Lokum selectedLokum2){

	
	}
	/**
	 * 
	 * @param selectedLokum1
	 * @param selectedLokum2
	 * @Requires: Two lokums switched
	 * @Ensures : Checks whether its a appropriate move or not.
	 * @Modifies: If true calls destroy method.
	 */
	public static boolean checkLokums(Lokum selectedLokum1, Lokum selectedLokum2){
		return false;
		
	}
	/**
	 * @Requires: Two lokums switched and checkLokums returns true 
	 * @Ensures : Appropriate lokums will be deleted from our board.
	 * @Modifies:
	 */
	public static void destroy(){
		
	}
	/**
	 * 
	 * @Requires: Some lokums in the board is destroyed.
	 * @Ensures : Checks whethere there is a null part of our array if so lokums that above of null parts will slides
	 * @Modifies: It calls check lokums again for all board.
	 */
	public static void slide(){
		
	}
	/**
	 * @Requires: There has been made moves in the game.
	 * @Ensures : If  move count is 0 the game is over and the game screen exited.
	 * @Modifies:
	 */
	public static boolean isGameOver(int moveCount){
		return false;
		
	}
	/**
	 * @Requires:
	 * @Ensures :
	 * @Modifies:
	 */
	public String toString() {
		return "Test []";
	}
	/**
	 * @return
	 * @Requires:
	 * @Ensures :
	 * @Modifies:
	 */
	public boolean repOK(){
		if(selectedLokum1==null)
			return false;
		if(selectedLokum2==null)
			return false;
		if(moveCount <= 0)
			return false;
		if(gameBoard==null)
			return false;
		if(sidePanel==null)
			return false;
	
		return true;
	}
		
}
