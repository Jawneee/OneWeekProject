package projectOneWeek;

import java.util.Random;
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
		grid[360].setBackground(Color.BLACK);
		grid[360].setName("wall");
		grid[361].setBackground(Color.BLACK);
		grid[361].setName("wall");
		grid[341].setBackground(Color.BLACK);
		grid[341].setName("wall");
		grid[321].setBackground(Color.BLACK);
		grid[321].setName("wall");
		grid[301].setBackground(Color.BLACK);
		grid[301].setName("wall");
		grid[281].setBackground(Color.BLACK);
		grid[281].setName("wall");
		grid[261].setBackground(Color.BLACK);
		grid[261].setName("wall");
		grid[241].setBackground(Color.BLACK);
		grid[241].setName("wall");
		grid[363].setBackground(Color.BLACK);
		grid[363].setName("wall");
		grid[383].setBackground(Color.BLACK);
		grid[383].setName("wall");
		grid[263].setBackground(Color.BLACK);
		grid[263].setName("wall");
		grid[283].setBackground(Color.BLACK);
		grid[283].setName("wall");
		grid[303].setBackground(Color.BLACK);
		grid[303].setName("wall");
		grid[323].setBackground(Color.BLACK);
		grid[323].setName("wall");
		grid[343].setBackground(Color.BLACK);
		grid[343].setName("wall");
		grid[222].setBackground(Color.BLACK);
		grid[222].setName("wall");
		grid[221].setBackground(Color.BLACK);
		grid[221].setName("wall");
		grid[223].setBackground(Color.BLACK);
		grid[223].setName("wall");
		grid[224].setBackground(Color.BLACK);
		grid[224].setName("wall");
		grid[225].setBackground(Color.BLACK);
		grid[225].setName("wall");
		grid[264].setBackground(Color.BLACK);
		grid[264].setName("wall");
		grid[305].setBackground(Color.BLACK);
		grid[305].setName("wall");
		grid[325].setBackground(Color.BLACK);
		grid[325].setName("wall");
		grid[345].setBackground(Color.BLACK);
		grid[345].setName("wall");
		grid[365].setBackground(Color.BLACK);
		grid[365].setName("wall");
		grid[366].setBackground(Color.BLACK);
		grid[366].setName("wall");
		grid[367].setBackground(Color.BLACK);
		grid[367].setName("wall");
		grid[286].setBackground(Color.BLACK);
		grid[286].setName("wall");
		grid[266].setBackground(Color.BLACK);
		grid[266].setName("wall");
		grid[267].setBackground(Color.BLACK);
		grid[267].setName("wall");
		grid[268].setBackground(Color.BLACK);
		grid[268].setName("wall");
		grid[288].setBackground(Color.BLACK);
		grid[288].setName("wall");
		grid[308].setBackground(Color.BLACK);
		grid[308].setName("wall");
		grid[226].setBackground(Color.BLACK);
		grid[226].setName("wall");
		grid[228].setBackground(Color.BLACK);
		grid[228].setName("wall");
		grid[229].setBackground(Color.BLACK);
		grid[229].setName("wall");
		grid[227].setBackground(Color.BLACK);
		grid[227].setName("wall");
		grid[328].setBackground(Color.BLACK);
		grid[328].setName("wall");
		grid[368].setBackground(Color.BLACK);
		grid[368].setName("wall");
		grid[369].setBackground(Color.BLACK);
		grid[369].setName("wall");
		grid[370].setBackground(Color.BLACK);
		grid[370].setName("wall");
		grid[350].setBackground(Color.BLACK);
		grid[350].setName("wall");
		grid[330].setBackground(Color.BLACK);
		grid[330].setName("wall");
		grid[310].setBackground(Color.BLACK);
		grid[310].setName("wall");
		grid[290].setBackground(Color.BLACK);
		grid[290].setName("wall");
		grid[270].setBackground(Color.BLACK);
		grid[270].setName("wall");
		grid[250].setBackground(Color.BLACK);
		grid[250].setName("wall");
		grid[230].setBackground(Color.BLACK);
		grid[230].setName("wall");
		grid[392].setBackground(Color.BLACK);
		grid[392].setName("wall");
		grid[372].setBackground(Color.BLACK);
		grid[372].setName("wall");
		grid[352].setBackground(Color.BLACK);
		grid[352].setName("wall");
		grid[332].setBackground(Color.BLACK);
		grid[332].setName("wall");
		grid[312].setBackground(Color.BLACK);
		grid[312].setName("wall");
		grid[292].setBackground(Color.BLACK);
		grid[292].setName("wall");
		grid[272].setBackground(Color.BLACK);
		grid[272].setName("wall");
		grid[252].setBackground(Color.BLACK);
		grid[252].setName("wall");
		grid[232].setBackground(Color.BLACK);
		grid[232].setName("wall");
		grid[212].setBackground(Color.BLACK);
		grid[212].setName("wall");
		grid[192].setBackground(Color.BLACK);
		grid[192].setName("wall");
		grid[193].setBackground(Color.BLACK);
		grid[193].setName("wall");
		grid[194].setBackground(Color.BLACK);
		grid[194].setName("wall");
		grid[253].setBackground(Color.BLACK);
		grid[253].setName("wall");
		grid[254].setBackground(Color.BLACK);
		grid[254].setName("wall");
		grid[294].setBackground(Color.BLACK);
		grid[294].setName("wall");
		grid[314].setBackground(Color.BLACK);
		grid[314].setName("wall");
		grid[334].setBackground(Color.BLACK);
		grid[334].setName("wall");
		grid[354].setBackground(Color.BLACK);
		grid[354].setName("wall");
		grid[374].setBackground(Color.BLACK);
		grid[374].setName("wall");
		grid[377].setBackground(Color.BLACK);
		grid[377].setName("wall");
		grid[375].setBackground(Color.BLACK);
		grid[375].setName("wall");
		grid[375].setBackground(Color.WHITE);
		grid[375].setName("tile");
		grid[377].setBackground(Color.WHITE);
		grid[377].setName("tile");
		grid[376].setBackground(Color.BLACK);
		grid[376].setName("wall");
		grid[335].setBackground(Color.BLACK);
		grid[335].setName("wall");
		grid[336].setBackground(Color.BLACK);
		grid[336].setName("wall");
		grid[316].setBackground(Color.BLACK);
		grid[316].setName("wall");
		grid[296].setBackground(Color.BLACK);
		grid[296].setName("wall");
		grid[276].setBackground(Color.BLACK);
		grid[276].setName("wall");
		grid[256].setBackground(Color.BLACK);
		grid[256].setName("wall");
		grid[236].setBackground(Color.BLACK);
		grid[236].setName("wall");
		grid[216].setBackground(Color.BLACK);
		grid[216].setName("wall");
		grid[377].setBackground(Color.BLACK);
		grid[377].setName("wall");
		grid[378].setBackground(Color.BLACK);
		grid[378].setName("wall");
		grid[358].setBackground(Color.BLACK);
		grid[358].setName("wall");
		grid[338].setBackground(Color.BLACK);
		grid[338].setName("wall");
		grid[318].setBackground(Color.BLACK);
		grid[318].setName("wall");
		grid[298].setBackground(Color.BLACK);
		grid[298].setName("wall");
		grid[278].setBackground(Color.BLACK);
		grid[278].setName("wall");
		grid[278].setBackground(Color.WHITE);
		grid[278].setName("tile");
		grid[298].setBackground(Color.WHITE);
		grid[298].setName("tile");
		grid[318].setBackground(Color.WHITE);
		grid[318].setName("tile");
		grid[338].setBackground(Color.WHITE);
		grid[338].setName("tile");
		grid[358].setBackground(Color.WHITE);
		grid[358].setName("tile");
		grid[378].setBackground(Color.WHITE);
		grid[378].setName("tile");
		grid[377].setBackground(Color.WHITE);
		grid[377].setName("tile");
		grid[376].setBackground(Color.WHITE);
		grid[376].setName("tile");
		grid[399].setBackground(Color.BLACK);
		grid[399].setName("wall");
		grid[379].setBackground(Color.BLACK);
		grid[379].setName("wall");
		grid[359].setBackground(Color.BLACK);
		grid[359].setName("wall");
		grid[339].setBackground(Color.BLACK);
		grid[339].setName("wall");
		grid[319].setBackground(Color.BLACK);
		grid[319].setName("wall");
		grid[299].setBackground(Color.BLACK);
		grid[299].setName("wall");
		grid[279].setBackground(Color.BLACK);
		grid[279].setName("wall");
		grid[259].setBackground(Color.BLACK);
		grid[259].setName("wall");
		grid[239].setBackground(Color.BLACK);
		grid[239].setName("wall");
		grid[219].setBackground(Color.BLACK);
		grid[219].setName("wall");
		grid[377].setBackground(Color.BLACK);
		grid[377].setName("wall");
		grid[376].setBackground(Color.BLACK);
		grid[376].setName("wall");
		grid[357].setBackground(Color.BLACK);
		grid[357].setName("wall");
		grid[200].setBackground(Color.BLACK);
		grid[200].setName("wall");
		grid[180].setBackground(Color.BLACK);
		grid[180].setName("wall");
		grid[160].setBackground(Color.BLACK);
		grid[160].setName("wall");
		grid[140].setBackground(Color.BLACK);
		grid[140].setName("wall");
		grid[120].setBackground(Color.BLACK);
		grid[120].setName("wall");
		grid[100].setBackground(Color.BLACK);
		grid[100].setName("wall");
		grid[80].setBackground(Color.BLACK);
		grid[80].setName("wall");
		grid[60].setBackground(Color.BLACK);
		grid[60].setName("wall");
		grid[40].setBackground(Color.BLACK);
		grid[40].setName("wall");
		grid[20].setBackground(Color.BLACK);
		grid[20].setName("wall");
		grid[0].setBackground(Color.BLACK);
		grid[0].setName("wall");
		grid[19].setBackground(Color.BLACK);
		grid[19].setName("wall");
		grid[59].setBackground(Color.BLACK);
		grid[59].setName("wall");
		grid[79].setBackground(Color.BLACK);
		grid[79].setName("wall");
		grid[99].setBackground(Color.BLACK);
		grid[99].setName("wall");
		grid[119].setBackground(Color.BLACK);
		grid[119].setName("wall");
		grid[139].setBackground(Color.BLACK);
		grid[139].setName("wall");
		grid[159].setBackground(Color.BLACK);
		grid[159].setName("wall");
		grid[179].setBackground(Color.BLACK);
		grid[179].setName("wall");
		grid[199].setBackground(Color.BLACK);
		grid[199].setName("wall");
		grid[191].setBackground(Color.BLACK);
		grid[191].setName("wall");
		grid[190].setBackground(Color.BLACK);
		grid[190].setName("wall");
		grid[189].setBackground(Color.BLACK);
		grid[189].setName("wall");
		grid[188].setBackground(Color.BLACK);
		grid[188].setName("wall");
		grid[187].setBackground(Color.BLACK);
		grid[187].setName("wall");
		grid[186].setBackground(Color.BLACK);
		grid[186].setName("wall");
		grid[185].setBackground(Color.BLACK);
		grid[185].setName("wall");
		grid[184].setBackground(Color.BLACK);
		grid[184].setName("wall");
		grid[183].setBackground(Color.BLACK);
		grid[183].setName("wall");
		grid[182].setBackground(Color.BLACK);
		grid[182].setName("wall");
		grid[182].setBackground(Color.WHITE);
		grid[182].setName("tile");
		grid[183].setBackground(Color.WHITE);
		grid[183].setName("tile");
		grid[183].setBackground(Color.BLACK);
		grid[183].setName("wall");
		grid[163].setBackground(Color.BLACK);
		grid[163].setName("wall");
		grid[143].setBackground(Color.BLACK);
		grid[143].setName("wall");
		grid[123].setBackground(Color.BLACK);
		grid[123].setName("wall");
		grid[103].setBackground(Color.BLACK);
		grid[103].setName("wall");
		grid[103].setBackground(Color.WHITE);
		grid[103].setName("tile");
		grid[123].setBackground(Color.WHITE);
		grid[123].setName("tile");
		grid[143].setBackground(Color.WHITE);
		grid[143].setName("tile");
		grid[163].setBackground(Color.WHITE);
		grid[163].setName("tile");
		grid[200].setBackground(Color.WHITE);
		grid[200].setName("tile");
		grid[180].setBackground(Color.WHITE);
		grid[180].setName("tile");
		grid[160].setBackground(Color.WHITE);
		grid[160].setName("tile");
		grid[140].setBackground(Color.WHITE);
		grid[140].setName("tile");
		grid[120].setBackground(Color.WHITE);
		grid[120].setName("tile");
		grid[100].setBackground(Color.WHITE);
		grid[100].setName("tile");
		grid[80].setBackground(Color.WHITE);
		grid[80].setName("tile");
		grid[60].setBackground(Color.WHITE);
		grid[60].setName("tile");
		grid[40].setBackground(Color.WHITE);
		grid[40].setName("tile");
		grid[20].setBackground(Color.WHITE);
		grid[20].setName("tile");
		grid[0].setBackground(Color.WHITE);
		grid[0].setName("tile");
		grid[201].setBackground(Color.BLACK);
		grid[201].setName("wall");
		grid[181].setBackground(Color.BLACK);
		grid[181].setName("wall");
		grid[161].setBackground(Color.BLACK);
		grid[161].setName("wall");
		grid[141].setBackground(Color.BLACK);
		grid[141].setName("wall");
		grid[121].setBackground(Color.BLACK);
		grid[121].setName("wall");
		grid[101].setBackground(Color.BLACK);
		grid[101].setName("wall");
		grid[81].setBackground(Color.BLACK);
		grid[81].setName("wall");
		grid[61].setBackground(Color.BLACK);
		grid[61].setName("wall");
		grid[41].setBackground(Color.BLACK);
		grid[41].setName("wall");
		grid[21].setBackground(Color.BLACK);
		grid[21].setName("wall");
		grid[1].setBackground(Color.BLACK);
		grid[1].setName("wall");
		grid[121].setBackground(Color.WHITE);
		grid[121].setName("tile");
		grid[101].setBackground(Color.WHITE);
		grid[101].setName("tile");
		grid[81].setBackground(Color.WHITE);
		grid[81].setName("tile");
		grid[61].setBackground(Color.WHITE);
		grid[61].setName("tile");
		grid[41].setBackground(Color.WHITE);
		grid[41].setName("tile");
		grid[21].setBackground(Color.WHITE);
		grid[21].setName("tile");
		grid[1].setBackground(Color.WHITE);
		grid[1].setName("tile");
		grid[0].setBackground(Color.BLACK);
		grid[0].setName("wall");
		grid[20].setBackground(Color.BLACK);
		grid[20].setName("wall");
		grid[40].setBackground(Color.BLACK);
		grid[40].setName("wall");
		grid[60].setBackground(Color.BLACK);
		grid[60].setName("wall");
		grid[80].setBackground(Color.BLACK);
		grid[80].setName("wall");
		grid[100].setBackground(Color.BLACK);
		grid[100].setName("wall");
		grid[120].setBackground(Color.BLACK);
		grid[120].setName("wall");
		grid[163].setBackground(Color.BLACK);
		grid[163].setName("wall");
		grid[143].setBackground(Color.BLACK);
		grid[143].setName("wall");
		grid[123].setBackground(Color.BLACK);
		grid[123].setName("wall");
		grid[103].setBackground(Color.BLACK);
		grid[103].setName("wall");
		grid[102].setBackground(Color.BLACK);
		grid[102].setName("wall");
		grid[82].setBackground(Color.BLACK);
		grid[82].setName("wall");
		grid[62].setBackground(Color.BLACK);
		grid[62].setName("wall");
		grid[42].setBackground(Color.BLACK);
		grid[42].setName("wall");
		grid[22].setBackground(Color.BLACK);
		grid[22].setName("wall");
		grid[23].setBackground(Color.BLACK);
		grid[23].setName("wall");
		grid[25].setBackground(Color.BLACK);
		grid[25].setName("wall");
		grid[45].setBackground(Color.BLACK);
		grid[45].setName("wall");
		grid[64].setBackground(Color.BLACK);
		grid[64].setName("wall");
		grid[65].setBackground(Color.BLACK);
		grid[65].setName("wall");
		grid[104].setBackground(Color.BLACK);
		grid[104].setName("wall");
		grid[105].setBackground(Color.BLACK);
		grid[105].setName("wall");
		grid[106].setBackground(Color.BLACK);
		grid[106].setName("wall");
		grid[107].setBackground(Color.BLACK);
		grid[107].setName("wall");
		grid[87].setBackground(Color.BLACK);
		grid[87].setName("wall");
		grid[67].setBackground(Color.BLACK);
		grid[67].setName("wall");
		grid[47].setBackground(Color.BLACK);
		grid[47].setName("wall");
		grid[27].setBackground(Color.BLACK);
		grid[27].setName("wall");
		grid[196].setBackground(Color.BLACK);
		grid[196].setName("wall");
		grid[176].setBackground(Color.BLACK);
		grid[176].setName("wall");
		grid[156].setBackground(Color.BLACK);
		grid[156].setName("wall");
		grid[29].setBackground(Color.BLACK);
		grid[29].setName("wall");
		grid[49].setBackground(Color.BLACK);
		grid[49].setName("wall");
		grid[69].setBackground(Color.BLACK);
		grid[69].setName("wall");
		grid[89].setBackground(Color.BLACK);
		grid[89].setName("wall");
		grid[129].setBackground(Color.BLACK);
		grid[129].setName("wall");
		grid[109].setBackground(Color.BLACK);
		grid[109].setName("wall");
		grid[149].setBackground(Color.BLACK);
		grid[149].setName("wall");
		grid[148].setBackground(Color.BLACK);
		grid[148].setName("wall");
		grid[147].setBackground(Color.BLACK);
		grid[147].setName("wall");
		grid[146].setBackground(Color.BLACK);
		grid[146].setName("wall");
		grid[145].setBackground(Color.BLACK);
		grid[145].setName("wall");
		grid[150].setBackground(Color.BLACK);
		grid[150].setName("wall");
		grid[151].setBackground(Color.BLACK);
		grid[151].setName("wall");
		grid[152].setBackground(Color.BLACK);
		grid[152].setName("wall");
		grid[153].setBackground(Color.BLACK);
		grid[153].setName("wall");
		grid[154].setBackground(Color.BLACK);
		grid[154].setName("wall");
		grid[155].setBackground(Color.BLACK);
		grid[155].setName("wall");
		grid[31].setBackground(Color.BLACK);
		grid[31].setName("wall");
		grid[51].setBackground(Color.BLACK);
		grid[51].setName("wall");
		grid[71].setBackground(Color.BLACK);
		grid[71].setName("wall");
		grid[91].setBackground(Color.BLACK);
		grid[91].setName("wall");
		grid[11].setBackground(Color.BLACK);
		grid[11].setName("wall");
		grid[111].setBackground(Color.BLACK);
		grid[111].setName("wall");
		grid[112].setBackground(Color.BLACK);
		grid[112].setName("wall");
		grid[113].setBackground(Color.BLACK);
		grid[113].setName("wall");
		grid[114].setBackground(Color.BLACK);
		grid[114].setName("wall");
		grid[115].setBackground(Color.BLACK);
		grid[115].setName("wall");
		grid[157].setBackground(Color.BLACK);
		grid[157].setName("wall");
		grid[177].setBackground(Color.BLACK);
		grid[177].setName("wall");
		grid[197].setBackground(Color.BLACK);
		grid[197].setName("wall");
		grid[217].setBackground(Color.BLACK);
		grid[217].setName("wall");
		grid[237].setBackground(Color.BLACK);
		grid[237].setName("wall");
		grid[257].setBackground(Color.BLACK);
		grid[257].setName("wall");
		grid[277].setBackground(Color.BLACK);
		grid[277].setName("wall");
		grid[297].setBackground(Color.BLACK);
		grid[297].setName("wall");
		grid[317].setBackground(Color.BLACK);
		grid[317].setName("wall");
		grid[337].setBackground(Color.BLACK);
		grid[337].setName("wall");
		grid[116].setBackground(Color.BLACK);
		grid[116].setName("wall");
		grid[117].setBackground(Color.BLACK);
		grid[117].setName("wall");
		grid[97].setBackground(Color.BLACK);
		grid[97].setName("wall");
		grid[77].setBackground(Color.BLACK);
		grid[77].setName("wall");
		grid[77].setBackground(Color.WHITE);
		grid[77].setName("tile");
		grid[58].setBackground(Color.BLACK);
		grid[58].setName("wall");
		grid[76].setBackground(Color.BLACK);
		grid[76].setName("wall");
		grid[75].setBackground(Color.BLACK);
		grid[75].setName("wall");
		grid[56].setBackground(Color.BLACK);
		grid[56].setName("wall");
		grid[35].setBackground(Color.BLACK);
		grid[35].setName("wall");
		grid[35].setBackground(Color.WHITE);
		grid[35].setName("tile");
		grid[74].setBackground(Color.BLACK);
		grid[74].setName("wall");
		grid[73].setBackground(Color.BLACK);
		grid[73].setName("wall");
		grid[18].setBackground(Color.BLACK);
		grid[18].setName("wall");
		grid[17].setBackground(Color.BLACK);
		grid[17].setName("wall");
		grid[16].setBackground(Color.BLACK);
		grid[16].setName("wall");
		grid[15].setBackground(Color.BLACK);
		grid[15].setName("wall");
		grid[14].setBackground(Color.BLACK);
		grid[14].setName("wall");
		grid[13].setBackground(Color.BLACK);
		grid[13].setName("wall");
		grid[12].setBackground(Color.BLACK);
		grid[12].setName("wall");
		grid[75].setBackground(Color.WHITE);
		grid[75].setName("tile");
		grid[54].setBackground(Color.BLACK);
		grid[54].setName("wall");
		grid[53].setBackground(Color.BLACK);
		grid[53].setName("wall");
		grid[96].setBackground(Color.BLACK);
		grid[96].setName("wall");

		
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
