
public class ejercicio5 {
    public static void main(String[] args) {
        // vamos a calcular el área del rectángulo
        System.out.println("Área de un rectángulo");
        System.out.println("---------------------");
        //en esta línea y en la siguiente vamos a introducir la base del rectángulo y la altura del rectángulo en centímetros ambos
        System.out.print("Ingrese la base del rectángulo en (cm): ");
        double base = Double.parseDouble(System.console().readLine());
        System.out.print("Introduzca la altura en (cm): ");
        double altura = Double.parseDouble(System.console().readLine());
        //una vez pedido la base y la altura del rectángulo lo calculamos con la fórmula del área del rectángulo que es area=base*altura
        System.out.println("El área del rectángulo es " + (base * altura) + " cm²");
      }
}
