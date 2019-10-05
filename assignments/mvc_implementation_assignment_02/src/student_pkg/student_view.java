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
	
	
	public int checkingForInput() {
		String num1 = JOptionPane.showInputDialog("1 for sort an array\n"+"2 for finding maximum\n"+"3 for find minimum\n"+"or any other number to search");
		int temp = Integer.parseInt(num1);
		return temp;
	}
}


