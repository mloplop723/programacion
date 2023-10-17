public class ejercicio14 {
    public static void main(String[] args) {
        // Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
        System.out.print("Introduzca un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        if ((num%2)==0){
            System.out.print("El número introducido es par");
        } else{
            System.out.print("El número introducido es impar");
        }
        if ((num%5)==0){
            System.out.println(" y es divisible entre cinco");
        } else{
            System.out.println(" y no es divisible entre cinco");
        }
    }
}
