package lessons;

import services.Service;

public class Lesson2 extends Lesson {

    public Lesson2(Service service) {
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

    /** Task 1.2.1
     * У вас есть две переменных, в которых хранятся два целочисленных числа. Напишите программу, которая выводит в консоль
     *      результат деления первого числа на второе с остатком.
     * В качестве исходных данных используйте значения для первого числа *– 47, для второго – 13):*
     * В результате деления 47 / 13
     * Выходит 3 и 6 в остатке
     */
    public void task1() {
        this.service.printStartMessage("1.2.1");
        int inputFirstNumber = 47;
        int inputSecondNumber = 13;
        int integerPartOfResult = inputFirstNumber / inputSecondNumber;
        int fractionalPartOfResult = inputFirstNumber % inputSecondNumber;
        System.out.println("Выходит " + integerPartOfResult + " и " + fractionalPartOfResult + " в остатке");
        this.service.printFinishMessage();
    }

    /** Task 1.2.2
     * Напишите программу, которая вычисляет сумму цифр двухзначного числа.
     * Программа должна работать с любым значением числа. В качестве исходных данных используйте число 44.
     */
    public void task2() {
        this.service.printStartMessage("1.2.2");
        int inputNumber = 44;
        int sum = 0;
        while (inputNumber > 0) {
            sum += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("sum = " + sum);
        this.service.printFinishMessage();
    }

    /**
     * Task 1.2.3
     * Напишите программу, которая вычисляет сумму цифр трехзначного числа.
     * Программа должна работать с любым значением числа. В качестве исходных данных используйте число 345.
     */
    public void task3() {
        this.service.printStartMessage("1.2.3");
        int number = 345;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("sum = " + sum);
        this.service.printFinishMessage();
    }

    /** 1.2.4
     * Коля пришел в цветочный магазин и решил купить букет цветов своей подруге. Букет стоит ромашек 4899 рублей.
     *      К цветам он купил открытку, которая стоит 157 рублей.
     *      При покупке Коле дали скидку в 10% на сумму двух покупок.
     * Вычислите и выведите в консоль сумму двух покупок с учетом скидки.
     * Отдельно выведите сумму скидки двух покупок.
     */
    public void task4() {
        this.service.printStartMessage("1.2.4");
        int costBouquet = 4899;
        int costPostCard = 157;
        int salePersent = 10;
        int totalCost = costBouquet + costPostCard;
        double totalCostWithSale = totalCost - (double) totalCost / 100 * salePersent;
        double totalDifference = totalCost - totalCostWithSale;
        System.out.println("Сумма двух покупок с учетом скидки: " + totalCostWithSale);
        System.out.println("Сумма скидки: " + totalDifference);
        this.service.printFinishMessage();
    }

    /** 1.2.5
     * Сделайте расчет товаров со скидками.
     *      а) Апельсины стоят 73 руб/кг и на них действует скидка 15%, а товар бананы стоят 95 руб/кг. Клиент взял 10 кг
     *              апельсинов и 2кг бананов. Вычислите и выведите в консоль сумму  покупки с учетом скидки.
     *      б) Шампанское стоит 2870 руб и на него действует скидка 50%, а товар хлеб стоит 27 руб. Клиент взял 7 бутылок
     *              шампанского и 1 батон хлеба. Вычислите и выведите в консоль сумму покупки с учетом скидки.
     *      в) Шампиньоны стоят 436 руб/кг, а белые грибы стоят 578 руб/кг и на них действует скидка 5%. Клиент взял 2,5 кг
     *              шампиньонов и 3,75 кг белых грибов. Вычислите и выведите в консоль сумму покупки с учетом скидки.
     */
    public void task5() {
        this.service.printStartMessage("1.2.5");
        int costOrangePerKg = 73;
        int percentOrange = 15;
        double costOrangePerKgWithSale = costOrangePerKg - (double) costOrangePerKg * percentOrange / 100;
        int costBananaPerKg = 95;
        int countOrangeKg = 10;
        int countBananaKg = 2;
        double totalCost = costOrangePerKgWithSale * countOrangeKg + costBananaPerKg * countBananaKg;
        System.out.println("a) Сумма покупки с учетом скидки: " + totalCost);

        int costChampagne = 2870;
        int percentChapagneSale = 50;
        double costChampagneWithSale = costChampagne - (double) costChampagne * percentChapagneSale / 100;
        int countChampagne = 7;
        int costBread = 27;
        int countBread = 1;
        totalCost = costChampagneWithSale * countChampagne + costBread * countBread;
        System.out.println("б) Сумма покупки с учетом скидки: " + totalCost);

        int costChampignonsPerKg = 436;
        int costPorciniPerKg = 578;
        int percentPorciniSale = 5;
        double costPorciniPerKgWithSale = costPorciniPerKg - (double) costPorciniPerKg * percentPorciniSale / 100;
        double countChampignons = 2.5;
        double countPorcini = 3.75;
        totalCost = costPorciniPerKgWithSale * countPorcini + costChampignonsPerKg * countChampignons;
        System.out.println("в) Сумма покупки с учетом скидки: " + totalCost);
        this.service.printFinishMessage();
    }

    /** 1.2.6
     * Объявите 2 переменных типа double ****со значениями
     *      x = 0.40,
     *      y = 0.87;
     * Посчитайте следующие выражения и выведите результат программы в консоль после каждого подсчета:
     *      11*x + y
     *      (x+10*y)- 15*(x/y)
     */
    public void task6() {
        this.service.printStartMessage("1.2.6");
        float x = 0.40f;
        float y = 0.87f;
        float result = 11 * x + y;
        System.out.println("11 * x + y = " + result);
        result = (x + 10 * y) - 15 * x / y;
        System.out.println("(x + 10 * y) - 15 * x / y = " + result);
        this.service.printFinishMessage();
    }
}
