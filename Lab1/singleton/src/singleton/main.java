package singleton;

public class main {
    public static void main(String[] args) {



        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}