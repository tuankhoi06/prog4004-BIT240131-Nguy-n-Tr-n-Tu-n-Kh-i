@FunctionalInterface
interface MathOperation {
    int compute(int a, int b);
}

public class B1 {
    public static void main(String[] args) {
        
        MathOperation addition = (a, b) -> a + b;
        
        MathOperation subtraction = (a, b) -> a - b;
        
        MathOperation multiplication = (a, b) -> a * b;
        
        MathOperation division = (a, b) -> {
            if (b == 0) {
                System.out.println("Lỗi: Không thể chia cho 0");
                return 0; 
            }
            return a / b;
        };

        int x = 20;
        int y = 5;

        System.out.println("=== KẾT QUẢ VÍ DỤ ===");
        System.out.println(x + " + " + y + " = " + addition.compute(x, y));
        System.out.println(x + " - " + y + " = " + subtraction.compute(x, y));
        System.out.println(x + " * " + y + " = " + multiplication.compute(x, y));
        System.out.println(x + " / " + y + " = " + division.compute(x, y));
    }
}