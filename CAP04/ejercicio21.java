public class ejercicio21 {
    public static void main(String[] args) {
        System.out.print("Nota del primer examen: ");
        double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("Nota del segundo examen: ");
        double nota2 = Double.parseDouble(System.console().readLine());
        
        double media=(nota1+nota2)/2;
        
        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/noapto): ");
            String recuperacion = System.console().readLine();
        if (recuperacion.equals("apto")){
            media = 5;
        }
        }
        
        System.out.print("Tu nota de Programación es: " + media);
    }
}
