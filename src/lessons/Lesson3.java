package lessons;

import services.Service;

public class Lesson3 extends Lesson {

    public Lesson3(Service service) {
        super(service);
    }

    public void runAllTasks() {
        this.task1();
        this.task2();
        this.task3();
        this.task4();
        this.task5();
        this.task6();
    }

    public void task1() {
        super.service.printStartMessage("1.3.1");
        int p = 7;
        if (p == 0 || p % 2 != 0) {
            System.out.println(p + " - не четное число");
        } else {
            System.out.println(p + " четное число");
        }
        super.service.printFinishMessage();
    }
    public void task2() {
        super.service.printStartMessage("1.3.2");

        super.service.printFinishMessage();
    }

    public void task3() {
        super.service.printStartMessage("1.3.3");

        super.service.printFinishMessage();
    }

    public void task4() {
        super.service.printStartMessage("1.3.4");

        super.service.printFinishMessage();
    }

    public void task5() {
        super.service.printStartMessage("1.3.5");

        super.service.printFinishMessage();
    }

    public void task6() {
        super.service.printStartMessage("1.3.6");

        super.service.printFinishMessage();
    }

}
