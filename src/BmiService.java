public class BmiService {
    public double calculate(double weight, double growth) {
        double result = weight / ( growth * growth );
        return result;
    }
}
