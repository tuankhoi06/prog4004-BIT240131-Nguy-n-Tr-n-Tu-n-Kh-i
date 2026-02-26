import java.util.function.Consumer;
import java.util.function.Supplier;

public class B5 {
    public static void main(String[] args) {
        Supplier<Double> randomSupplier = () -> Math.random() * 100;
        
        Consumer<Double> printConsumer = num -> System.out.printf("Số may mắn: %.2f%n", num);
        
        printConsumer.accept(randomSupplier.get());
    }
}