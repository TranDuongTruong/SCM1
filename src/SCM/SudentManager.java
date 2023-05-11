package SCM;

public class SudentManager {
	public  ArrayList<Student> studentList;
		static Scanner nhap=new Scanner(System.in);
		//tìm học sinh với số điểm trung bình cao nhất
		Student highestScore()
	{
		int vitri=0;
		float highestScore=studentList.get(0).getMediumGrade();
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getMediumGrade()>highestScore)
			{
				vitri=i;
				highestScore=studentList.get(i).getMediumGrade();
			}
		}
		
		return studentList.get(vitri);
	}
	
	//tìm học sinh với số điểm trung bình thấp nhất
	Student lowestScore()
	{
		int vitri=0;
		float lowestScore=studentList.get(0).getMediumGrade();
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getMediumGrade()<lowestScore)
			{
				vitri=i;
				lowestScore=studentList.get(i).getMediumGrade();
			}
		}
		
		
		return studentList.get(vitri);
	}
	
	//Thêm 1 học sinh
	void add()
	{
		Student m=new Student();
		m.input();
		studentList.add(m);
		
	}
	
	//Xóa 1 học sinh
	void delete()
	{
		String ID;
		System.out.println("Nhap ID hoc sinh can xoa: ");ID=nhap.nextLine();
		for(int i=0;i<studentList.size();i++)
		{
			if(studentList.get(i).getStudentId()==ID)
				studentList.remove(i);
		}
	}
	public  ArrayList<Student> studentList;
	  public StudentManager()
	    {
	        studentList = new ArrayList<>();
	    }
	  void Enter() {
		  Scanner kb=new Scanner(System.in);
		  int n;
		  System.out.println(" Number of students you want to add to the list: ");n=kb.nextInt();
		  for (int i=0;i<n;i++) {
					String name;
				    int age;
				    String studentId;
				    String major;
				    double gpa;
				  int mathGrade;
				  int literatureGrade;
				  int englishGrade;
				  int physicsGrade;
				  
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
			  studentList.add(s);
			  }
			  
		  }
	void Print() {
		for(int i=0;i<studentList.size();i++) {
			
			studentList.get(i).output();;
		}
	
	}
	void Sort() {
		for (int i=0;i<studentList.size();i++) {
			for (int j=i+1;j<studentList.size()-1;j++) {
				if (studentList.get(j).AverageScore()>studentList.get(j+1).AverageScore()) {
					Student temp=new Student();
					temp=studentList.get(j);
					studentList.set(j,studentList.get(j+1));
					studentList.set(j+1,temp);
				}
			}
		}
	}
	

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
