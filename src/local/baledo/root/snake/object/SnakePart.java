package local.baledo.root.snake.object;

import java.awt.Color;
import java.awt.Graphics;

public class SnakePart{
	int posx = -1;
	int posy = -1;
	boolean head = false;
	/**
	 * @param posx
	 * @param posy
	 * @param dx
	 * @param dy
	 */
	public SnakePart() {
		
	}
	public void paintSnakePart(Graphics g){
		if(head) g.setColor(Color.red);
		else g.setColor(Color.green);
		g.fillOval(posx, posy, 20, 20);
	}
	public void isHead(){
		head = !head;
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
	@Override
	public String toString() {
		return "SnakePart [posx=" + posx + ", posy=" + posy + ", head=" + head + "]";
	}
	public boolean getHead(){
		return head;
	}
	public void setHead(boolean head) {
		this.head = head;
	}
	
}
