package Task10;

public class ConcreteFactory implements  ComplexAbstractFactory{
    @Override
    public Complex createComplex(){
       return new Complex() {
       };
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }
}