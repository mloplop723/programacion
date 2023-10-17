

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de euros que quiere convertir: ");
        double euros = Double.parseDouble(System.console().readLine());
        //para pasarlo de euros a pesetas la operación que debemos de hacer es la siguiente: multiplicar los euros por 166.386 y ya obtendríamos las pesetas
        int pesetas = (int) (euros * 166.386);
        System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
      }
}
