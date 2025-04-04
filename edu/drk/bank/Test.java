package edu.drk.bank;


class Student{
	
	int id;
	String name;
	String college="DRK";
	String course;
	
	public Student(int id, String name, String course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", course=" + course + "]";
	}

	
	
	
	
}


public class Test {

	public static void main(String[] args) {
	
		Student s1 = new Student(100,"Ramu","CSE");
		Student s2 = new Student(102,"Shyam","CSE");
		
		System.out.println("ID---->"+s1.getId());
		System.out.println("name---->"+s1.getName());
		System.out.println("Course---->"+s1.getCourse());
	
		
		System.out.println("s1--->"+s1);
		System.out.println("s2--->"+s2);
		
	}

}
