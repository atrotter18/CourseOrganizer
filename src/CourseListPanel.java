
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseListPanel extends JPanel {
	private DefaultListModel<String> courseListModel;
	private JList<String> courseList;

	public CourseListPanel() {
		setLayout(new BorderLayout());

		courseListModel = new DefaultListModel<>();
		courseList = new JList<>(courseListModel);
		JScrollPane scrollPane = new JScrollPane(courseList);
		add(scrollPane, BorderLayout.CENTER);

		JPanel buttonPanel = new JPanel();
		add(buttonPanel, BorderLayout.SOUTH);

		JButton addButton = new JButton("Add Course");
		JButton removeButton = new JButton("Remove Course");
		JButton printButton = new JButton("Print Course List");

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String course = JOptionPane.showInputDialog(CourseListPanel.this, "Enter the course name:");
				if (course != null && !course.isEmpty()) {
					courseListModel.addElement(course);
				}
			}
		});

		removeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedIndex = courseList.getSelectedIndex();
				if (selectedIndex >= 0) {
					courseListModel.remove(selectedIndex);
				}
			}
		});

		printButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				printCourseList();
			}
		});

		buttonPanel.add(addButton);
		buttonPanel.add(removeButton);
		buttonPanel.add(printButton);
	}

	private void printCourseList() {
		System.out.println("Course List:");
		for (int i = 0; i < courseListModel.size(); i++) {
			System.out.println(courseListModel.get(i));
		}
	}
}
