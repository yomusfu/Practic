package Task10;

public class VictorianChair implements Chair{
    int age;

    public VictorianChair() {
        this.age=0;
    }

    int getAge(){
        return age;
    }
    VictorianChair(int age){
        this.age=age;
    }
}
