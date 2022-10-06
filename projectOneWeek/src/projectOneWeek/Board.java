package projectOneWeek;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Board {
	String a = "\"\"";
	
	
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
	JButton preset2;
	
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
		
		preset2 = new JButton();
		preset2.setBackground(Color.gray);
		preset2.setText("Preset2");
		
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
				clearBoard();
				preset1();
			}
			
		});
		
		preset2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				clearBoard();
				preset2();
				
				
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
					if(mouseToggle == false) {
						if(grid[temp].getName() == "tile") {
							grid[temp].setBackground(Color.BLACK);
							grid[temp].setName("wall");
							System.out.println("grid["+temp+"].setBackground(Color.BLACK);");
							System.out.println("grid["+temp+"].setName(\"wall\");");
						}else if(grid[temp].getName() == "wall") {
							grid[temp].setBackground(Color.WHITE);
							grid[temp].setName("tile");
							System.out.println("grid["+temp+"].setBackground(Color.WHITE);");
							System.out.println("grid["+temp+"].setName(\"tile\");");
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
		
		
		
		panel.add(preset2);
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
		
		grid[384].setBackground(Color.BLACK);
		grid[384].setName("wall");
		grid[386].setBackground(Color.BLACK);
		grid[386].setName("wall");
		grid[364].setBackground(Color.BLACK);
		grid[364].setName("wall");
		grid[344].setBackground(Color.BLACK);
		grid[344].setName("wall");
		grid[304].setBackground(Color.BLACK);
		grid[304].setName("wall");
		grid[324].setBackground(Color.BLACK);
		grid[324].setName("wall");
		grid[305].setBackground(Color.BLACK);
		grid[305].setName("wall");
		grid[306].setBackground(Color.BLACK);
		grid[306].setName("wall");
		grid[307].setBackground(Color.BLACK);
		grid[307].setName("wall");
		grid[308].setBackground(Color.BLACK);
		grid[308].setName("wall");
		grid[309].setBackground(Color.BLACK);
		grid[309].setName("wall");
		grid[329].setBackground(Color.BLACK);
		grid[329].setName("wall");
		grid[349].setBackground(Color.BLACK);
		grid[349].setName("wall");
		grid[366].setBackground(Color.BLACK);
		grid[366].setName("wall");
		grid[346].setBackground(Color.BLACK);
		grid[346].setName("wall");
		grid[347].setBackground(Color.BLACK);
		grid[347].setName("wall");
		grid[367].setBackground(Color.BLACK);
		grid[367].setName("wall");
		grid[387].setBackground(Color.BLACK);
		grid[387].setName("wall");
		grid[388].setBackground(Color.BLACK);
		grid[388].setName("wall");
		grid[389].setBackground(Color.BLACK);
		grid[389].setName("wall");
		grid[390].setBackground(Color.BLACK);
		grid[390].setName("wall");
		grid[391].setBackground(Color.BLACK);
		grid[391].setName("wall");
		grid[371].setBackground(Color.BLACK);
		grid[371].setName("wall");
		grid[371].setBackground(Color.WHITE);
		grid[371].setName("tile");
		grid[351].setBackground(Color.BLACK);
		grid[351].setName("wall");
		grid[371].setBackground(Color.BLACK);
		grid[371].setName("wall");
		grid[331].setBackground(Color.BLACK);
		grid[331].setName("wall");
		grid[311].setBackground(Color.BLACK);
		grid[311].setName("wall");
		grid[291].setBackground(Color.BLACK);
		grid[291].setName("wall");
		grid[271].setBackground(Color.BLACK);
		grid[271].setName("wall");
		grid[270].setBackground(Color.BLACK);
		grid[270].setName("wall");
		grid[270].setBackground(Color.WHITE);
		grid[270].setName("tile");
		grid[270].setBackground(Color.BLACK);
		grid[270].setName("wall");
		grid[269].setBackground(Color.BLACK);
		grid[269].setName("wall");
		grid[268].setBackground(Color.BLACK);
		grid[268].setName("wall");
		grid[267].setBackground(Color.BLACK);
		grid[267].setName("wall");
		grid[266].setBackground(Color.BLACK);
		grid[266].setName("wall");
		grid[265].setBackground(Color.BLACK);
		grid[265].setName("wall");
		grid[265].setBackground(Color.WHITE);
		grid[265].setName("tile");
		grid[264].setBackground(Color.BLACK);
		grid[264].setName("wall");
		grid[265].setBackground(Color.BLACK);
		grid[265].setName("wall");
		grid[263].setBackground(Color.BLACK);
		grid[263].setName("wall");
		grid[262].setBackground(Color.BLACK);
		grid[262].setName("wall");
		grid[282].setBackground(Color.BLACK);
		grid[282].setName("wall");
		grid[302].setBackground(Color.BLACK);
		grid[302].setName("wall");
		grid[322].setBackground(Color.BLACK);
		grid[322].setName("wall");
		grid[342].setBackground(Color.BLACK);
		grid[342].setName("wall");
		grid[362].setBackground(Color.BLACK);
		grid[362].setName("wall");
		grid[382].setBackground(Color.BLACK);
		grid[382].setName("wall");
		
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
