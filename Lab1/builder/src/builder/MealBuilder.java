package builder;

//this is the actual builder class responsbile to create a meal from different Item objects
public class MealBuilder {

    public HappyMeal prepareVegMeal (){
        HappyMeal meal = new HappyMeal();
        meal.addItem(new TofuBurger());
        meal.addItem(new Fanta());
        return meal;
    }

    public HappyMeal prepareNonVegMeal (){
        HappyMeal meal = new HappyMeal();
        meal.addItem(new MeatBurger());
        meal.addItem(new Sprite());
        return meal;
    }
}