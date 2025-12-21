package basic;

import java.util.LinkedHashSet;

class Student{
	private String rollNo;
	private String name;
	private String email;
	public Student(String rollNo, String name, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.email = email;
	}
	public String getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", email=" + email + "]";
	}
	
}


public class ExampleForLInkedHashSet2 {

	public static void main(String[] args) {
		Student s1=new Student("A3221","Nami","nami@gmail.com");
		Student s2=new Student("A054","luffy","luffy@gmail.com");
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(s1);
		lhs.add(s2);
		for(Object i:lhs) {
			System.out.println(i);
		}
	}

}
