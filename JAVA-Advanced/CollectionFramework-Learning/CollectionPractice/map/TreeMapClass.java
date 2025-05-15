package CollectionPractice.map;

import java.util.TreeMap;

class TreeMapClass1 implements java.lang.Comparable{
	int id;
	String name;
	public TreeMapClass1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "TreeMapClass1 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof TreeMapClass1) {
			TreeMapClass1 temp = (TreeMapClass1) o;
			return this.id-temp.id;
		}else if(o instanceof TreeMapClass2) {
			TreeMapClass2 temp = (TreeMapClass2) o;
			return this.id-temp.sid;
		}
		return 0;
	}
}

class TreeMapClass2 implements java.lang.Comparable{
	int sid;
	String sname;
	public TreeMapClass2(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "TreeMapClass2 [sid=" + sid + ", sname=" + sname + "]";
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof TreeMapClass1) {
			TreeMapClass1 temp = (TreeMapClass1) o;
			return this.sid-temp.id;
		}else if(o instanceof TreeMapClass2) {
			TreeMapClass2 temp = (TreeMapClass2) o;
			return this.sid-temp.sid;
		}
		return 0;
	}
}
public class TreeMapClass {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new TreeMapClass1(1, "AAA"),"AAA");
		tm.put(new TreeMapClass1(4, "BBB"),"BBB");
		tm.put(new TreeMapClass2(3, "CCC"),"CCC");
		tm.put(new TreeMapClass2(5, "EEE"),"EEE");
		System.out.println(tm);
		// all four conditions of compare method will be distributed 2-2 in both comapreTo methods
	}

}
