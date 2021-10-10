package Task9;

import java.util.Comparator;



public class GroupComparator implements Comparator<Student>,Comparable<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge()>o2.getAge()){
            o1.getFio().compareTo(o2.getFio());
        }
        return 0;
    }

    @Override
    public int compareTo(Student o) {

        return 0;
    }
}
