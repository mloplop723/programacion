public class ejercicio22 {
    public static void main(String[] args) {
        System.out.print("Introduzca un día de la semana de lunes a viernes: ");
        String dia= System.console().readLine();
        int diaNum=0;
        switch(dia) {
            case "lunes":
                diaNum = 0;
                break;
            case "martes":
                diaNum = 1;
                break;
            case "miercoles":
                diaNum = 2;
                break;
            case "jueves":
                diaNum = 3;
                break;
            case "viernes":
                diaNum = 4;
                break;
            default:
                System.out.print("El día que has introducido no es correcto");
        }
        System.out.print("Hora: ");
        int hora = Integer.parseInt(System.console().readLine());
        System.out.print("Minutos: ");
        int minuto = Integer.parseInt(System.console().readLine());
        int minTotal = (4*24*60)+(15*60);
        int minActual =(diaNum*24*60)+(hora*60)+minuto;
        System.out.println("Faltan estos "+(minTotal-minActual)+" minutos para que sea fin de semana");
    }
}
