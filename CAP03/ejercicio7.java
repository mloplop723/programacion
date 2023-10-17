

public class ejercicio7 {
        public static void main(String[] args) {
            //vamos a calcular el total de la factura a partir de la base imponible
            //LA BASE IMPONIBLE ES EL PRECIO DE LA FACTURA SIN IVA
        System.out.print("Ingrese la base imponible que desee: ");
        double baseImponible = Double.parseDouble(System.console().readLine());
    
        System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
        System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));
        System.out.printf("-------------------------\n");
        System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));
      }
}
