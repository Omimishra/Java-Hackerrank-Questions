package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id,String fname,double cgpa){
        super();
        this.id = id;
        this.fname= fname;
        this.cgpa=cgpa;

    }
    public int getId(){
        return id;
    }
    public String getFname(){
        return fname;
    }
    public double getCgpa(){
        return cgpa;
    }
}
public class sort {
    // You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int testCases = Integer.parseInt(sc.nextLine());
    List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = sc.nextInt();
			String fname = sc.next();
			double cgpa = sc.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
            testCases--;
}
for(int i=0;i<studentList.size()-1;i++){
        for(int j=0;j<studentList.size()-1;j++){
            if(studentList.get(j).getCgpa()<studentList.get(j+1).getCgpa()){
                Student sl=studentList.get(j);
                studentList.set(j, studentList.get(j+1));
                studentList.set(j+1, sl);
            }
            else if(studentList.get(j).getCgpa()==studentList.get(j+1).getCgpa()){
                if(studentList.get(j).getFname().compareTo(studentList.get(j+1).getFname())>0){
                    Student sl=studentList.get(j);
                    studentList.set(j, studentList.get(j+1));
                    studentList.set(j+1, sl);
                }
            }
        }
    }
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
        sc.close();
	}
}
