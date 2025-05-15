package CollectionPractice.set;

import java.util.TreeSet;

class Student implements /*java.lang.Comparable */ java.lang.Comparable<Student>{
	int rollNo;
	String studentName;
	
	public Student(int rollNo, String studentName) {
		this.rollNo = rollNo;
		this.studentName = studentName;
	}
	
	public String toString() {
		return "[rollNo:"+this.rollNo+",studentName "+this.studentName+"]";
	}

//	@Override
//	public int compareTo(Object object) {
//		Student tempStudent = (Student) object;
//		return this.studentName.compareTo(tempStudent.studentName);
//	}

//	@Override
//	public int compareTo(Student student) {
//		return this.studentName.compareTo(student.studentName);
//	}
	
	@Override
	public int compareTo(Student student) {
		if(this.rollNo < student.rollNo) {
			return -1;
		}
		else if(this.rollNo > student.rollNo) {
			return 1;
		}
		return 0;
	}
	
	
}
public class ComparableClass {

	public static void main(String[] args) {
		Student student1 = new Student(1,"CCC");
		Student student2 = new Student(5,"DDD");
		Student student3 = new Student(4,"AAA");
		Student student4 = new Student(2,"BBB");
		Student student5 = new Student(3,"FFF");
		Student student6 = new Student(6,"EEE");
		
		TreeSet ts = new TreeSet();
		ts.add(student1);
		ts.add(student2);
		ts.add(student3);
		ts.add(student4);
		ts.add(student5);
		ts.add(student6);
		System.out.println(ts);
	}
}
