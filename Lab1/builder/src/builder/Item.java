package builder;

//the interface to represent food items (ie drinks and burgers)
public interface Item {
    public String name();
    public Packing packing();
    public String price();
}