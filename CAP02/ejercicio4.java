

public class ejercicio4 {
    public static void main(String[] args) {
        double conversion = 166.386;
        double euros = 6.35;
        System.out.println(euros+" euros son "+ (int)Math.round(euros*conversion)+" pesetas");
        System.out.printf("%.2f euros son %.2f", euros, euros*conversion);
      }
}
