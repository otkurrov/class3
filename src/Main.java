public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, 2, -4, 2, 3, 6, -7, 1.5, -2.5, 4, -1.5, 7, -3, 5.5, -6.5};
        boolean foundNegative = false;

        double sum = 0;
        int count = 0;


        for (double number : numbers) {

            if (number < 0) {
                foundNegative = true;
            } else if (foundNegative) {

                sum = sum + number;
                count = count + 1;
            }
        }


        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
}
