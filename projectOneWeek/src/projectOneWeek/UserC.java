package projectOneWeek;
import java.awt.event.KeyAdapter;              
import java.awt.event.KeyEvent;     
public class UserC extends Board {
	Board user;
	
	public UserC (Board user) {
		this.user=user;
	}
	public void keyPressed(KeyEvent e) {
		
		user.keyPressed(e);
	}
	public void keyReleased(KeyEvent e) {
		user.keyReleased(e);
	}
	
}
