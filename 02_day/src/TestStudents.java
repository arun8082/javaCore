import com.cdac.core.*;

class TestStudents 
{
	public static void main(String[] args) 
	{
		Student[] st=new Student[3];
		st[0] = new Student("a","a@mail.com",21);
		st[1] = new Student("b","b@mail.com",22);
		st[2] = new Student("c","c@mail.com",22);
		
		st[0].computeGPA(10,20,30);
		st[1].computeGPA(40,50,60);
		st[2].computeGPA(70,80,90);

		Student high=st[0];
		for(int i=1; i<3;i++){
			if(high.getGPA() < st[i].getGPA()){
				high=st[i];
			}
		}
		System.out.println(high.getStudentDetails());
	}
}
