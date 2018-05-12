import java.util.Scanner;

public class CreditCardStrategy implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    Scanner keyboard = new Scanner(System.in);

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount +" to pay with credit");
        System.out.println("User card information:");
        System.out.println("User name :" );
        name = keyboard.next();
        System.out.println("User card number :" );
        cardNumber = keyboard.next();
        System.out.println("Card ccv :" );
        cvv = keyboard.next();
        System.out.println("Card date of expiry :" );
        dateOfExpiry = keyboard.next();
        System.out.println("User name : " +name+ ".");
        System.out.println("User card number : " + cardNumber+ ".");
        System.out.println("User card cvv : " + cvv+ ".");
        System.out.println("User card date of expiry in format mm/yy : " + dateOfExpiry+ ".");
    }

}