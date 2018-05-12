package builder;

//this class extends the burger class
public class TofuBurger extends Burger {

    @Override
    public String price() {
        return "30 lei";
    }

    @Override
    public String name() {
        return "Tofu vegetarian burger";
    }
}