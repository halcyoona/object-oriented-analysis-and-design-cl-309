package student_pkg;

public class student_controler {
	private student_view view;
	private student_modal modal;
	
	public student_controler(student_view v, student_modal m){
		this.modal = m;
		this.view = v;
	}
	
	public void setStudentRollno() {
		modal.setName(view.setStudentRollNo());
	}
	
	public void setStudentName() {
		modal.setRollNo(view.setStudentName());
	}
	
	public void printStudentInfo() {
		view.printStudentDetail(modal.getName(), modal.getRollNo());
	}

}
