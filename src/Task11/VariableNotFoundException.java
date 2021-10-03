package Task11;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}