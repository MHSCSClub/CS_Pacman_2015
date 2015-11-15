import java.awt.*;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Board extends JPanel{ 
	private int board [][];
	private BoardElements elements[][];
	private Color background;
	KeyboardFocusManager manager;
	
	public Board(int board [][], Color background){
		elements = new BoardElements[32][32];
		this.board = board;
		this.background = background;
		manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		
		setUp();
	}
	public void setUp(){
		for(int i = 0; i<board.length; i++){
			for(int z = 0; z<board[i].length; z++){
				if(board[z][i] == 1){
					elements[z][i] = new Wall(i*20, z*20, Color.BLUE, 20);
				}
				else if(board[z][i] == 3){
					elements[z][i] = new Pacman(i*20, z*20, 15, Color.YELLOW);
					manager.addKeyEventDispatcher((Pacman) elements[z][i]);
				}
				else{
					elements[z][i] = new Wall(i*0, z*0, Color.BLUE, 0);
				}
			}
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		g.setColor(this.background);
		g.fillRect(0, 0, 640,660);
		for(int i = 0; i<board.length; i++){
			for(int z = 0; z<board[i].length; z++){
				elements[i][z].paintComponent(g);
			}
		}
	}
	public void updatePositions() {
		for(int i = 0; i<board.length; i++){
			for(int z = 0; z<board[i].length; z++){
				elements[i][z].updatePosition();
			}
		}
		
	}
	
	
	
}
