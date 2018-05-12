package builder;

//concrete class to implement the item interface, representing food optinons
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract String price();
}