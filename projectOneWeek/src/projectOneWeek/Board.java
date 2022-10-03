package projectOneWeek;

import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class Board {
	
	boolean wall = false;
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton[] grid;
	
	public Board() {
		
		
		frame = new JFrame("Mouse Maze");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		grid = new JButton[100];
		String[] ac = new String[100];
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		
		
	}

}
