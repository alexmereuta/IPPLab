package builder;

//this class extends the burger class
public class MeatBurger extends Burger {

    @Override
    public String price() {
        return "40 lei";
    }

    @Override
    public String name() {
        return "Any meat burger";
    }
}