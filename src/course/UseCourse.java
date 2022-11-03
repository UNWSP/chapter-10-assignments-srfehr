package course;
import javax.swing.JOptionPane;

public class UseCourse {

	public static void main(String[] args) {
		CollegeCourse course = new CollegeCourse();
		course.setDepartment(JOptionPane.showInputDialog(null, "Department: "));
		course.setCourseNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Course Number: ")));
		course.setCredits(Integer.parseInt(JOptionPane.showInputDialog(null, "Credits: ")));
		
		final int CREDITCOST = 120;
		
		int cost = course.getCredits() * CREDITCOST;
		
		if(course.getDepartment().equals("SCI")||course.getDepartment().equals("BIO")||
				course.getDepartment().equals("CHM")||course.getDepartment().equals("CIS")||
				course.getDepartment().equals("PHY")) {
			cost += 50;
		}
		
		JOptionPane.showMessageDialog(null, "Department: " + course.getDepartment() +
				"\n Course Number: " + course.getCourseNumber() + "\n Cost: " + cost);
	}

}
