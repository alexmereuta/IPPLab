package factory;

//concrete class implementing the pet interface with a method
public class Cat implements Pet {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void doSomething() {
        System.out.println("My name is " + name + ". And I love sleeping");
    }
}