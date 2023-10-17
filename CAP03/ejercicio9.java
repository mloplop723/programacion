

public class ejercicio9 {
    public static void main(String[] args) {
        final double PI=3.1415932654;        System.out.println("EL vólumen del cono");   
        System.out.println("--------------------");
        System.out.print("Ingrese la altura en centímetros(cm): ");
        double h = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese el radio de la base del cono que desee en centímetros (cm): ");
        double r =Double.parseDouble(System.console().readLine());
        double v = ((1.0/3.0)*(PI*r*r*h));
        System.out.println("El volumen del cono es: "+v+"cm3");
    }
}
