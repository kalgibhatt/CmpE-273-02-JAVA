package genericsProblem;
import java.util.Arrays;

public class Student implements Comparable<Student> 
{

		private String studentName;
		private int studentMarks;
		private int studentAge;

		public Student(String studentName, int studentMarks, int studentAge) 
		{
			super();
			this.studentName = studentName;
			this.studentMarks = studentMarks;
			this.studentAge = studentAge;
		}

		public String getstudentName()
		{
			return studentName;
		}
		public void setstudentName(String studentName)
		{
			this.studentName = studentName;
		}
		public int getstudentMarks()
		{
			return studentMarks;
		}
		public void setstudentMarks(int studentMarks) 
		{
			this.studentMarks = studentMarks;
		}
		public int getstudentAge() 
		{
			return studentAge;
		}
		public void setstudentAge(int studentAge)
		{
			this.studentAge = studentAge;
		}

		public int compareTo(Student comparestudent)
		{

			int comparestudentMarks = ((Student) comparestudent).getstudentMarks();

			//ascending order
			//return this.studentMarks - comparestudentMarks;

			//descending order
			return comparestudentMarks - this.studentMarks;

		}

		public static void main(String args[])
		{

			Student[] student = new Student[4];

			Student Keyur = new Student("Keyur",89,25);
			Student Kalgi = new Student("Kalgi",78,23);
			Student Ved = new Student("Ved", 90,24);
			Student Hardik = new Student("Hardik",50,29);

			student[0]=Keyur;
			student[1]=Kalgi;
			student[2]=Ved;
			student[3]=Hardik;

			Arrays.sort(student);

			int i=0;
			for(Student temp: student)
			{
			   System.out.println("Student " + ++i + " : " + temp.getstudentName() +
				", Age : " + temp.getstudentAge() + ", Marks : " + temp.getstudentMarks());
			}

		}
	}

