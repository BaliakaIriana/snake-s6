package local.baledo.root.snake.controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import local.baledo.root.snake.view.MainPanel;

public class DirectionListener implements KeyListener{

	MainPanel main;
	
	
	/**
	 * @param main
	 */
	public DirectionListener(MainPanel main) {
		this.main = main;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		switch(arg0.getKeyCode()){
			case KeyEvent.VK_UP :
				System.out.println("Up");
				main.getSnake().up();
				break;
			case KeyEvent.VK_DOWN :
				System.out.println("Down");
				main.getSnake().down();
				break;
			case KeyEvent.VK_LEFT :
				System.out.println("Left");
				main.getSnake().left();
				break;
			case KeyEvent.VK_RIGHT :
				System.out.println("Right");
				main.getSnake().right();
				break;
			default :
				System.out.println("kindy");
				break;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}

}
