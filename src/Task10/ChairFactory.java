package Task10;

public class ChairFactory {
    VictorianChair createVictorianChair() {
        return new VictorianChair();
    }

    MagicChair createMagicianChair(){
        return new MagicChair();
    }
    FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    }
}
