package Core;

import java.awt.*;
import javax.swing.*;
import java.util.Arrays;



public final class GameBoard extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int row = 18;
	public static int column = 18;
	public static final int tileSize = 600 / column;
	public static final Color bgColor = new Color(150, 175, 175);
	JLabel gameBoard[][] = new JLabel[row][column];

	/**
	 * @requires: Requires Test class to call for the Game Board
	 * @ensures : Loads the basic needs for the Game Board
	 * @modifies:
	 */
	public GameBoard() {
		this.setVisible(true);
		this.setOpaque(true);
		basics();
		//System.out.println(toString());
		addLokums();

	}

	/**
	 * @requires: Requires constructor to call for it
	 * @ensures : Sets grids of the Board with the desired background color
	 */
	public void basics() {
		setPreferredSize(new Dimension(getWidth(), getHeight()));
		GridLayout grid = new GridLayout(row, column, 1, 1);
		setLayout(grid);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				gameBoard[i][j] = new JLabel();
				gameBoard[i][j].setOpaque(true);
				gameBoard[i][j].setBackground(bgColor);
				gameBoard[i][j].setBorder(BorderFactory
						.createLineBorder(new Color(0, 71, 93)));
				add(gameBoard[i][j]);
			}

		}
	}

	/**
	 * @requires: Some lokums to be destroyed
	 * @ensures : Replaces new lokums to the open spaces that occur after
	 *          explosion of the lokums
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
	 * @ensures : Fills the table with new lokums
	 * @modifies: gameBoard
	 */
	public void addLokums() {

	}

	/**
	 * @requires: A game to be loaded
	 * @ensures : Sets the lokums the right places as they were saved
	 */
	public void setLokums() {

	}

	/**
	 * @requires: Game Board to be open
	 * @ensures : Checks if all the Board is filled with lokums
	 * @modifies:
	 */
	public boolean isTableEmpty() {
		return false;
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