

public class ejercicio6 {
    public static void main(String[] args) {
        //en este ejrcicio vamos a calcular el área del triángulo
        System.out.println("Área de un triángulo");
        System.out.println("--------------------");
        //Para calcular el área del triángulo necesito la base del triángulo y la altura y ambas magnitudes la vamos a medir en centimetros
        System.out.print("Ingrese la base del triángulo en (cm): ");
        double base = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese la altura del triángulo en (cm): ");
        double altura = Double.parseDouble(System.console().readLine());
        //Ahora una vez pedido la base y la altura del triángulo vamos a calcular el área con la fórmula del área del triángulo que es: área=(base*altura)/2
        System.out.println("El área del triángulo es " + (base * altura)/2 + " cm²");
      }
}
