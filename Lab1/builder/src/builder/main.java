package builder;

//main class uses mealbuilder to demonstrate builder pattern and build a meal
public class main {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        HappyMeal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        HappyMeal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}