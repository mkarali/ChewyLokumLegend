package Core;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class MainScreen {

	Test test;
	public static int rate = 600;
	static int counter = 0;
	public static int level = 3;

	public static JFrame table1;

	/**
	 * @requires:
	 * @ensures:
	 * @modifies:
	 * @param args
	 */
	public static void main(String[] args)

	{
		table1 = new JFrame("Chewy Lokum Legend");
		table1.setVisible(true);
		table1.setSize(300, 350);
		table1.setLocation((table1.getWidth() + 800) / 2,
				(table1.getHeight() + 150) / 2);
		table1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table1.setResizable(false);
		JPanel panel = new JPanel();
		table1.add(panel);
		panel.setBackground(GameBoard.bgColor);
		JButton button_1 = new JButton("New Game");
		button_1.setOpaque(true);
		button_1.setVisible(true);
	

		button_1.setPreferredSize(new Dimension(150, 90));
		
	
		panel.add(button_1);
		button_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				java.awt.EventQueue.invokeLater(new Runnable() {

					public void run() {
						new Test().setVisible(true);
						table1.setVisible(false);

					}
				});

			}

		});
		panel.setVisible(true);
		JButton button_2 = new JButton("Load Game");
		button_2.setOpaque(true);
		panel.setVisible(true);
	
		button_2.setPreferredSize(new Dimension(150, 90));		
		panel.add(button_2);
		
		
		JButton button_3 = new JButton("Quit");
		button_3.setOpaque(true);
		panel.setVisible(true);
	
		button_3.setPreferredSize(new Dimension(150, 90));		
		panel.add(button_3);
		
		button_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent m) {
				table1.setVisible(false);
			}
		});
		

	}

	

}
