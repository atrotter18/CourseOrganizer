import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class CourseListFrame extends JFrame {
	public CourseListFrame() {
		setTitle("Course List");
		setSize(400, 300);

		CourseListPanel panel = new CourseListPanel();
		add(panel);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
