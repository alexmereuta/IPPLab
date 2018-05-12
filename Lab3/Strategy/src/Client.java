public class Client {

    public static void main(String[] args) {
        Cart cart = new Cart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        //pay by paypal
        cart.pay(new OnlinePayStrategy("",""));

        //pay by credit card
        cart.pay(new CreditCardStrategy("","","",""));
    }

}