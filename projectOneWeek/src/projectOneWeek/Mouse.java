package projectOneWeek;

public class Mouse {

	private int x = 1;


	Mouse(int xNum) {

		xNum = x;

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

