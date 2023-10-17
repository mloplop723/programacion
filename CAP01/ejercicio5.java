public class ejercicio5 {
    public static void main(String[] args) {
        String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
    
        System.out.println(azul + "\n Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println(" ======\t=======\t======\t======\t=======");
        System.out.println(verde + " PROG" + blanco + "\tLM\tLM " + verde +"\tPROG" + naranja + "\tFOL");
        System.out.println(verde + " PROG" + blanco+ "\tLM\tLM" + verde +"\tPROG" + naranja + "\tFOL");
        System.out.println(verde + " PROG" + morado + "\tBDATO" + verde +"\tPROG" + verde + "\tPROG" + naranja + "\tFOL");
        System.out.println(azul + " RECREO\tRECREO\tRECREO\tRECREO\tRECREO");
        System.out.println(rojo + " SIN" + morado + "\tBDATO" + verde + "\tPROG" +morado + "\tBDATO" + rojo + "\tSIN");
        System.out.println(rojo + " SIN" + celeste + "\tED" + morado + "\tBDATO" + morado + "\tBDATO" + rojo + "\tSIN");
        System.out.println(rojo + " SIN" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED" + rojo + "\tSIN");
      }
}
