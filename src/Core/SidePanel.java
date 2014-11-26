package Core;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
		
		
		this.setLayout(null);
		
		JButton saveButton = new JButton("Save");
		
		saveButton.setOpaque(true);
		saveButton.setVisible(true);
		saveButton.setBackground(new Color(125, 150, 150));
		saveButton.setForeground(new Color(128, 21, 128));
		saveButton.setFont(new Font("Jokerman", Font.BOLD, 30));
		
		saveButton.setBounds(15,300,250,75);
		this.add(saveButton);
	
		saveButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent m) {
				saveGame("ece");
			}
		});
		
		
		
		JButton retryButton = new JButton("Retry");
		
		retryButton.setOpaque(true);
		retryButton.setVisible(true);
		retryButton.setBackground(new Color(125, 150, 150));
		retryButton.setForeground(new Color(128, 21, 128));
		retryButton.setFont(new Font("Jokerman", Font.BOLD, 30));
			
		retryButton.setBounds(15,375,250,75);
		this.add(retryButton);
	
		retryButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent m) {
				retry();
			}
		});
		
		
			
		JButton quitButton = new JButton("Quit");
		quitButton.setOpaque(true);
		quitButton.setVisible(true);
		quitButton.setBackground(new Color(125, 150, 150));
		quitButton.setForeground(new Color(128, 21, 128));
		quitButton.setFont(new Font("Jokerman", Font.BOLD, 30));
		
		quitButton.setBounds(15,450,250,75);
		this.add(quitButton);
	
		quitButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent m) {
				quit();
			}
		});
		

	
		
		
		
		
		
		
		
	}

	/**
	 * @param g
	 * 
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//repaint();

		g.setColor(Color.white);
		g.setFont(new Font("Jokerman", Font.BOLD, 20));
		g.drawString("Target Score: 2000", 4, 90);
		g.drawString("Level: 1", 4, 130);
		g.drawString("Moves Left: 0", 4, 170);
		g.drawString("Score: 0", 4, 210);
		g.setFont(new Font("Jokerman", Font.BOLD, 26));
		//g.setColor(new Color(128, 21, 128));
		//g.drawString("Made by Cekirdek", 4, 550);
		
		
		
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
	public void retry() {
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					
					new Test().setVisible(true);
					
					System.out.println("The game is being restarted now");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
			//	

			}
		});
	}

	/**
	 * @requires : game should be opened.
	 * @ensures : current game will be closed.
	 * @modifies : game screen will be closed, user is asked to whether to save
	 *           the game or not to.
	 */

	public void quit() {
		 int response = JOptionPane.showConfirmDialog(null, "Do you want to save game?", "Confirmation",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		 if (response == JOptionPane.NO_OPTION) {
		      System.out.println("No button clicked");
		    } else {
		      System.out.println("Yes button clicked");
		      //ececeececece
		    }
		System.exit(0);
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