

public class ejercicio1 {
    public static void main(String[] args) {
        String dia;
        //pido que me introduzca un día de la semana de lunes a domingo y en cada uno he puesto lo que tengo o en el caso de sabado y domingo te dirá que no hay clases ese dia
        System.out.print("Ingrese un día y te diré que asignatura tengo a primera hora ese día: ");
        dia = System.console().readLine();
        dia = dia.toLowerCase();
        switch (dia){
            case "lunes":
                System.out.println("Programación");
                break;
            case "martes":
                System.out.println("Lenguajes de marca");
                break;
            case "miércoles":
                System.out.println("Lenguajes de marca");
                break;
            case "jueves":
                System.out.println("Programación");
                break;
            case "viernes":
                System.out.println("FOL");
                break;
            case "sábado":
                System.out.println("El día introducido no hay clase");
                break;
            case "domingo":
                System.out.println("El día introducido no hay clases");
                break;
            default:
                System.out.println("El día introducido no es correcto, por favor introduzca otro");
            


        }
    }
}
