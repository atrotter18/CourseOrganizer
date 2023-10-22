import javax.swing.*;

public class CourseList {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new CourseListFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}

}
