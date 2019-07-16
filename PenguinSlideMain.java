import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PenguinSlideMain extends JFrame
{
	// Program variables the game board
	private PenguinSlideBoard gameBoard;

	public PenguinSlideMain()
	{
		// Sets up the frame for the game
		super("Penguin Slide");
		setResizable(false);

		// Load up the icon image (penguin image from www.iconshock.com)
		setIconImage(Toolkit.getDefaultToolkit().getImage("blackPenguin.png"));

		// Sets up the Connect Four board that plays most of the game
		// and add it to the center of this frame
		gameBoard = new PenguinSlideBoard();
		getContentPane().add(gameBoard, BorderLayout.CENTER);

		// Centre the frame in the middle (almost) of the screen
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((screen.width - gameBoard.BOARD_SIZE.width) / 2,
				(screen.height - gameBoard.BOARD_SIZE.height) / 2);
	}

	/**
	 * Starts up the PenguinSlideMain frame
	 * @param args An array of Strings (ignored)
	 */
	public static void main(String[] args)
	{
		// Starts up the ConnectFourMain frame
		PenguinSlideMain frame = new PenguinSlideMain();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	} // main method

}
