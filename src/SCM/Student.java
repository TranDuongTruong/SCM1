package scm;
//Hoang Nghia Quyen
import java.util.Scanner;
//this class contains information of a student including student ID, name, age, m, gpa
public class Student extends StudentGrade {

    private String name;
    private int age;
    private String studentId;
    private String major;
    private double gpa;

    // add constructor, get, set , input and print student information
    public Student(String name, int age, String studentId, String major, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //Enter student information
    void input() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Name:");
        name = kb.nextLine();
        System.out.print("Enter Age:");
        age = kb.nextInt();
        System.out.print("Enter StudentId:");
        studentId = kb.nextLine();
        System.out.print("Enter Major:");
        major = kb.nextLine();
        System.out.print("Enter Gpa:");
        gpa = kb.nextDouble();
    }
    //export student information
    void output() {
        System.out.println("Name:" + name + "\nAge:" + age + "\nStudentId:" + studentId + "\nMajor:" + major + "\nGpa:" + gpa);
    }

}
