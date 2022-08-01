public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    /** Task 1.2.1
     * У вас есть две переменных, в которых хранятся два целочисленных числа. Напишите программу, которая выводит в консоль
     *      результат деления первого числа на второе с остатком.
     * В качестве исходных данных используйте значения для первого числа *– 47, для второго – 13):*
     * В результате деления 47 / 13
     * Выходит 3 и 6 в остатке
     */
    private static void task1() {
        System.out.println("Task 1.2.1");
        int inputFirstNumber = 47;
        int inputSecondNumber = 13;
        int integerPartOfResult = inputFirstNumber / inputSecondNumber;
        int fractionalPartOfResult = inputFirstNumber % inputSecondNumber;
        System.out.println("Выходит " + integerPartOfResult + " и " + fractionalPartOfResult + " в остатке");
        System.out.println();
    }

    /** Task 1.2.2
     * Напишите программу, которая вычисляет сумму цифр двухзначного числа.
     * Программа должна работать с любым значением числа. В качестве исходных данных используйте число 44.
     */
    private static void task2() {
        System.out.println("Task 1.2.2");
        int inputNumber = 44;
        int sum = 0;
        while (inputNumber > 0) {
            sum += inputNumber % 10;
            inputNumber /= 10;
        }
        System.out.println("sum = " + sum);
        System.out.println();
    }
}
