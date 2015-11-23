import java.awt.Color;
import java.awt.Graphics;

public class Dots extends BoardElements{

	public Dots(Point position, Color color) {
		super("dot", position, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	void paintComponent(Graphics g) {
		g.setColor(color);
		g.fillRect(position.getX() + 10, position.getY()+10, 3, 3);
		
	}

	@Override
	void updatePosition() {
		// TODO Auto-generated method stub
		
	}

}
