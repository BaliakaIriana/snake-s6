package local.baledo.root.snake.view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import local.baledo.root.snake.object.Food;
import local.baledo.root.snake.object.Snake;

public class MainPanel extends JPanel implements Runnable{

	
	Snake snake;
	Food food;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MainPanel(int width,int height){
		this.setBackground(Color.white);
		snake = new Snake(width/2-10,height/2-10);
		food = new Food();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		snake.paintSnake(g);
		food.paintFood(g);
	}

	@Override
	public void run() {
		new Thread(snake).start();
		new Thread(food).start();
		while(true){
			
			this.repaint();
		}
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}
	
	
	
	
}
