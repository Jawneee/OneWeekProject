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
		
		for(int i=0; i<100; i++) {
            if(i == 10 || i==20 || i==30 || i==40 || i==50 || i==60 || i==70 || i==80 || i==90) {
                c.gridy = c.gridy + 2;
                System.out.println("HEllo");
            }
			String get;
            get = String.valueOf(i);
            ac[i] = get;
            grid[i] = new JButton();
            grid[i].setActionCommand(ac[i]);
            grid[i].setPreferredSize(new Dimension(50,50));
            grid[i].setBackground(Color.white);
            grid[i].setName("tile");
            panel.add(grid[i], c);
		}
		
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		
		
	}

}
