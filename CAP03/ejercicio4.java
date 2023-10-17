

public class ejercicio4 {
    public static void main(String[] args) {
        double i;
        double j;
        String linea;
    
        System.out.print("Introduzca el primer número: ");
        linea = System.console().readLine();
        i = Double.parseDouble(linea);
        System.out.print("Introduzca el segundo número: ");
        linea = System.console().readLine();
        j = Double.parseDouble(linea);
        
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("i + j = " + (i + j));
        System.out.println("i - j = " + (i - j));
        System.out.println("i / j = " + (i / j));
        System.out.println("i * j = " + (i * j));
      }
}
