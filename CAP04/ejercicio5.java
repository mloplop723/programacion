

public class ejercicio5 {
    public static void main(String[] args) {
        System.out.print("Ingrese el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese el valor de b: ");
        double b = Double.parseDouble(System.console().readLine());
        if (a==0){
            System.out.println("La ecuaación no tiene solución real");
        } else{
            System.out.println("x= "+(-b/a));
        }
    }
}
