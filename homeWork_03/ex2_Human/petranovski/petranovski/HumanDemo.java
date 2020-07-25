package by.petranovski;
import by.petranovski.bean.Human;
import by.petranovski.service.HumanService;

public class HumanDemo {
    public static void main(String[] args) {

        HumanService humanService = new HumanService();
        Human human = new Human("Bob", 30);

        humanService.greet(human);

    }
}
