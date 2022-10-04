package projectOneWeek;

import java.util.Random;

public class Mouse {

	private int x = 1;
	private int[] mouse = new int[10];

	Mouse(int xNum) {

		xNum = x;

		for (int i = 0; i < mouse.length; i++) {
			mouse[i]=0;
			
			
			
		}


	}
	

	public int up() {
		x=-19;
		return x;
	}
	
	public int down() {
		x=19;
		return x;
	}
	
	public int right() {
		x=1;
		return x;
	}
	public int left() {
		x=-1;
		return x;
	}
	
}

