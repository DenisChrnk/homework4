package homework4;

public class Task3 {
    public static void main(String[] args) {

        int number1 = 21;

        if (number1 % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
        if (number1 % 4 == 0) {
            System.out.println("Четное число. Кратно четырем");
        }
        if (number1 % 2 != 0 && number1 % 3 == 0) {
            System.out.println("Нечетное число. Кратно трем");
        }
    }
}
