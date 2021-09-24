package Task6;
import java.lang.*;

public class firstTask extends  Student{
    public firstTask(int iD, int GPA) {
        super(iD, GPA);
    }
    Student[] students = new Student[5];


    public void main(String args[]){
        int[] iDNumbers=new int[5];
        for (int i=0;i<5;i++){
            iDNumbers[i]=students[i].getiD();
        }
        QuickSort q=new QuickSort() ;
        q.quickSort(iDNumbers,0,5);
    }
}
