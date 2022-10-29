package course;
import javax.swing.JOptionPane;

public class UseCourse {

	public static void main(String[] args) {
		CollegeCourse course = new CollegeCourse();
		course.setDepartment(JOptionPane.showInputDialog(null, "Department: "));
		course.setCourseNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Course Number: ")));
		course.setCost(Integer.parseInt(JOptionPane.showInputDialog(null, "Cost: ")));
		
		int cost = course.getCost();
		
		if(course.getDepartment().equals("SCI")||course.getDepartment().equals("BIO")||
				course.getDepartment().equals("CHM")||course.getDepartment().equals("CIS")||
				course.getDepartment().equals("PHY")) {
			LabCourse labCourse = new LabCourse();
			labCourse.setLabFee(50);
			cost += labCourse.getLabFee();
		}
		JOptionPane.showMessageDialog(null, "Department: " + course.getDepartment() +
				"\n Course Number: " + course.getCourseNumber() + "\n Cost: " + cost);
	}

}
