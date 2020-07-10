package by.bntu.fitr.poisit.lytkina;

public class Application {
    public static void main(String[] args) {
        //create object of each entity
        Bird bird = new Bird();
        Book book = new Book();
        Dress dress = new Dress();
        Milk milk = new Milk();
        Order order = new Order();
        Printer printer = new Printer();
        Scissors scissors = new Scissors();
        Student student = new Student();
        Table table = new Table();
        Tree tree = new Tree();

        //example of using method
        bird.fly();
    }
}
