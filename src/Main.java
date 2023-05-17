public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int kg = 98;
        float m = 1.87F;
        int index = service.calculate(kg, m);
        System.out.println(index);
    }
}
