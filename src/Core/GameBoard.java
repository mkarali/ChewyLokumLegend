package Core;

import java.awt.*;
import java.io.IOException;

import javax.swing.*;
import java.util.Arrays;



public final class GameBoard extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int row = 10;
	public static int column = 10;
	public static final int tileSize = 600 / column;
	public static final Color bgColor = new Color(150, 175, 175);
	static JLabel gameBoard[][] = new JLabel[row][column];
	static int gameBoardInteger[][]=new int [row][column];
	public static Icon newIcon;
	public static int count=1;
	static int newIconInt;

	/**
	 * @throws IOException 
	 * @requires: Requires Test class to call for the Game Board
	 * @ensures : Loads the basic needs for the Game Board
	 * @modifies: gameBoard
	 */
	public GameBoard() throws IOException {
		if (repOK()) {	
			
			this.setVisible(true);
			this.setOpaque(true);
			basics();
			addLokums();
			
		} else {			
			System.out.println("SOMETHING IS WRONG WITH FIELDS IN GAME_BOARD CLASS");
			System.exit(0);
		}

	}

	/**
	 * @throws IOException 
	 * @requires: Requires constructor to call for it
	 * @ensures : Sets grids of the Board with the desired background color
	 */
	public void basics() throws IOException {
		
		setPreferredSize(new Dimension(getWidth(), getHeight()));
		GridLayout grid = new GridLayout(row, column, 1, 1);
		setLayout(grid);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				gameBoard[i][j] = new JLabel();
				gameBoard[i][j].setOpaque(true);
				gameBoard[i][j].setBackground(bgColor);	
				
//				gameBoard[i][j].setBorder(BorderFactory.createLineBorder(new Color(0, 71, 93)));
				add(gameBoard[i][j]);
			}

		}
//		randomLokum();
//		gameBoard[5][5].setIcon(newIcon);
		
	}

	/**
	 * @requires: Some lokums to be destroyed
	 * @ensures : Replaces new lokums to the open spaces that occur after
	 *          explosion of the lokums
	 * @modifies: gameBoard
	 */
	public void replaceNewLokums() {

	}

	/**
	 * @requires: |XofLokum1-XofLokum2|=<1 && |YofLokum1-YofLokum2|=<1 
	 * & Lokum1 & Lokum2 doesn't make a consecutive 3/4/5 after the switch
	 * @ensures : XofLokum1=old(XofLokum1) && YofLokum1=old(YofLokum1)
	 * 			  XofLokum2=old(XofLokum2) && YofLokum2=old(YofLokum2)
	 * @modifies: Lokum1 & Lokum2 & gameBoard
	 */
	public void tableBack() {

	}

	/**
	 * @requires: Game Board to be opened
	 * @ensures : Fills the table with new random lokums
	 * @modifies: gameBoard
	 */
	public void addLokums() {
		if (isTableEmpty()) {
			randomLokum();
			Icon Lokum2 = newIcon;
			int Icon2=newIconInt;
//			if (newIcon == Lokum2) {
//			System.out.println(newIcon.toString() );
//			System.out.println( Lokum2.toString() );
//			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < column; j++) {
						randomLokum();
						if (count < 2) {
							System.out.print("2");
							if (Icon2==newIconInt) {
								gameBoard[i][j].setIcon(newIcon);
								gameBoardInteger[i][j]=newIconInt;
								count=2;
								System.out.println("3");
							} else {
								Lokum2 = newIcon;
								gameBoard[i][j].setIcon(newIcon);
								gameBoardInteger[i][j]=newIconInt;
								System.out.print("4");
							}
						} else {
							System.out.print("5");
							while (Icon2==newIconInt) {
								randomLokum();
							}
							Lokum2 = newIcon;
							gameBoard[i][j].setIcon(newIcon);
							gameBoardInteger[i][j]=newIconInt;
							count = 1;
							System.out.println("6");
						}
					
				}

			}
		} else {
			System.out.println("Table is not initiated empty");
			System.exit(0);
		}

	}
	
//	public void addLokum() {
//		
//	}

	/**
	 * @requires: A game to be loaded
	 * @ensures : Sets the lokums the right places as they were saved
	 * @modifies: gameBoard
	 */
	public void setLokums() {

	}

	/**
	 * @requires: Game Board to be open
	 * @ensures : Checks if all the Board is filled with lokums
	 */
	public boolean isTableEmpty() {
		int ct = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (gameBoard[i][j].getIcon() == null) {
					ct++;
				}
			}

		}
		if (ct == 100) {
			return true;
		} else {
			System.out.println("Table is not initiated empty");
			System.exit(0);
			return false;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GameBoard [gameBoard=" + Arrays.toString(gameBoard) + "]";
	}
	
	
	public Icon randomLokum(){
		int randomix = (int) (Math.random() * 4 + 1);
		
		if (randomix == 1) {
			newIcon =BasicLokum.pistachio;
			newIconInt=1;
		} else if (randomix == 2) {
			newIcon = BasicLokum.hazelnut;
			newIconInt=2;
		} else if (randomix == 3) {
			newIcon = BasicLokum.coconut;
			newIconInt=3;
		} else if (randomix == 4) {
			newIcon = BasicLokum.rose;
			newIconInt=4;
		}
		
			
		
		return newIcon;
		
	}

	public boolean repOK() {
		if (row != column) {
			return false;
		}
		if (tileSize == 0) {
			return false;
		}
		if (gameBoard.length == 0) {
			return false;
		}

		return true;
	}

}