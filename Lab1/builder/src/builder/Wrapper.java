package builder;

//another concrete class to implement the packing interface
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}