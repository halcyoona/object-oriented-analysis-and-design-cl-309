package student_pkg;
import java.util.Arrays;

public class student_modal {
	private String rollno;
	private String name;
	
    private int[] marks = {13, 7, 6, 45, 21, 9, 98, 90, 77, 85}; 
	
	public String getRollNo() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(String rollNum) {
		rollno = rollNum;
	}
	
	public void setName(String Name) {
		name = Name;
	}
	
	public void sortMarks() {
		Arrays.sort(marks); 
		System.out.printf("Modified arr[] : %s", 
                Arrays.toString(marks)); 
	}
	
	public void maxMarks() {
		Arrays.sort(marks);
		System.out.printf("Maximum:"+marks[9]);
	}

	public void minMarks() {
		Arrays.sort(marks);
		System.out.printf("Minimum:"+ marks[0]);
	}
	
	public void searchMark(int num) {
		boolean test = false; 
        for (int element : marks) { 
            if (element == num) { 
                test = true; 
                break; 
            } 
        } 
  
        // Print the result 
        System.out.println("Is " + num 
                           + " present in the array: " + test); 
	}
}
