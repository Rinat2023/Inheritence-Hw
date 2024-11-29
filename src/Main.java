import Animals.Elephant;
import Animals.Lion;
import Animals.Monkey;
import Book.Book;
import Book.Ebook;
import Vehicle.Vehicle;
import Vehicle.Car;
import Vehicle.Truck;


public class Main {
    public static void main(String[] args) {
        //1
//        Book newBook = new Book("war and peace", "lev tolstoy", 999999);
//        newBook.read();
//
//        Ebook downloadBook = new Ebook("war and peace", "lev tolstoy", 999999, 40);
//        downloadBook.read();
//        downloadBook.download();

        //2
//        Lion lev = new Lion("lev");
//        Elephant slon = new Elephant("slon");
//        Monkey obezyana = new Monkey("obezyana");
//
//        lev.makeSound();
//        slon.makeSound();
//        obezyana.makeSound();

        //3
     Car mers = new Car(180, 10, "mers", "biiipp");
     Truck truck = new Truck(240, 50, 50, 3);

        System.out.println(mers);
        System.out.println(truck);

    }
}