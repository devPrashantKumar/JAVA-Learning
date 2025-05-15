package CollectionPractice.set;

import java.util.TreeSet;

class Teacher {
	int teacherId;
	String teacherName;
	
	public Teacher(int teacherId, String teacherName) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
	}
	
	public String toString() {
		return "[teacherId:"+this.teacherId+",teacherName "+this.teacherName+"]";
	}
}

class Staff {
	int staffId;
	String staffName;
	
	public Staff(int staffId, String staffName) {
		this.staffId = staffId;
		this.staffName = staffName;
	}
	
	public String toString() {
		return "[staffId:"+this.staffId+",staffName "+this.staffName+"]";
	}
}

class MyComparator implements java.util.Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Teacher && o2 instanceof Staff) {
			Teacher tempTeacher1 = (Teacher) o1;
			Staff tempStaff1 = (Staff) o2;
			return tempTeacher1.teacherName.compareTo(tempStaff1.staffName);
		}else if(o2 instanceof Teacher && o1 instanceof Staff){
			Teacher tempTeacher1 = (Teacher) o2;
			Staff tempStaff1 = (Staff) o1;
			return tempStaff1.staffName.compareTo(tempTeacher1.teacherName);
		}else if(o1 instanceof Teacher && o2 instanceof Teacher) {
			Teacher tempTeacher1 = (Teacher) o1;
			Teacher tempTeacher2 = (Teacher) o2;
			return tempTeacher1.teacherName.compareTo(tempTeacher2.teacherName);
		}else {
			Staff tempStaff1 = (Staff) o1;
			Staff tempStaff2 = (Staff) o2;
			return tempStaff1.staffName.compareTo(tempStaff2.staffName);
		}
		
	}
}

public class ComparatorClass {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher(1,"CCC");
		Teacher teacher2 = new Teacher(5,"DDD");
		Teacher teacher3 = new Teacher(4,"AAA");
		Teacher teacher4 = new Teacher(9,"EEE");
		Teacher teacher5 = new Teacher(3,"GGG");
		Teacher teacher6 = new Teacher(6,"III");
		Staff staff1 = new Staff(8,"BBB");
		Staff staff2 = new Staff(7,"FFF");
		Staff staff3 = new Staff(2,"HHH");
		
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(teacher1);
		ts.add(teacher2);
		ts.add(teacher3);
		ts.add(teacher4);
		ts.add(teacher5);
		ts.add(teacher6);
		ts.add(staff1);
		ts.add(staff2);
		ts.add(staff3);
		System.out.println(ts);
	}

}
