package scm;
//Author: Huynh Huu Tuong, Nguyen Hoang Viet
import java.util.*;
// This class demonstrate how we manage information about the students of a university using functions: 
//highestScore,lowestScore,Enter,printStudent,add,delete
public class StudentManager {
	public  ArrayList<Student> student_list=new ArrayList<>();
		static Scanner nhap=new Scanner(System.in);
		//To do: find out the student with highest score
		Student highestScore()
		{
		int vitri=0;
		float highestScore=student_list.get(0).getMediumGrade();
		for(int i=0;i<student_list.size();i++)
		{
			if(student_list.get(i).getMediumGrade()>highestScore)
			{
				vitri=i;
				highestScore=student_list.get(i).getMediumGrade();
			}
		}
		
		return student_list.get(vitri);
	}
	
	//To do: find out student with lowest score
	Student lowestScore()
	{
		int vitri=0;
		float lowestScore=student_list.get(0).getMediumGrade();
		for(int i=0;i<student_list.size();i++)
		{
			if(student_list.get(i).getMediumGrade()<lowestScore)
			{
				vitri=i;
				lowestScore=student_list.get(i).getMediumGrade();
			}
		}
		
		
		return student_list.get(vitri);
	}
	// To do: fill in Information of student 
	 void enter() {
		  Scanner kb=new Scanner(System.in);
		  int n;
		  System.out.println(" Number of students you want to add to the list: ");n=kb.nextInt();
		  for (int i=0;i<n;i++) {
					String name;
				    int age;
				    String studentId;
				    String major;
				    double gpa;
				  float mathGrade;
				  float literatureGrade;
				  float englishGrade;
				  float physicsGrade;
				  
			  System.out.println(" The information of Student "+i);
			  System.out.println(" Name is: ");name=kb.next();	
			  System.out.println(" Age is: ");age=kb.nextInt();
			  System.out.println(" StudentId is: ");studentId=kb.next();
			  System.out.println(" Major is: ");major=kb.next();
			  System.out.println(" GPA is: ");gpa=kb.nextDouble();	
			  Student s=new Student(name,age,studentId,major,gpa);
			  System.out.println(" Math Grade is: ");mathGrade=kb.nextFloat();s.setMathGrade(mathGrade);
			  System.out.println(" Literature Grade is: ");literatureGrade=kb.nextFloat();s.setLiteratureGrade(literatureGrade);
			  System.out.println(" English Grade is: ");englishGrade=kb.nextFloat();s.setEnglishGrade(englishGrade);
			  System.out.println(" Physics Grade is: ");physicsGrade=kb.nextFloat();s.setPhysicsGrade(physicsGrade);
			  student_list.add(s);
			  }
			  
		  }
	// To do: Print the information of All student
	void print() {
		for(int i=0;i<student_list.size();i++) {
			
			this.student_list.get(i).output();;
		}
	
	}
	//To do: Add one student to the list
	void add()
	{
		Student m=new Student();
		m.input();
		student_list.add(m);
		
	}
	
	//To do: remove one student from the list by Their ID
	void delete()
	{
		String ID;
		System.out.println("Nhap ID hoc sinh can xoa: ");ID=nhap.nextLine();
		for(int i=0;i<student_list.size();i++)
		{
			if(student_list.get(i).getStudentId()==ID)
				student_list.remove(i);
		}
	}
	

	// To do: Demonstrate this program
	public static void main(String[] args) {
		StudentManager a=new StudentManager();
		a.Enter();
		a.Print();
		Student s1=new Student();
		s1=a.highestScore();// viet viet ham return mediumgrade la sai
		System.out.println("\n The Highest Score student is : ");
		s1.output();
		s1=a.lowestScore();
		System.out.println("\n The Lowest Score student is : ");
		s1.output();
		
		
	}
	
}

