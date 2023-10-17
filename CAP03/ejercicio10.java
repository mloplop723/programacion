

public class ejercicio10 {
    public static void main(String[] args) {
        System.out.print("Ingrese el valor de MB: ");
        double mb = Double.parseDouble(System.console().readLine());
        System.out.println(mb+" Mb son "+(mb*1024)+" Kb");
    }
}
