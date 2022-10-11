package projectOneWeek;

public class Mouse {

	public int x = 1;

	public Mouse() {



	}

	
	public int up() {
		x=-20;
		return x;
	}
	
	public int down() {
		x=20;
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
	public int stop() {
		x=0;
		return x;
	}
	
	
	
}


