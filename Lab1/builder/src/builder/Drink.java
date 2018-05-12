package builder;

//concrete class implementing item interface, representing drinks option
public abstract class Drink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract String price();
}