public class Fibonacci {

    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 1;
        int sum = 0;
        int nextOne = 0;

        do {
            if (number2 % 2 == 0) {
                sum += number2;
            }

            nextOne = number1 + number2;
            number1 = number2;
            number2 = nextOne;
        } while (nextOne < 4_000_000);

        System.out.println("A soma dos números pares da sequência até 4 milhôes: " + sum);
    }
}
