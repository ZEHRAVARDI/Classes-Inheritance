
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student =new Student();
		student.name="zehra";
		Instructor instructor=new Instructor();
		instructor.department="Computer Science";
		UserManager userManager=new UserManager();
		userManager.add(instructor);
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.makaleYukle(instructor,"OOP Makale");
	}

}
