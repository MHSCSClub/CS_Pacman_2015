import java.awt.Color;
import java.awt.Graphics;
import java.awt.KeyEventDispatcher;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pacman extends BoardElements implements KeyEventDispatcher{
	private int radius;
	private int key;
	private static int speed = 1;
	
	public Pacman(Point position,int radius, Color color) {
		super("Pacman", position, color);
		this.radius = radius;
		this.key = 0;
		
	}
	public Pacman(int x, int y,int radius, Color color) {
		super("Pacman", x, y, color);
		this.radius = radius;
		this.key = 0;
		
	}
	
	//updates position and make sure that it wraps to other side of page
	@Override
	public void updatePosition() {
		if (key == 40){
			position.setY((position.getY() + speed) % 640);  
		}else if(key == 38){
			position.setY(((position.getY() - speed) % 640 > (-1 * radius))? (position.getY() - speed) % 640: 640);  
		}else if(key == 37){
			position.setX(((position.getX() - speed) % 640 > (-1 * radius))? (position.getX() - speed) % 640: 640);
		}else if(key == 39){
			position.setX((position.getX() + speed) % 640);
		}
			
	}
	
	
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillOval(position.getX(), position.getY(), radius, radius);
		
	}
	
	@Override
	public boolean dispatchKeyEvent(KeyEvent e) {
		 if (e.getID() == KeyEvent.KEY_PRESSED) {
             this.key = e.getKeyCode();
         }
         return false;
	}
	
	
}
