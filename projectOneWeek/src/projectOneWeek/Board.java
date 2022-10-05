package projectOneWeek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Board {
	
	
	Mouse m = new Mouse();
	int mousePos;
	
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton[] grid;
	boolean mouseToggle;
	JButton mouseButton;
	JButton clear;
	JButton preset1;
	
	boolean mousePlaced;
	
	public Board() {
		mouseToggle = false;
		mousePlaced = false;
		
		frame = new JFrame("Mouse Maze");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.setLocationRelativeTo(null);
		
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		grid = new JButton[400];
		String[] ac = new String[400];
		preset1 = new JButton();
		preset1.setBackground(Color.gray);
		preset1.setText("Preset1");
		
		clear=new JButton();
		clear.setBackground(Color.lightGray);
		clear.setText("Clear");
		mouseButton = new JButton();
		mouseButton.setBackground(Color.RED);
		mouseButton.setText("Mouse");
		mouseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(mouseToggle) {
					mouseButton.setBackground(Color.RED);
					mouseToggle = false;
				}else {
					mouseButton.setBackground(Color.GREEN);
					mouseToggle = true;
				}
				
			}
			
		});
		
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clearBoard();
			}
			
		});
		
		preset1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				preset1();
			}
			
		});
		
		for(int i=0; i<400; i++) {
            if(i == 20 || i==40 || i==60 || i==80 || i==100 || i==120 || i==140 || i==160 || i==180 || i == 200|| i==220||i==240||i==260||i==280||i==300||i==320||i==340||i==360||i==380) {
                c.gridy = c.gridy + 2;
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
            
            
            grid[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					int temp;
					
					temp=Integer.valueOf(e.getActionCommand());	
					System.out.println("grid["+temp+"].setBackground(Color.BLACK);");
					if(mouseToggle == false) {
						if(grid[temp].getName() == "tile") {
							grid[temp].setBackground(Color.BLACK);
							grid[temp].setName("wall");
						}else if(grid[temp].getName() == "wall") {
							grid[temp].setBackground(Color.WHITE);
							grid[temp].setName("tile");
						}
					}else {
						if(grid[temp].getName() == "tile" && mousePlaced == false) {
							grid[temp].setBackground(Color.ORANGE);
							grid[temp].setName("mouse");
							mousePlaced = true;
							mousePos = temp;
						}else if(grid[temp].getName() == "mouse" && mousePlaced) {
							grid[temp].setBackground(Color.WHITE);
							grid[temp].setName("tile");
							mousePlaced = false;
						}
						
					}
					
					
					
				}
            	
            	
			});
            
		}
		
		
		
		
		panel.add(preset1);
		panel.add(clear);
		panel.add(mouseButton, c);
		frame.setContentPane(panel);
		frame.setVisible(true);
		
		
	}
	public void clearBoard() {
		for(int i=0;i<grid.length;i++) {
			grid[i].setName("tile");
			grid[i].setBackground(Color.white);
			mousePlaced=false;
		}
		
	}
	public void preset1() {
		
		
	}
	public void preset2() {
		
	}
	public void moveMouse() {
		
		
		if(mousePlaced) {
			if(grid[mousePos+1].getName() == "tile" && grid[mousePos+1].getBackground() != Color.gray) {
				grid[mousePos].setBackground(Color.WHITE);
				grid[mousePos].setName("tile");
				grid[mousePos+1].setBackground(Color.ORANGE);
				grid[mousePos+1].setName("mouse");
				grid[mousePos].setBackground(Color.gray);
				mousePos = mousePos+m.right();
				System.out.println("Move Right");
			}else if(grid[mousePos-1].getName() == "tile" && grid[mousePos-1].getBackground() != Color.gray) {
				grid[mousePos].setBackground(Color.WHITE);
				grid[mousePos].setName("tile");
				grid[mousePos+m.left()].setBackground(Color.ORANGE);
				grid[mousePos+m.left()].setName("mouse");
				grid[mousePos].setBackground(Color.gray);
				mousePos = mousePos+m.left();
				System.out.println("Move Left");
			}else if(grid[mousePos-20].getName() == "tile" && grid[mousePos-20].getBackground() != Color.gray) {
				grid[mousePos].setBackground(Color.WHITE);
				grid[mousePos].setName("tile");
				grid[mousePos+m.up()].setBackground(Color.ORANGE);
				grid[mousePos+m.up()].setName("mouse");
				grid[mousePos].setBackground(Color.gray);
				mousePos = mousePos+m.up();
			}else if(grid[mousePos+20].getName() == "tile" && grid[mousePos+20].getBackground() != Color.gray) {
				grid[mousePos].setBackground(Color.WHITE);
				grid[mousePos].setName("tile");
				grid[mousePos+m.down()].setBackground(Color.ORANGE);
				grid[mousePos+m.down()].setName("mouse");
				grid[mousePos].setBackground(Color.gray);
				mousePos = mousePos+m.down();
			}
		}
	}
	

}
