package student_pkg;

public class Main {
	
	public static void main(String[] args) {
	
		student_modal modal = new student_modal();
		student_view view = new student_view();
		student_controler controler = new student_controler(view, modal);
		
		controler.setStudentRollno();
		controler.setStudentName();
		controler.printStudentInfo();
	}
}
