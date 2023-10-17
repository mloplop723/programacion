

public class ejercicio3 {
    public static void main(String[] args) {
        System.out.print("Ingrese la cantidad de pesetas que quiere convertir: ");
        int pesetas = Integer.parseInt(System.console().readLine());
        //para pasarlo de pesatas a euros debemos de hacer la siguiente operación que es dividiendo la cantidad de pesetas entre 166.386 y ya obtendríamos los euros
        double euros = pesetas / 166.386;
        System.out.printf("%d pesetas son %.2f euros.", pesetas, euros);
      }
}
