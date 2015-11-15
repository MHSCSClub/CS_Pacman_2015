import java.awt.Color;
import java.awt.Graphics;

public class Wall extends BoardElements {
	private int size;
	public Wall(int x, int y, Color color, int size) {
		super("Wall", x, y, color);
		this.size = size;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(this.color);
		g.drawRect(x, y, size, size);
	}

	@Override
	public void updatePosition() {
		// TODO Auto-generated method stub
	}

}
