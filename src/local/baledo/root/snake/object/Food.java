package local.baledo.root.snake.object;

import java.awt.Color;
import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

import local.baledo.root.snake.view.MainWindow;

public class Food implements Runnable{

	int posx;
	int posy;
	private boolean eaten;
	
	public Food(){
		eaten = false;
		appear();
	}
	
	public int getPosx() {
		return posx;
	}
	public void setPosx(int posx) {
		this.posx = posx;
	}
	public int getPosy() {
		return posy;
	}
	public void setPosy(int posy) {
		this.posy = posy;
	}
	public void appear(){
		posx = ThreadLocalRandom.current().nextInt(0, MainWindow.WIDTH);
		posy = ThreadLocalRandom.current().nextInt(0, MainWindow.HEIGHT);
	}
	
	public void paintFood(Graphics g){
		g.setColor(Color.blue);
		
		g.fillOval(posx, posy, 20, 20);
	}
	@Override
	public void run() {
		while(true){
			if(eaten){
				appear();
			}
		}
	}
}
