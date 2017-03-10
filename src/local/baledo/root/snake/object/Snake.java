package local.baledo.root.snake.object;

import java.awt.Graphics;
import java.util.LinkedList;

public class Snake implements Runnable{
	SnakePart head;
	LinkedList<SnakePart> tail;
	
	int dx = 1;
	int dy = 0;
	
	public Snake(int xinit,int yinit){
		System.out.println(xinit + " "+ yinit);
		head = new SnakePart();
		head.isHead();
		head.setPosx(xinit);
		head.setPosy(yinit);
		tail = new LinkedList<SnakePart>();
		tail.add(head);
		SnakePart temp = new SnakePart();
		System.out.println("temp "+temp);
		tail.add(temp);
		SnakePart temp1 = new SnakePart();
		System.out.println("temp1 "+temp1);
		tail.add(temp1);
		SnakePart temp2 = new SnakePart();
		System.out.println("temp1 "+temp2);
		tail.add(temp2);
	}
	
	public void up(){
		if(dy != 1){
			dx = 0;
			dy = -1;
		}
	}
	public void down(){
		if(dy != -1){
			dx = 0;
			dy = 1;
		}	
	}
	public void left(){
		if(dx != 1){
			dx = -1;
			dy = 0;
		}
	}
	public void right(){
		if(dx != -1){
			dx = 1;
			dy = 0;	
		}
	}
	@Override
	public void run(){
		while(true){
			SnakePart part = new SnakePart();
			part.setPosx(tail.get(0).getPosx() + (dx*10));
			part.setPosy(tail.get(0).getPosy() + (dy*10));
			synchronized (tail) {
				tail.addFirst(part);
				tail.removeLast();
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	public void paintSnake(Graphics g){
		synchronized (tail) {
			for(SnakePart item : tail){
				item.paintSnakePart(g);
			}
		}
	}
	public void grow(){
		SnakePart part = new SnakePart();
		part.setPosx(tail.get(0).getPosx() - (dx*10));
		part.setPosy(tail.get(0).getPosy() - (dy*10));
		tail.addLast(part);
	}

	public SnakePart getHead() {
		return head;
	}

	public void setHead(SnakePart head) {
		this.head = head;
	}
	
}
