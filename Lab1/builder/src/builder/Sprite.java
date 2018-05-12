package builder;

//this class extends the drink class
public class Sprite extends Drink {

    @Override
    public String price() {
        return "15 lei";
    }

    @Override
    public String name() {
        return "Coke";
    }
}