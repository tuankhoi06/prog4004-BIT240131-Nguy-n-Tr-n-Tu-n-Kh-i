import java.util.function.Predicate;

public class B3 {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        int number1 = 14;
        int number2 = 7;

        System.out.println("So " + number1 + " la so chan? " + isEven.test(number1));
        System.out.println("So " + number2 + " la so chan? " + isEven.test(number2));
    }
}