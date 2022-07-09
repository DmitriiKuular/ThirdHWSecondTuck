import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double x = 67.3;
        double y = 1.77;
        double bmi = service.calculate(x, y);

        System.out.println("Индекс массы тела - ");
        System.out.printf("%.2f", bmi);
    }
}
