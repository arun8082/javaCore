import com.cdac.core.*;

class StudentMain 
{
	public static void main(String[] args) 
	{
		Student st=new Student("Arun","arun@mail.com",21,23);
		System.out.println(st.getStudentDetails());

		Student st2=new Student("aashay","aashay@mai.com",23);
		st2.computeGPA(21,32,20);
		System.out.println(st2.getStudentDetails());
	}
}
