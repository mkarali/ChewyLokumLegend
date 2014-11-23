package Core;

import java.awt.*;

import javax.swing.*;

public class SidePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static int targetScore = 0;
	public static int currentScore = 0;
	public static int moveCount = 0;
	public Level myLevel;

	/**
	 * 
	 * @param test
	 * @requires : game screen should be opened.
	 * @ensures: side will be seen in the screen near the game board.
	 * @modifies : target score, level, move count, current score will exists in
	 *           the side panel.
	 */
	public SidePanel(Test test) {
		setPreferredSize(new Dimension(275, 600));
		setBackground(new Color(125, 150, 150));
	}

	/**
	 * @param g
	 * 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();

		g.setColor(Color.white);
		g.setFont(new Font("Jokerman", Font.BOLD, 20));
		g.drawString("Target Score: 2000", 4, 90);
		g.drawString("Level: 1", 4, 130);
		g.drawString("Moves Left: 0", 4, 170);
		g.drawString("Score: 0", 4, 210);
		g.setFont(new Font("Jokerman", Font.BOLD, 26));
		g.setColor(new Color(128, 21, 128));
		g.drawString("Made by Cekirdek", 4, 550);
	}

	/**
	 * @requires : 2 lokums to be switched
	 * @ensures : decreases move count by 1
	 * @modifies : while move count decreases, score increases
	 */
	public void updateMove() {

	}

	/**
	 * @requires : 2 lokums to be switched
	 * @ensures : update score according to the type of the movement.
	 * @modifies : while score increases, move count decreases
	 */

	public void updateScore() {

	}

	/**
	 * @requires: the game should be ended.
	 * @ensures : new game screen opens from the current level.
	 * @modifies : new game screen opens,move count and target score should be
	 *           settled according to the current level
	 * 
	 */
	public void rety() {

	}

	/**
	 * @requires : game should be opened.
	 * @ensures : current game will be closed.
	 * @modifies : game screen will be closed, user is asked to whether to save
	 *           the game or not to.
	 */

	public void quit() {

	}

	/**
	 * 
	 * @param s
	 * @requires : there should be current active game.
	 * @ensures : game screen, side panel, move count, target score, level and
	 *          current score should be saved.
	 * @modifies : it saves the mentioned informations to the XML File
	 */
	public void saveGame(String s) {

	}

	/**
	 * 
	 * @param w
	 * @requires : there should be a saved game.
	 * @ensures : saved informations should exist in the XML File.
	 */
	public void writeXML(String w) {

	}

	public void getTargetScore() {

	}

	public void getMoveCount() {

	}

	public void getLevel() {

	}

	public void setLevel(Level l) {

	}

	@Override
	public String toString() {
		return "SidePanel [myLevel=" + myLevel + "]";
	}

	public boolean repOk() {
		if (targetScore == 0) {
			return false;
		}

		if (moveCount == 0) {
			return false;
		}
		if (currentScore != 0) {
			return false;
		}
		return true;
	}

}