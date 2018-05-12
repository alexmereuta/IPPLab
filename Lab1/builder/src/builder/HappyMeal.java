package builder;

import java.util.ArrayList;
import java.util.List;

public class HappyMeal {
    private List<Item> items = new ArrayList<Item>();// creating here an arraylist of item to store the ordered food

    public void addItem(Item item){
        items.add(item);            //add items to the list
    }

    public String getCost(){
        String cost = "";

        for (Item item : items) {
            cost += item.price();//show the total cost(because theres drink and a burger with different prices)
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}