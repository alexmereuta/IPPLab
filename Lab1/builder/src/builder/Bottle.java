package builder;

//concrete class to implement the packing interface
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}