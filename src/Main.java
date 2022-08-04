import lessons.*;
import services.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Lesson2 lesson2 = new Lesson2(service);
//        lesson2.runAllTasks();
        Lesson3 lesson3 = new Lesson3(service);
        lesson3.runAllTasks();
    }
}
