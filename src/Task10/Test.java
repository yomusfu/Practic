package Task10;

public class Test {
    public static void main(String args[]){
        int real = 0;
        int image=0;
       ComplexAbstractFactory factory;
       factory = new ConcreteFactory();
       factory.createComplex();
       factory.CreateComplex(real,image);
    }

}
