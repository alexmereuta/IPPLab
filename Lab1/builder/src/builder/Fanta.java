package builder;

//this class also extends the drink class
public class Fanta extends Drink {

    @Override
    public String price() {
        return "15 lei";
    }

    @Override
    public String name() {
        return "Coke";
    }
}