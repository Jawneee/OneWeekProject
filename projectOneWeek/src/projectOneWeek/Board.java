package projectOneWeek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Board {
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton[] grid;
	boolean mouseToggle;
	JButton mouseButton;
	
	public Board() {
		mouseToggle = false;
		
		frame = new JFrame("Mouse Maze");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		grid = new JButton[200];
		String[] ac = new String[200];
		mouseButton = new JButton();
		mouseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hello");
				
			}
			
		});
		mouseButton.setPreferredSize(new Dimension(50,50));
		//panel.add(mouseButton, c); dont add this yet
		
		for(int i=0; i<200; i++) {
            if(i == 20 || i==40 || i==60 || i==80 || i==100 || i==120 || i==140 || i==160 || i==180) {
                c.gridy = c.gridy + 2;
                System.out.println("HEllo");
            }
			String get;
            get = String.valueOf(i);
            ac[i] = get;
            grid[i] = new JButton();
            grid[i].setActionCommand(ac[i]);
            grid[i].setPreferredSize(new Dimension(25,25));
            grid[i].setBackground(Color.white);
            grid[i].setName("tile");
            panel.add(grid[i], c);
            System.out.println("Made Grid");
            
            
            grid[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					int temp;
					
					temp=Integer.valueOf(e.getActionCommand());
					
					if(mouseToggle == false) {
						if(grid[temp].getName() == "tile") {
							grid[temp].setBackground(Color.BLACK);
							grid[temp].setName("wall");
						}else if(grid[temp].getName() == "wall") {
							grid[temp].setBackground(Color.WHITE);
							grid[temp].setName("tile");
						}
					}else if(mouseToggle == true) {
						
					}
					
					System.out.println("This space is: " + grid[temp].getName());
					
				}
            	
            	
			});
            
		}
		
		
		
		
		
		
		
		frame.setContentPane(panel);
		frame.setVisible(true);
		
		
	}

}
