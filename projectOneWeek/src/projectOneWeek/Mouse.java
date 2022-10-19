package projectOneWeek;
/*
 * mark john jordan chris
 */
public class Mouse {

	public int x = 1;

	public Mouse() {



	}

	/**
	 * returns int up
	 * @return
	 */
	public int up() {
		x=-20;
		return x;
	}
	/**
	 * returns mouse down
	 * @return
	 */
	public int down() {
		x=20;
		return x;
	}
	/**
	 * returns mouse right
	 * @return
	 */
	public int right() {
		x=1;
		return x;
	}
	/**
	 * returns mouse left
	 * @return
	 */
	public int left() {
		x=-1;
		return x;
	}
	/**
	 * returns the 
	 * @return
	 */
	public int stop() {
		x=0;
		return x;
	}
	
	
	
}


