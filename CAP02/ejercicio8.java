

public class ejercicio8 {
    public static void main(String[] args) {
    char l1 = 'M';
    char l2 = 'a';
    char l3 = 'r';
    char l4 = 'í';
    char l5 = 'a';
    
    //  da error porque el resultado de sumar variables de tipo carácter es un número entero.
    // String palabra = l1 + l2 + l3 + l4 + l5;
    // La solución que se debe de dar es poninedo comillas vacía al principio de la cadena como he puesto en la siguiente línea
    String palabra = "" + l1 + l2 + l3 + l4 + l5;

    System.out.println(palabra);
  }
}
