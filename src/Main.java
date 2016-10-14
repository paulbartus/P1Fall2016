import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("MINESWEEPER");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(400, 150);
		myFrame.setSize(600, 400);

		MyPanel myPanel = new MyPanel();

		myFrame.add(myPanel);


		MyMouseAdapter myMouseAdapter = new MyMouseAdapter();
		myFrame.addMouseListener(myMouseAdapter);

		myFrame.setVisible(true);

		
	}
}