package view;

import java.awt.EventQueue;

import controller.MainController;
import controller.SetGameController;
import model.Game;

public class Main {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
						SetGameFrame setGameFrame = new SetGameFrame();
						Game game = new Game();
						SetGameController setGameController = new SetGameController(setGameFrame,game);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
