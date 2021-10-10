package Task10;

public class Tester extends ChairFactory{
    public static void main(String args[]){
        ChairFactory factory= new ChairFactory();
        factory.createFunctionalChair();
        factory.createMagicianChair();
        factory.createVictorianChair();
    }
}
