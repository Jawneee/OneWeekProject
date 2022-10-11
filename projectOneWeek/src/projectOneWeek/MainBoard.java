package projectOneWeek;

import java.util.Timer;
import java.util.TimerTask;

public class MainBoard {

	public static void main(String[] args) {
		
		Board b = new Board();
		int speed = 1000;
		
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int num;
			@Override
			public void run() {
				num++;
				
				b.moveMouse();
				
				if(num<0) {
					timer.cancel(); //cancel timer, will change num to finish once created so timer stops after mouse finishes maze
				}
				
				
			}
			
		};
		
		
		timer.schedule(task, 0 , 35);
		
		
	}


}

