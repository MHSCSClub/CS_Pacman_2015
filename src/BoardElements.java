import java.awt.Color;
import java.awt.Graphics;



public abstract class BoardElements{
	protected String name;
	protected Point position;
	protected Color color;
	
	public BoardElements(String name, int x, int y, Color color){
		this.name = name;
		this.position = new Point(x, y);
		this.color = color;
	}
	public BoardElements(String name, Point position, Color color){
		this.name = name;
		this.position = position;
		this.color = color;
	}
	
	//Displays the Element 
	abstract void paintComponent(Graphics g);
	public void changeColor(Color color){
		this.color = color;
	}
	public void changePosition(int x, int y){
		position.setX(x);
		position.setY(y);
	}
	abstract void updatePosition();
}
