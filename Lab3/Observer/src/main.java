public class main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 28");
        subject.setState(28);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}