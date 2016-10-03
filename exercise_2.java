import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exercise_2 extends JPanel {
	 int radius = 10;
	 int x = 150;
	 int y = 150;
	 public void paintComponent(Graphics g){
		 for (int i = 1; i <= 12; i++) {
			 g.drawOval(150 - (radius + 10 * i), 150 - (radius + 10 * i),(radius + 10 * i) * 2, (radius + 10 * i) * 2);
		 }
	}	 

public static void main(String[] args) {
    JFrame frame = new JFrame("Exercise_2");
    frame.add(new Exercise_2());
    frame.pack();
    frame.setSize(350,350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}

