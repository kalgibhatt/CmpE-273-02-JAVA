package genericsProblem;
import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class StudentTest 
{
	@Test
	public void normalTest()
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
		assertTrue(student[0] == Ved && student[1] == Keyur && student[2] == Kalgi && student[3] == Hardik);
	}
	
	@Test
	public void nameAscendingTest()
	{	
		Student[] student = new Student[4];
		Student Hardik = new Student("Hardik",50,29);
		Student Kalgi = new Student("Kalgi",78,23);
		Student Keyur = new Student("Keyur",89,25);
		Student Ved = new Student("Ved", 90,24);
		student[0]=Hardik;
		student[1]=Kalgi;
		student[2]=Keyur;
		student[3]=Ved;
		Arrays.sort(student);
		assertTrue(student[0] == Ved && student[1] == Keyur && student[2] == Kalgi && student[3] == Hardik);
	}
	
	@Test
	public void nameDescendingTest()
	{	
		Student[] student = new Student[4];
		Student Ved = new Student("Ved", 90,24);
		Student Keyur = new Student("Keyur",89,25);
		Student Kalgi = new Student("Kalgi",78,23);
		Student Hardik = new Student("Hardik",50,29);
		student[0]=Ved;
		student[1]=Keyur;
		student[2]=Kalgi;
		student[3]=Hardik;
		Arrays.sort(student);
		assertTrue(student[0] == Ved && student[1] == Keyur && student[2] == Kalgi && student[3] == Hardik);
	}
	
	@Test
	public void ageAscendingTest()
	{	
		Student[] student = new Student[4];
		Student Kalgi = new Student("Kalgi",78,23);
		Student Ved = new Student("Ved", 90,24);
		Student Keyur = new Student("Keyur",89,25);
		Student Hardik = new Student("Hardik",50,29);
		student[0]=Kalgi;
		student[1]=Ved;
		student[2]=Keyur;
		student[3]=Hardik;
		Arrays.sort(student);
		assertTrue(student[0] == Ved && student[1] == Keyur && student[2] == Kalgi && student[3] == Hardik);
	}
	
	@Test
	public void ageDescendingTest()
	{	
		Student[] student = new Student[4];
		Student Hardik = new Student("Hardik",50,29);
		Student Keyur = new Student("Keyur",89,25);
		Student Ved = new Student("Ved", 90,24);
		Student Kalgi = new Student("Kalgi",78,23);
		student[0]=Hardik;
		student[1]=Keyur;
		student[2]=Ved;
		student[3]=Kalgi;
		Arrays.sort(student);
		assertTrue(student[0] == Ved && student[1] == Keyur && student[2] == Kalgi && student[3] == Hardik);
	}
	
	@Test(expected=NullPointerException.class)
	public void nullTest()
	{	
		Student[] student = new Student[4];
		Student Kalgi = new Student("Kalgi",78,23);
		Student Ved = new Student("Ved", 90,24);
		Student Hardik = new Student("Hardik",50,29);
		student[1]=Kalgi;
		student[2]=Ved;
		student[3]=Hardik;
		Arrays.sort(student);		
	}
	
	@Test(expected=ArithmeticException.class)
	public void negativeMarksTest()
	{	
		Student[] student = new Student[4];
		Student Keyur = new Student("Keyur",-89,25);
		Student Kalgi = new Student("Kalgi",78,23);
		Student Ved = new Student("Ved", 90,24);
		Student Hardik = new Student("Hardik",50,29);
		student[0]=Keyur;
		student[1]=Kalgi;
		student[2]=Ved;
		student[3]=Hardik;
		Arrays.sort(student);		
	}
	
	@Test(expected=ArithmeticException.class)
	public void negativeAgeTest()
	{	
		Student[] student = new Student[4];
		Student Keyur = new Student("Keyur",89,-25);
		Student Kalgi = new Student("Kalgi",78,23);
		Student Ved = new Student("Ved", 90,24);
		Student Hardik = new Student("Hardik",50,29);
		student[0]=Keyur;
		student[1]=Kalgi;
		student[2]=Ved;
		student[3]=Hardik;
		Arrays.sort(student);		
	}
	
	@Test(expected=ArithmeticException.class)
	public void zeroAgeTest()
	{	
		Student[] student = new Student[4];
		Student Keyur = new Student("Keyur",89,25);
		Student Kalgi = new Student("Kalgi",78,0);
		Student Ved = new Student("Ved", 90,24);
		Student Hardik = new Student("Hardik",50,29);
		student[0]=Keyur;
		student[1]=Kalgi;
		student[2]=Ved;
		student[3]=Hardik;
		Arrays.sort(student);		
	}

}
