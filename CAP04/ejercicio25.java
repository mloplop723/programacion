import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en centímetros (cm): ");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.print("Ahora introduzca la anchura de la bandera: ");
        int anchura = Integer.parseInt(sc.nextLine());
        System.out.print("¿Quieres el escudo bordado? (s/n): ");
        boolean conEscudo = ((sc.nextLine()).toLowerCase()).equals("s");
        String escudoCadena;
        float precioEscudo;
        if (conEscudo) {
            escudoCadena = "Con escudo";
            precioEscudo=2.50f;
        }else {
            escudoCadena = "Sin escudo";
            precioEscudo = 0;
        }
        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.printf("Bandera de %5d cm2: %5.2f €\n", anchura * altura, (float)anchura * altura / 100);
        System.out.printf("%s:           %5.2f €\n", escudoCadena, precioEscudo);
        System.out.printf("Gastos de envío:      %5.2f €\n", 3.25);
        System.out.printf("Total:                %5.2f €\n", (float)anchura * altura / 100 + precioEscudo + 3.25);
        sc.close();
    }
}
