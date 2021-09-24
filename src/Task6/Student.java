package Task6;
import java.util.Arrays;
public class Student {
    private int iD;
    private int GPA;

    public Student(int iD,int GPA) {
        this.iD = iD;
        this.GPA=GPA;
    }

    public Student() {

    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}
