public class BmiService {


    public int calculate(float kg, float m) {

        float result = kg / (m * m);
        return (int) result;
    }

}