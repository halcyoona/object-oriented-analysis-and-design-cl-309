package student_pkg;

import javax.swing.JOptionPane;

public class student_view {
	
	public void printStudentDetail(String name, String rollno) {
		System.out.println("Student Detail");
		System.out.println("Student Name : "+ name);
		System.out.println("Student RollNo : "+ rollno);
	}

	public String setStudentName() {
		String name  = JOptionPane.showInputDialog("Enter your Name");
		return name;
	}
	
	public String setStudentRollNo() {
		String rollno = JOptionPane.showInputDialog("Enter your Roll No");
		return rollno;
	}
}


