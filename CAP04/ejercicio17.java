public class ejercicio17 {
    public static void main(String[] args) {
        System.out.print("Introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.println("La última cifra del número entero introducido es "+(num%10));

    }
}
