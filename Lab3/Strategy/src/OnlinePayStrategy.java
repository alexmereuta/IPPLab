import java.util.Scanner;

public class OnlinePayStrategy implements PaymentStrategy {


    private String emailId;
    private String password;
    Scanner keyboard = new Scanner(System.in);

    public OnlinePayStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " to pay using Online Payment System.");
        System.out.println("Account information:");
        System.out.println("User email :" );
        emailId = keyboard.next();
        System.out.println("User password :" );
        password = keyboard.next();
        System.out.println("Your Email : " +emailId+ ".");
        System.out.println("Your password : " + password + ".");
    }

}