package Animals;

public class Lion extends  Animal{
    public Lion(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println("Ррр, я лев!, " + super.getName());
    }
}
