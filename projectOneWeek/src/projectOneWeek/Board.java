package projectOneWeek;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.util.*;

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
	JButton grayClear;
	JButton preset1;
	JButton preset2;

	boolean mousePlaced;
	int lastLoc;
	Random r = new Random();

	public Board() {
		lastLoc = 0;
		mouseToggle = false;
		mousePlaced = false;

		frame = new JFrame("Mouse Maze");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1500, 750);
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

		grayClear = new JButton();
		grayClear.setBackground(Color.lightGray);
		grayClear.setText("GrayClear");

		clear = new JButton();
		clear.setBackground(Color.lightGray);
		clear.setText("Clear");
		mouseButton = new JButton();
		mouseButton.setBackground(Color.RED);
		mouseButton.setText("Mouse");
		mouseButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (mouseToggle) {
					mouseButton.setBackground(Color.RED);
					mouseToggle = false;
				} else {
					mouseButton.setBackground(Color.GREEN);
					mouseToggle = true;
				}

			}

		});

		grayClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				grayClear();
			}

		});
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				clearBoard();
			}

		});

		preset1.addActionListener(new ActionListener() {

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
		for (int i = 0; i < 400; i++) {
			if (i == 20 || i == 40 || i == 60 || i == 80 || i == 100 || i == 120 || i == 140 || i == 160 || i == 180
					|| i == 200 || i == 220 || i == 240 || i == 260 || i == 280 || i == 300 || i == 320 || i == 340
					|| i == 360 || i == 380) {
				c.gridy = c.gridy + 2;
			}
			String get;
			get = String.valueOf(i);
			ac[i] = get;
			grid[i] = new JButton();

			grid[i].setActionCommand(ac[i]);
			grid[i].setPreferredSize(new Dimension(25, 25));
			grid[i].setBackground(Color.white);
			grid[i].setName("tile");
			panel.add(grid[i], c);

			grid[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					int temp;

					temp = Integer.valueOf(e.getActionCommand());
					if (mouseToggle == false) {
						if (grid[temp].getName() == "tile") {
							grid[temp].setBackground(Color.BLACK);
							grid[temp].setName("wall");
							// System.out.println("grid["+temp+"].setBackground(Color.BLACK);");
							// System.out.println("grid["+temp+"].setName(\"wall\");");
						} else if (grid[temp].getName() == "wall") {
							grid[temp].setBackground(Color.WHITE);
							grid[temp].setName("tile");
							// System.out.println("grid["+temp+"].setBackground(Color.WHITE);");
							// System.out.println("grid["+temp+"].setName(\"tile\");");
						}
					} else {
						if (grid[temp].getName() == "tile" && mousePlaced == false) {
							grid[temp].setBackground(Color.ORANGE);
							grid[temp].setName("mouse");
							mousePlaced = true;
							mousePos = temp;
						} else if (grid[temp].getName() == "mouse" && mousePlaced) {
							grid[temp].setBackground(Color.WHITE);
							grid[temp].setName("tile");
							mousePlaced = false;
						}

					}

				}

			});

		}

		panel.add(grayClear);
		panel.add(preset2);
		panel.add(preset1);
		panel.add(clear);
		panel.add(mouseButton, c);
		frame.setContentPane(panel);
		frame.setVisible(true);

	}

	public void grayClear() {
		for (int i = 0; i < grid.length; i++) {
			if (grid[i].getBackground() == Color.gray) {
				grid[i].setName("tile");
				grid[i].setBackground(Color.white);
			}
		}
	}

	public void clearBoard() {
		for (int i = 0; i < grid.length; i++) {
			grid[i].setName("tile");
			grid[i].setBackground(Color.white);
			mousePlaced = false;
		}

	}

	public void preset1() {

		grid[340].setBackground(Color.BLACK);
		grid[340].setName("wall");
		grid[360].setBackground(Color.BLACK);
		grid[360].setName("wall");
		grid[380].setBackground(Color.BLACK);
		grid[380].setName("wall");
		grid[381].setBackground(Color.BLACK);
		grid[381].setName("wall");
		grid[382].setBackground(Color.BLACK);
		grid[382].setName("wall");
		grid[383].setBackground(Color.BLACK);
		grid[383].setName("wall");
		grid[384].setBackground(Color.BLACK);
		grid[384].setName("wall");
		grid[385].setBackground(Color.BLACK);
		grid[385].setName("wall");
		grid[386].setBackground(Color.BLACK);
		grid[386].setName("wall");
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
		grid[392].setBackground(Color.BLACK);
		grid[392].setName("wall");
		grid[393].setBackground(Color.BLACK);
		grid[393].setName("wall");
		grid[394].setBackground(Color.BLACK);
		grid[394].setName("wall");
		grid[395].setBackground(Color.BLACK);
		grid[395].setName("wall");
		grid[396].setBackground(Color.BLACK);
		grid[396].setName("wall");
		grid[397].setBackground(Color.BLACK);
		grid[397].setName("wall");
		grid[398].setBackground(Color.BLACK);
		grid[398].setName("wall");
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
		grid[199].setBackground(Color.BLACK);
		grid[199].setName("wall");
		grid[179].setBackground(Color.BLACK);
		grid[179].setName("wall");
		grid[159].setBackground(Color.BLACK);
		grid[159].setName("wall");
		grid[139].setBackground(Color.BLACK);
		grid[139].setName("wall");
		grid[119].setBackground(Color.BLACK);
		grid[119].setName("wall");
		grid[99].setBackground(Color.BLACK);
		grid[99].setName("wall");
		grid[79].setBackground(Color.BLACK);
		grid[79].setName("wall");
		grid[59].setBackground(Color.BLACK);
		grid[59].setName("wall");
		grid[39].setBackground(Color.BLACK);
		grid[39].setName("wall");
		grid[19].setBackground(Color.BLACK);
		grid[19].setName("wall");
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
		grid[11].setBackground(Color.BLACK);
		grid[11].setName("wall");
		grid[10].setBackground(Color.BLACK);
		grid[10].setName("wall");
		grid[9].setBackground(Color.BLACK);
		grid[9].setName("wall");
		grid[8].setBackground(Color.BLACK);
		grid[8].setName("wall");
		grid[7].setBackground(Color.BLACK);
		grid[7].setName("wall");
		grid[6].setBackground(Color.BLACK);
		grid[6].setName("wall");
		grid[5].setBackground(Color.BLACK);
		grid[5].setName("wall");
		grid[4].setBackground(Color.BLACK);
		grid[4].setName("wall");
		grid[3].setBackground(Color.BLACK);
		grid[3].setName("wall");
		grid[2].setBackground(Color.BLACK);
		grid[2].setName("wall");
		grid[1].setBackground(Color.BLACK);
		grid[1].setName("wall");
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
		grid[140].setBackground(Color.BLACK);
		grid[140].setName("wall");
		grid[160].setBackground(Color.BLACK);
		grid[160].setName("wall");
		grid[180].setBackground(Color.BLACK);
		grid[180].setName("wall");
		grid[200].setBackground(Color.BLACK);
		grid[200].setName("wall");
		grid[220].setBackground(Color.BLACK);
		grid[220].setName("wall");
		grid[240].setBackground(Color.BLACK);
		grid[240].setName("wall");
		grid[260].setBackground(Color.BLACK);
		grid[260].setName("wall");
		grid[280].setBackground(Color.BLACK);
		grid[280].setName("wall");
		grid[300].setBackground(Color.BLACK);
		grid[300].setName("wall");
		grid[320].setBackground(Color.BLACK);
		grid[320].setName("wall");
		grid[341].setBackground(Color.BLACK);
		grid[341].setName("wall");
		grid[342].setBackground(Color.BLACK);
		grid[342].setName("wall");
		grid[343].setBackground(Color.BLACK);
		grid[343].setName("wall");
		grid[344].setBackground(Color.BLACK);
		grid[344].setName("wall");
		grid[345].setBackground(Color.BLACK);
		grid[345].setName("wall");
		grid[346].setBackground(Color.BLACK);
		grid[346].setName("wall");
		grid[347].setBackground(Color.BLACK);
		grid[347].setName("wall");
		grid[348].setBackground(Color.BLACK);
		grid[348].setName("wall");
		grid[349].setBackground(Color.BLACK);
		grid[349].setName("wall");
		grid[350].setBackground(Color.BLACK);
		grid[350].setName("wall");
		grid[351].setBackground(Color.BLACK);
		grid[351].setName("wall");
		grid[352].setBackground(Color.BLACK);
		grid[352].setName("wall");
		grid[353].setBackground(Color.BLACK);
		grid[353].setName("wall");
		grid[354].setBackground(Color.BLACK);
		grid[354].setName("wall");
		grid[355].setBackground(Color.BLACK);
		grid[355].setName("wall");
		grid[356].setBackground(Color.BLACK);
		grid[356].setName("wall");
		grid[357].setBackground(Color.BLACK);
		grid[357].setName("wall");
		grid[337].setBackground(Color.BLACK);
		grid[337].setName("wall");
		grid[298].setBackground(Color.BLACK);
		grid[298].setName("wall");
		grid[296].setBackground(Color.BLACK);
		grid[296].setName("wall");
		grid[297].setBackground(Color.BLACK);
		grid[297].setName("wall");
		grid[295].setBackground(Color.BLACK);
		grid[295].setName("wall");
		grid[315].setBackground(Color.BLACK);
		grid[315].setName("wall");
		grid[314].setBackground(Color.BLACK);
		grid[314].setName("wall");
		grid[313].setBackground(Color.BLACK);
		grid[313].setName("wall");
		grid[312].setBackground(Color.BLACK);
		grid[312].setName("wall");
		grid[312].setBackground(Color.WHITE);
		grid[312].setName("tile");
		grid[311].setBackground(Color.BLACK);
		grid[311].setName("wall");
		grid[312].setBackground(Color.BLACK);
		grid[312].setName("wall");
		grid[291].setBackground(Color.BLACK);
		grid[291].setName("wall");
		grid[309].setBackground(Color.BLACK);
		grid[309].setName("wall");
		grid[289].setBackground(Color.BLACK);
		grid[289].setName("wall");
		grid[269].setBackground(Color.BLACK);
		grid[269].setName("wall");
		grid[249].setBackground(Color.BLACK);
		grid[249].setName("wall");
		grid[292].setBackground(Color.BLACK);
		grid[292].setName("wall");
		grid[293].setBackground(Color.BLACK);
		grid[293].setName("wall");
		grid[294].setBackground(Color.BLACK);
		grid[294].setName("wall");
		grid[250].setBackground(Color.BLACK);
		grid[250].setName("wall");
		grid[251].setBackground(Color.BLACK);
		grid[251].setName("wall");
		grid[252].setBackground(Color.BLACK);
		grid[252].setName("wall");
		grid[253].setBackground(Color.BLACK);
		grid[253].setName("wall");
		grid[254].setBackground(Color.BLACK);
		grid[254].setName("wall");
		grid[255].setBackground(Color.BLACK);
		grid[255].setName("wall");
		grid[256].setBackground(Color.BLACK);
		grid[256].setName("wall");
		grid[257].setBackground(Color.BLACK);
		grid[257].setName("wall");
		grid[237].setBackground(Color.BLACK);
		grid[237].setName("wall");
		grid[217].setBackground(Color.BLACK);
		grid[217].setName("wall");
		grid[196].setBackground(Color.BLACK);
		grid[196].setName("wall");
		grid[196].setBackground(Color.WHITE);
		grid[196].setName("tile");
		grid[197].setBackground(Color.BLACK);
		grid[197].setName("wall");
		grid[177].setBackground(Color.BLACK);
		grid[177].setName("wall");
		grid[157].setBackground(Color.BLACK);
		grid[157].setName("wall");
		grid[137].setBackground(Color.BLACK);
		grid[137].setName("wall");
		grid[117].setBackground(Color.BLACK);
		grid[117].setName("wall");
		grid[97].setBackground(Color.BLACK);
		grid[97].setName("wall");
		grid[77].setBackground(Color.BLACK);
		grid[77].setName("wall");
		grid[57].setBackground(Color.BLACK);
		grid[57].setName("wall");
		grid[56].setBackground(Color.BLACK);
		grid[56].setName("wall");
		grid[55].setBackground(Color.BLACK);
		grid[55].setName("wall");
		grid[54].setBackground(Color.BLACK);
		grid[54].setName("wall");
		grid[53].setBackground(Color.BLACK);
		grid[53].setName("wall");
		grid[52].setBackground(Color.BLACK);
		grid[52].setName("wall");
		grid[51].setBackground(Color.BLACK);
		grid[51].setName("wall");
		grid[50].setBackground(Color.BLACK);
		grid[50].setName("wall");
		grid[49].setBackground(Color.BLACK);
		grid[49].setName("wall");
		grid[48].setBackground(Color.BLACK);
		grid[48].setName("wall");
		grid[47].setBackground(Color.BLACK);
		grid[47].setName("wall");
		grid[46].setBackground(Color.BLACK);
		grid[46].setName("wall");
		grid[45].setBackground(Color.BLACK);
		grid[45].setName("wall");
		grid[44].setBackground(Color.BLACK);
		grid[44].setName("wall");
		grid[43].setBackground(Color.BLACK);
		grid[43].setName("wall");
		grid[42].setBackground(Color.BLACK);
		grid[42].setName("wall");
		grid[62].setBackground(Color.BLACK);
		grid[62].setName("wall");
		grid[82].setBackground(Color.BLACK);
		grid[82].setName("wall");
		grid[102].setBackground(Color.BLACK);
		grid[102].setName("wall");
		grid[122].setBackground(Color.BLACK);
		grid[122].setName("wall");
		grid[142].setBackground(Color.BLACK);
		grid[142].setName("wall");
		grid[162].setBackground(Color.BLACK);
		grid[162].setName("wall");
		grid[182].setBackground(Color.BLACK);
		grid[182].setName("wall");
		grid[202].setBackground(Color.BLACK);
		grid[202].setName("wall");
		grid[222].setBackground(Color.BLACK);
		grid[222].setName("wall");
		grid[242].setBackground(Color.BLACK);
		grid[242].setName("wall");
		grid[262].setBackground(Color.BLACK);
		grid[262].setName("wall");
		grid[282].setBackground(Color.BLACK);
		grid[282].setName("wall");
		grid[302].setBackground(Color.BLACK);
		grid[302].setName("wall");
		grid[303].setBackground(Color.BLACK);
		grid[303].setName("wall");
		grid[304].setBackground(Color.BLACK);
		grid[304].setName("wall");
		grid[305].setBackground(Color.BLACK);
		grid[305].setName("wall");
		grid[306].setBackground(Color.BLACK);
		grid[306].setName("wall");
		grid[307].setBackground(Color.BLACK);
		grid[307].setName("wall");
		grid[287].setBackground(Color.BLACK);
		grid[287].setName("wall");
		grid[267].setBackground(Color.BLACK);
		grid[267].setName("wall");
		grid[247].setBackground(Color.BLACK);
		grid[247].setName("wall");
		grid[229].setBackground(Color.BLACK);
		grid[229].setName("wall");
		grid[209].setBackground(Color.BLACK);
		grid[209].setName("wall");
		grid[208].setBackground(Color.BLACK);
		grid[208].setName("wall");
		grid[207].setBackground(Color.BLACK);
		grid[207].setName("wall");
		grid[329].setBackground(Color.BLACK);
		grid[329].setName("wall");
		grid[206].setBackground(Color.BLACK);
		grid[206].setName("wall");
		grid[205].setBackground(Color.BLACK);
		grid[205].setName("wall");
		grid[225].setBackground(Color.BLACK);
		grid[225].setName("wall");
		grid[245].setBackground(Color.BLACK);
		grid[245].setName("wall");
		grid[265].setBackground(Color.BLACK);
		grid[265].setName("wall");
		grid[264].setBackground(Color.BLACK);
		grid[264].setName("wall");
		grid[244].setBackground(Color.BLACK);
		grid[244].setName("wall");
		grid[224].setBackground(Color.BLACK);
		grid[224].setName("wall");
		grid[224].setBackground(Color.WHITE);
		grid[224].setName("tile");
		grid[204].setBackground(Color.BLACK);
		grid[204].setName("wall");
		grid[224].setBackground(Color.BLACK);
		grid[224].setName("wall");
		grid[163].setBackground(Color.BLACK);
		grid[163].setName("wall");
		grid[164].setBackground(Color.BLACK);
		grid[164].setName("wall");
		grid[166].setBackground(Color.BLACK);
		grid[166].setName("wall");
		grid[165].setBackground(Color.BLACK);
		grid[165].setName("wall");
		grid[167].setBackground(Color.BLACK);
		grid[167].setName("wall");
		grid[168].setBackground(Color.BLACK);
		grid[168].setName("wall");
		grid[169].setBackground(Color.BLACK);
		grid[169].setName("wall");
		grid[170].setBackground(Color.BLACK);
		grid[170].setName("wall");
		grid[171].setBackground(Color.BLACK);
		grid[171].setName("wall");
		grid[191].setBackground(Color.BLACK);
		grid[191].setName("wall");
		grid[211].setBackground(Color.BLACK);
		grid[211].setName("wall");
		grid[212].setBackground(Color.BLACK);
		grid[212].setName("wall");
		grid[213].setBackground(Color.BLACK);
		grid[213].setName("wall");
		grid[214].setBackground(Color.BLACK);
		grid[214].setName("wall");
		grid[215].setBackground(Color.BLACK);
		grid[215].setName("wall");
		grid[195].setBackground(Color.BLACK);
		grid[195].setName("wall");
		grid[175].setBackground(Color.BLACK);
		grid[175].setName("wall");
		grid[155].setBackground(Color.BLACK);
		grid[155].setName("wall");
		grid[135].setBackground(Color.BLACK);
		grid[135].setName("wall");
		grid[115].setBackground(Color.BLACK);
		grid[115].setName("wall");
		grid[95].setBackground(Color.BLACK);
		grid[95].setName("wall");
		grid[94].setBackground(Color.BLACK);
		grid[94].setName("wall");
		grid[93].setBackground(Color.BLACK);
		grid[93].setName("wall");
		grid[92].setBackground(Color.BLACK);
		grid[92].setName("wall");
		grid[91].setBackground(Color.BLACK);
		grid[91].setName("wall");
		grid[90].setBackground(Color.BLACK);
		grid[90].setName("wall");
		grid[89].setBackground(Color.BLACK);
		grid[89].setName("wall");
		grid[88].setBackground(Color.BLACK);
		grid[88].setName("wall");
		grid[87].setBackground(Color.BLACK);
		grid[87].setName("wall");
		grid[86].setBackground(Color.BLACK);
		grid[86].setName("wall");
		grid[85].setBackground(Color.BLACK);
		grid[85].setName("wall");
		grid[84].setBackground(Color.BLACK);
		grid[84].setName("wall");
		grid[104].setBackground(Color.BLACK);
		grid[104].setName("wall");
		grid[124].setBackground(Color.BLACK);
		grid[124].setName("wall");
		grid[125].setBackground(Color.BLACK);
		grid[125].setName("wall");
		grid[126].setBackground(Color.BLACK);
		grid[126].setName("wall");
		grid[127].setBackground(Color.BLACK);
		grid[127].setName("wall");
		grid[128].setBackground(Color.BLACK);
		grid[128].setName("wall");
		grid[129].setBackground(Color.BLACK);
		grid[129].setName("wall");
		grid[130].setBackground(Color.BLACK);
		grid[130].setName("wall");
		grid[131].setBackground(Color.BLACK);
		grid[131].setName("wall");
		grid[132].setBackground(Color.BLACK);
		grid[132].setName("wall");
		grid[152].setBackground(Color.BLACK);
		grid[152].setName("wall");
		grid[152].setBackground(Color.WHITE);
		grid[152].setName("tile");
		grid[133].setBackground(Color.BLACK);
		grid[133].setName("wall");
		grid[153].setBackground(Color.BLACK);
		grid[153].setName("wall");
		grid[173].setBackground(Color.BLACK);
		grid[173].setName("wall");

	}

	public void preset2() {
		grid[0].setBackground(Color.BLACK);
		grid[0].setName("wall");
		grid[1].setBackground(Color.BLACK);
		grid[1].setName("wall");
		grid[2].setBackground(Color.BLACK);
		grid[2].setName("wall");
		grid[3].setBackground(Color.BLACK);
		grid[3].setName("wall");
		grid[5].setBackground(Color.BLACK);
		grid[5].setName("wall");
		grid[4].setBackground(Color.BLACK);
		grid[4].setName("wall");
		grid[6].setBackground(Color.BLACK);
		grid[6].setName("wall");
		grid[8].setBackground(Color.BLACK);
		grid[8].setName("wall");
		grid[7].setBackground(Color.BLACK);
		grid[7].setName("wall");
		grid[9].setBackground(Color.BLACK);
		grid[9].setName("wall");
		grid[10].setBackground(Color.BLACK);
		grid[10].setName("wall");
		grid[12].setBackground(Color.BLACK);
		grid[12].setName("wall");
		grid[11].setBackground(Color.BLACK);
		grid[11].setName("wall");
		grid[13].setBackground(Color.BLACK);
		grid[13].setName("wall");
		grid[14].setBackground(Color.BLACK);
		grid[14].setName("wall");
		grid[15].setBackground(Color.BLACK);
		grid[15].setName("wall");
		grid[16].setBackground(Color.BLACK);
		grid[16].setName("wall");
		grid[17].setBackground(Color.BLACK);
		grid[17].setName("wall");
		grid[18].setBackground(Color.BLACK);
		grid[18].setName("wall");
		grid[19].setBackground(Color.BLACK);
		grid[19].setName("wall");
		grid[39].setBackground(Color.BLACK);
		grid[39].setName("wall");
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
		grid[219].setBackground(Color.BLACK);
		grid[219].setName("wall");
		grid[239].setBackground(Color.BLACK);
		grid[239].setName("wall");
		grid[259].setBackground(Color.BLACK);
		grid[259].setName("wall");
		grid[279].setBackground(Color.BLACK);
		grid[279].setName("wall");
		grid[299].setBackground(Color.BLACK);
		grid[299].setName("wall");
		grid[319].setBackground(Color.BLACK);
		grid[319].setName("wall");
		grid[339].setBackground(Color.BLACK);
		grid[339].setName("wall");
		grid[359].setBackground(Color.BLACK);
		grid[359].setName("wall");
		grid[379].setBackground(Color.BLACK);
		grid[379].setName("wall");
		grid[399].setBackground(Color.BLACK);
		grid[399].setName("wall");
		grid[398].setBackground(Color.BLACK);
		grid[398].setName("wall");
		grid[397].setBackground(Color.BLACK);
		grid[397].setName("wall");
		grid[396].setBackground(Color.BLACK);
		grid[396].setName("wall");
		grid[395].setBackground(Color.BLACK);
		grid[395].setName("wall");
		grid[394].setBackground(Color.BLACK);
		grid[394].setName("wall");
		grid[393].setBackground(Color.BLACK);
		grid[393].setName("wall");
		grid[392].setBackground(Color.BLACK);
		grid[392].setName("wall");
		grid[391].setBackground(Color.BLACK);
		grid[391].setName("wall");
		grid[390].setBackground(Color.BLACK);
		grid[390].setName("wall");
		grid[389].setBackground(Color.BLACK);
		grid[389].setName("wall");
		grid[388].setBackground(Color.BLACK);
		grid[388].setName("wall");
		grid[387].setBackground(Color.BLACK);
		grid[387].setName("wall");
		grid[386].setBackground(Color.BLACK);
		grid[386].setName("wall");
		grid[385].setBackground(Color.BLACK);
		grid[385].setName("wall");
		grid[384].setBackground(Color.BLACK);
		grid[384].setName("wall");
		grid[383].setBackground(Color.BLACK);
		grid[383].setName("wall");
		grid[382].setBackground(Color.BLACK);
		grid[382].setName("wall");
		grid[381].setBackground(Color.BLACK);
		grid[381].setName("wall");
		grid[380].setBackground(Color.BLACK);
		grid[380].setName("wall");
		grid[360].setBackground(Color.BLACK);
		grid[360].setName("wall");
		grid[340].setBackground(Color.BLACK);
		grid[340].setName("wall");
		grid[320].setBackground(Color.BLACK);
		grid[320].setName("wall");
		grid[300].setBackground(Color.BLACK);
		grid[300].setName("wall");
		grid[280].setBackground(Color.BLACK);
		grid[280].setName("wall");
		grid[260].setBackground(Color.BLACK);
		grid[260].setName("wall");
		grid[240].setBackground(Color.BLACK);
		grid[240].setName("wall");
		grid[220].setBackground(Color.BLACK);
		grid[220].setName("wall");
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
		grid[20].setBackground(Color.BLACK);
		grid[20].setName("wall");
		grid[20].setBackground(Color.WHITE);
		grid[20].setName("tile");
		grid[40].setBackground(Color.BLACK);
		grid[40].setName("wall");
		grid[20].setBackground(Color.BLACK);
		grid[20].setName("wall");
		grid[22].setBackground(Color.BLACK);
		grid[22].setName("wall");
		grid[42].setBackground(Color.BLACK);
		grid[42].setName("wall");
		grid[62].setBackground(Color.BLACK);
		grid[62].setName("wall");
		grid[82].setBackground(Color.BLACK);
		grid[82].setName("wall");
		grid[102].setBackground(Color.BLACK);
		grid[102].setName("wall");
		grid[122].setBackground(Color.BLACK);
		grid[122].setName("wall");
		grid[142].setBackground(Color.BLACK);
		grid[142].setName("wall");
		grid[162].setBackground(Color.BLACK);
		grid[162].setName("wall");
		grid[182].setBackground(Color.BLACK);
		grid[182].setName("wall");
		grid[202].setBackground(Color.BLACK);
		grid[202].setName("wall");
		grid[222].setBackground(Color.BLACK);
		grid[222].setName("wall");
		grid[242].setBackground(Color.BLACK);
		grid[242].setName("wall");
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
		grid[343].setBackground(Color.BLACK);
		grid[343].setName("wall");
		grid[344].setBackground(Color.BLACK);
		grid[344].setName("wall");
		grid[345].setBackground(Color.BLACK);
		grid[345].setName("wall");
		grid[346].setBackground(Color.BLACK);
		grid[346].setName("wall");
		grid[347].setBackground(Color.BLACK);
		grid[347].setName("wall");
		grid[348].setBackground(Color.BLACK);
		grid[348].setName("wall");
		grid[349].setBackground(Color.BLACK);
		grid[349].setName("wall");
		grid[351].setBackground(Color.BLACK);
		grid[351].setName("wall");
		grid[350].setBackground(Color.BLACK);
		grid[350].setName("wall");
		grid[352].setBackground(Color.BLACK);
		grid[352].setName("wall");
		grid[353].setBackground(Color.BLACK);
		grid[353].setName("wall");
		grid[354].setBackground(Color.BLACK);
		grid[354].setName("wall");
		grid[355].setBackground(Color.BLACK);
		grid[355].setName("wall");
		grid[356].setBackground(Color.BLACK);
		grid[356].setName("wall");
		grid[357].setBackground(Color.BLACK);
		grid[357].setName("wall");
		grid[337].setBackground(Color.BLACK);
		grid[337].setName("wall");
		grid[317].setBackground(Color.BLACK);
		grid[317].setName("wall");
		grid[297].setBackground(Color.BLACK);
		grid[297].setName("wall");
		grid[277].setBackground(Color.BLACK);
		grid[277].setName("wall");
		grid[257].setBackground(Color.BLACK);
		grid[257].setName("wall");
		grid[237].setBackground(Color.BLACK);
		grid[237].setName("wall");
		grid[217].setBackground(Color.BLACK);
		grid[217].setName("wall");
		grid[197].setBackground(Color.BLACK);
		grid[197].setName("wall");
		grid[177].setBackground(Color.BLACK);
		grid[177].setName("wall");
		grid[157].setBackground(Color.BLACK);
		grid[157].setName("wall");
		grid[137].setBackground(Color.BLACK);
		grid[137].setName("wall");
		grid[117].setBackground(Color.BLACK);
		grid[117].setName("wall");
		grid[97].setBackground(Color.BLACK);
		grid[97].setName("wall");
		grid[77].setBackground(Color.BLACK);
		grid[77].setName("wall");
		grid[57].setBackground(Color.BLACK);
		grid[57].setName("wall");
		grid[56].setBackground(Color.BLACK);
		grid[56].setName("wall");
		grid[55].setBackground(Color.BLACK);
		grid[55].setName("wall");
		grid[54].setBackground(Color.BLACK);
		grid[54].setName("wall");
		grid[53].setBackground(Color.BLACK);
		grid[53].setName("wall");
		grid[52].setBackground(Color.BLACK);
		grid[52].setName("wall");
		grid[51].setBackground(Color.BLACK);
		grid[51].setName("wall");
		grid[51].setBackground(Color.WHITE);
		grid[51].setName("tile");
		grid[51].setBackground(Color.BLACK);
		grid[51].setName("wall");
		grid[50].setBackground(Color.BLACK);
		grid[50].setName("wall");
		grid[49].setBackground(Color.BLACK);
		grid[49].setName("wall");
		grid[48].setBackground(Color.BLACK);
		grid[48].setName("wall");
		grid[47].setBackground(Color.BLACK);
		grid[47].setName("wall");
		grid[46].setBackground(Color.BLACK);
		grid[46].setName("wall");
		grid[45].setBackground(Color.BLACK);
		grid[45].setName("wall");
		grid[44].setBackground(Color.BLACK);
		grid[44].setName("wall");
		grid[64].setBackground(Color.BLACK);
		grid[64].setName("wall");
		grid[84].setBackground(Color.BLACK);
		grid[84].setName("wall");
		grid[104].setBackground(Color.BLACK);
		grid[104].setName("wall");
		grid[124].setBackground(Color.BLACK);
		grid[124].setName("wall");
		grid[144].setBackground(Color.BLACK);
		grid[144].setName("wall");
		grid[164].setBackground(Color.BLACK);
		grid[164].setName("wall");
		grid[184].setBackground(Color.BLACK);
		grid[184].setName("wall");
		grid[204].setBackground(Color.BLACK);
		grid[204].setName("wall");
		grid[224].setBackground(Color.BLACK);
		grid[224].setName("wall");
		grid[244].setBackground(Color.BLACK);
		grid[244].setName("wall");
		grid[264].setBackground(Color.BLACK);
		grid[264].setName("wall");
		grid[284].setBackground(Color.BLACK);
		grid[284].setName("wall");
		grid[304].setBackground(Color.BLACK);
		grid[304].setName("wall");
		grid[305].setBackground(Color.BLACK);
		grid[305].setName("wall");
		grid[307].setBackground(Color.BLACK);
		grid[307].setName("wall");
		grid[306].setBackground(Color.BLACK);
		grid[306].setName("wall");
		grid[308].setBackground(Color.BLACK);
		grid[308].setName("wall");
		grid[309].setBackground(Color.BLACK);
		grid[309].setName("wall");
		grid[310].setBackground(Color.BLACK);
		grid[310].setName("wall");
		grid[311].setBackground(Color.BLACK);
		grid[311].setName("wall");
		grid[312].setBackground(Color.BLACK);
		grid[312].setName("wall");
		grid[313].setBackground(Color.BLACK);
		grid[313].setName("wall");
		grid[314].setBackground(Color.BLACK);
		grid[314].setName("wall");
		grid[315].setBackground(Color.BLACK);
		grid[315].setName("wall");
		grid[295].setBackground(Color.BLACK);
		grid[295].setName("wall");
		grid[275].setBackground(Color.BLACK);
		grid[275].setName("wall");
		grid[255].setBackground(Color.BLACK);
		grid[255].setName("wall");
		grid[235].setBackground(Color.BLACK);
		grid[235].setName("wall");
		grid[235].setBackground(Color.WHITE);
		grid[235].setName("tile");
		grid[215].setBackground(Color.BLACK);
		grid[215].setName("wall");
		grid[235].setBackground(Color.BLACK);
		grid[235].setName("wall");
		grid[195].setBackground(Color.BLACK);
		grid[195].setName("wall");
		grid[175].setBackground(Color.BLACK);
		grid[175].setName("wall");
		grid[155].setBackground(Color.BLACK);
		grid[155].setName("wall");
		grid[135].setBackground(Color.BLACK);
		grid[135].setName("wall");
		grid[115].setBackground(Color.BLACK);
		grid[115].setName("wall");
		grid[95].setBackground(Color.BLACK);
		grid[95].setName("wall");
		grid[93].setBackground(Color.BLACK);
		grid[93].setName("wall");
		grid[94].setBackground(Color.BLACK);
		grid[94].setName("wall");
		grid[92].setBackground(Color.BLACK);
		grid[92].setName("wall");
		grid[90].setBackground(Color.BLACK);
		grid[90].setName("wall");
		grid[91].setBackground(Color.BLACK);
		grid[91].setName("wall");
		grid[89].setBackground(Color.BLACK);
		grid[89].setName("wall");
		grid[88].setBackground(Color.BLACK);
		grid[88].setName("wall");
		grid[87].setBackground(Color.BLACK);
		grid[87].setName("wall");
		grid[86].setBackground(Color.BLACK);
		grid[86].setName("wall");
		grid[126].setBackground(Color.BLACK);
		grid[126].setName("wall");
		grid[106].setBackground(Color.BLACK);
		grid[106].setName("wall");
		grid[146].setBackground(Color.BLACK);
		grid[146].setName("wall");
		grid[166].setBackground(Color.BLACK);
		grid[166].setName("wall");
		grid[186].setBackground(Color.BLACK);
		grid[186].setName("wall");
		grid[206].setBackground(Color.BLACK);
		grid[206].setName("wall");
		grid[226].setBackground(Color.BLACK);
		grid[226].setName("wall");
		grid[246].setBackground(Color.BLACK);
		grid[246].setName("wall");
		grid[266].setBackground(Color.BLACK);
		grid[266].setName("wall");
		grid[267].setBackground(Color.BLACK);
		grid[267].setName("wall");
		grid[268].setBackground(Color.BLACK);
		grid[268].setName("wall");
		grid[269].setBackground(Color.BLACK);
		grid[269].setName("wall");
		grid[270].setBackground(Color.BLACK);
		grid[270].setName("wall");
		grid[271].setBackground(Color.BLACK);
		grid[271].setName("wall");
		grid[272].setBackground(Color.BLACK);
		grid[272].setName("wall");
		grid[273].setBackground(Color.BLACK);
		grid[273].setName("wall");
		grid[253].setBackground(Color.BLACK);
		grid[253].setName("wall");
		grid[233].setBackground(Color.BLACK);
		grid[233].setName("wall");
		grid[213].setBackground(Color.BLACK);
		grid[213].setName("wall");
		grid[193].setBackground(Color.BLACK);
		grid[193].setName("wall");
		grid[173].setBackground(Color.BLACK);
		grid[173].setName("wall");
		grid[153].setBackground(Color.BLACK);
		grid[153].setName("wall");
		grid[133].setBackground(Color.BLACK);
		grid[133].setName("wall");
		grid[132].setBackground(Color.BLACK);
		grid[132].setName("wall");
		grid[131].setBackground(Color.BLACK);
		grid[131].setName("wall");
		grid[129].setBackground(Color.BLACK);
		grid[129].setName("wall");
		grid[130].setBackground(Color.BLACK);
		grid[130].setName("wall");
		grid[128].setBackground(Color.BLACK);
		grid[128].setName("wall");
		grid[148].setBackground(Color.BLACK);
		grid[148].setName("wall");
		grid[168].setBackground(Color.BLACK);
		grid[168].setName("wall");
		grid[188].setBackground(Color.BLACK);
		grid[188].setName("wall");
		grid[208].setBackground(Color.BLACK);
		grid[208].setName("wall");
		grid[228].setBackground(Color.BLACK);
		grid[228].setName("wall");
		grid[229].setBackground(Color.BLACK);
		grid[229].setName("wall");
		grid[230].setBackground(Color.BLACK);
		grid[230].setName("wall");
		grid[230].setBackground(Color.WHITE);
		grid[230].setName("tile");
		grid[230].setBackground(Color.BLACK);
		grid[230].setName("wall");
		grid[231].setBackground(Color.BLACK);
		grid[231].setName("wall");
		grid[232].setBackground(Color.BLACK);
		grid[232].setName("wall");
		grid[212].setBackground(Color.BLACK);
		grid[212].setName("wall");
		grid[232].setBackground(Color.WHITE);
		grid[232].setName("tile");
		grid[212].setBackground(Color.WHITE);
		grid[212].setName("tile");
		grid[211].setBackground(Color.BLACK);
		grid[211].setName("wall");
		grid[191].setBackground(Color.BLACK);
		grid[191].setName("wall");
		grid[171].setBackground(Color.BLACK);
		grid[171].setName("wall");
		grid[170].setBackground(Color.BLACK);
		grid[170].setName("wall");
		grid[190].setBackground(Color.BLACK);
		grid[190].setName("wall");

	}

	public void moveMouse() {
		int rand;
		
		
		try {
			if(mousePlaced) {
				if(grid[mousePos+1].getName() == "tile" && grid[mousePos+1].getBackground() != Color.gray) {
					grid[mousePos].setBackground(Color.WHITE);
					grid[mousePos].setName("tile");
					grid[mousePos+1].setBackground(Color.ORANGE);
					grid[mousePos+1].setName("mouse");
					grid[mousePos].setBackground(Color.gray);
					mousePos = mousePos+m.right();
				}else if(grid[mousePos-1].getName() == "tile" && grid[mousePos-1].getBackground() != Color.gray) {
					grid[mousePos].setBackground(Color.WHITE);
					grid[mousePos].setName("tile");
					grid[mousePos+m.left()].setBackground(Color.ORANGE);
					grid[mousePos+m.left()].setName("mouse");
					grid[mousePos].setBackground(Color.gray);
					mousePos = mousePos+m.left();
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
				
				
				
				
				if(grid[mousePos+1].getName() == "tile" && grid[mousePos+1].getBackground() != Color.gray && grid[mousePos+20].getName() == "tile" && grid[mousePos+20].getBackground() != Color.gray&& grid[mousePos-20].getName() == "tile" && grid[mousePos-20].getBackground() != Color.gray) {
					lastLoc = mousePos;
					rand = r.nextInt(4);
					System.out.println(rand);
					if(rand == 1) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+1].setBackground(Color.ORANGE);
						grid[mousePos+1].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.right();
					}else if(rand == 0) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.down()].setBackground(Color.ORANGE);
						grid[mousePos+m.down()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.down();
					}else if(rand==2) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.up()].setBackground(Color.ORANGE);
						grid[mousePos+m.up()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.up();
					}

					
				}else if(grid[mousePos+1].getName() == "tile" && grid[mousePos+1].getBackground() != Color.gray && grid[mousePos-20].getName() == "tile" && grid[mousePos-20].getBackground() != Color.gray) {
					lastLoc = mousePos;
					rand = r.nextInt(2);
					System.out.println(rand);
					if(rand == 1) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+1].setBackground(Color.ORANGE);
						grid[mousePos+1].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.right();
					}else if(rand == 0) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.up()].setBackground(Color.ORANGE);
						grid[mousePos+m.up()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.up();
					}
				}else if(grid[mousePos+1].getName() == "tile" && grid[mousePos+1].getBackground() != Color.gray && grid[mousePos+20].getName() == "tile" && grid[mousePos+20].getBackground() != Color.gray) {
					lastLoc = mousePos;
					rand = r.nextInt(2);
					System.out.println(rand);
					if(rand == 1) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+1].setBackground(Color.ORANGE);
						grid[mousePos+1].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.right();
					}else if(rand == 0) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.down()].setBackground(Color.ORANGE);
						grid[mousePos+m.down()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.down();
					}
				}else if(grid[mousePos+1].getName() == "tile" && grid[mousePos+1].getBackground() != Color.gray && grid[mousePos-1].getName() == "tile" && grid[mousePos-1].getBackground() != Color.gray) {
					lastLoc = mousePos;
					rand = r.nextInt(2);
					System.out.println(rand);
					if(rand == 1) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+1].setBackground(Color.ORANGE);
						grid[mousePos+1].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.right();
					}else if(rand == 0) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.left()].setBackground(Color.ORANGE);
						grid[mousePos+m.left()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.left();
					}
				}
				if(grid[mousePos-1].getName() == "tile" && grid[mousePos-1].getBackground() != Color.gray && grid[mousePos+20].getName() == "tile" && grid[mousePos+20].getBackground() != Color.gray&& grid[mousePos-20].getName() == "tile" && grid[mousePos-20].getBackground() != Color.gray) {
					lastLoc = mousePos;
					rand = r.nextInt(3);
					System.out.println(rand);
					if(rand == 1) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos-1].setBackground(Color.ORANGE);
						grid[mousePos-1].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.left();
					}else if(rand == 0) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.down()].setBackground(Color.ORANGE);
						grid[mousePos+m.down()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.down();
					}else if(rand==2) {
						grid[mousePos].setBackground(Color.WHITE);
						grid[mousePos].setName("tile");
						grid[mousePos+m.up()].setBackground(Color.ORANGE);
						grid[mousePos+m.up()].setName("mouse");
						grid[mousePos].setBackground(Color.gray);
						mousePos = mousePos+m.up();
					}
				}
				
				if(grid[mousePos-20].getBackground() == Color.BLACK && grid[mousePos-1].getBackground() == Color.BLACK && grid[mousePos+1].getBackground() == Color.BLACK) {
					grid[mousePos].setBackground(Color.gray);
					grid[lastLoc].setBackground(Color.orange);
					mousePos = lastLoc;
					grid[lastLoc].setBackground(Color.white);
				}
				
				
				//System.out.println(lastPos);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.out.println("Meep Moop");
		}
	}

}
