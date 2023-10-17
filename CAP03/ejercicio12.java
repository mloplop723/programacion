

public class ejercicio12 {
    public static void main(String[] args) {
        System.out.print("Ingrese la nota de tu primer examen: ");
        double nota1 = Double.parseDouble(System.console().readLine());
        System.out.print("¿Qué nota quieres sacar en el trimestre?");
        double notafinal = Double.parseDouble(System.console().readLine());
        double nota2 = ((notafinal*100)-(nota1*40))/60;
        System.out.println("Para tener un "+notafinal+" en el trimestre");
        System.out.println("Necesitas sacar un "+nota2+" en el siguiente examen");
    }
}
