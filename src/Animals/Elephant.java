package Animals;

public class Elephant extends Animal{
    public Elephant(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("Тру-у-у, я слон!, " + super.getName());
    }
}
