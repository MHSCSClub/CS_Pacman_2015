import java.awt.Color;
import java.awt.Graphics;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman extends BoardElements implements KeyEventDispatcher{
	private int radius;
	private int key;
	private static int speed = 1;
	
	public Pacman(int x, int y,int radius, Color color) {
		super("Pacman", x, y, color);
		this.radius = radius;
		this.key = 0;
		
	}
	
	@Override
	void updatePosition() {
		if (key == 40){
			this.y = (this.y + speed) % 640;
		}else if(key == 38){
			this.y = Math.abs((this.y - speed) % 640);
		}else if(key == 37){
			this.x =Math.abs((this.x - speed) % 640);
		}else if(key == 39){
			this.x = (this.x + speed) % 640;
		}
			
	}
	
	@Override
	void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, radius, radius);
		
	}
	
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		 if (e.getID() == KeyEvent.KEY_PRESSED) {
             this.key = e.getKeyCode();
         }
         return false;
	}
	
	
}
