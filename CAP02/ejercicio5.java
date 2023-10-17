

public class ejercicio5 {
    public static void main(String[] args) {
        int pesetas = 10000;
        double euros = pesetas / 166.386;
        
        System.out.println("Estas " + pesetas + " pesetas son " + euros + " en euros.");
        //Vamos a mostrar dos decimales usando printf en vez de print o println
        System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
      }
}
