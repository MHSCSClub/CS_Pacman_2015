import java.awt.Color;
import java.awt.Graphics;



public abstract class BoardElements{
	protected String name;
	protected int x;
	protected int y;
	protected Color color;
	
	public BoardElements(String name, int x, int y, Color color){
		this.name = name;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	//Displays the Element 
	abstract void paintComponent(Graphics g);
	public void changeColor(Color color){
		this.color = color;
	}
	public void changePosition(int x, int y){
		this.x = x;
		this.y = y;
	}
	abstract void updatePosition();
}
