public class ChatClient {

    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteMediator();
        User user1 = new ConcreteUser(mediator, "Alice");
        User user2 = new ConcreteUser(mediator, "Valeria");
        User user3 = new ConcreteUser(mediator, "Daniel");
        User user4 = new ConcreteUser(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");

    }

}