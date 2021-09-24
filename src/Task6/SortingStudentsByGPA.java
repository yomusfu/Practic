package Task6;

import java.util.Arrays;
import java.util.Comparator;
class StudentGPAComparator implements Comparator<Student>{
    public int compare(Student a,Student b){
        if(a.getGPA()>b.getGPA())
            return 1;
        else if(a.getGPA()<b.getGPA())
            return -1;
        else return 0;
    }
}
public class SortingStudentsByGPA extends Student{
    public SortingStudentsByGPA(int iD, int GPA) {
        super(iD, GPA);
    }
    Student q= new Student();
    Student[] students = new Student[5];
    public void main(String args[]) {
        Comparator<Student> scomp = new StudentGPAComparator();
        students[0] = new Student(12341,270);
        students[1] = new Student(4123,224);
        students[2] = new Student(456,290);
        students[3] = new Student(30,300);
        students[4] = new Student(901,240);
        Arrays.sort(students,scomp);
        for (int i=0;i<5;i++){
            System.out.println(students[i].getiD()+" "+students[i].getGPA());
        }
    }
}