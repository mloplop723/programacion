

public class ejercicio1{
    public static void main(String[] args) {
        int n;
        int z;
        String linea;
        //este programa va a hacer la multiplicación de dos números enteros por lo que en la siguiente línea vamos a pedir dos números enteros
        System.out.print("Introduzca el primer número: ");
        linea = System.console().readLine();
        n = Integer.parseInt(linea);
        System.out.print("Introduzca el segundo número: ");
        linea = System.console().readLine();
        z = Integer.parseInt(linea);
        //aquí mostraremos el resultado de la multiplicación de los dos números que hemos pedido por pantalla
        System.out.println("La multiplicación es: " + n + " * " + z + " = " + (n * z));
        //Y así hemos sacado el resultado de la multiplicación de los dos números enteros
      }
}
