package local.baledo.root.snake.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import local.baledo.root.snake.controller.DirectionListener;

public class MainWindow {

	private JFrame frame;
	public static int WIDTH = 700;
	public static int HEIGHT = 700;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("unused")
			public void run() {
				try {
					MainWindow window = new MainWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnJeu = new JMenu("Jeu");
		menuBar.add(mnJeu);
		
		JMenuItem mntmNouveau = new JMenuItem("Nouveau ...");
		mnJeu.add(mntmNouveau);
		MainPanel main = new MainPanel(frame.getWidth(),frame.getHeight());
		frame.getContentPane().add(main);
		new Thread(main).start();
		frame.setVisible(true);
		DirectionListener listenerDirection = new DirectionListener(main);
		frame.addKeyListener(listenerDirection);
	}

}
