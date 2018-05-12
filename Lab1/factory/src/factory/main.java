package factory;

public class main {
    public static void main(String[] args) {


        PetFactory petFactory = new PetFactory();
        //get an object of type dog and get its method
        Pet dog = petFactory.getPet("Rex", PetEnum.DOG);
        Pet cat = petFactory.getPet("Ana", PetEnum.CAT);
        Pet fish = petFactory.getPet("Golden", PetEnum.FISH);

        //call the methods of the objects
        dog.doSomething();
        cat.doSomething();
        fish.doSomething();
    }
}