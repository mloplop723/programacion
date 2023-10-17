public class ejercicio19 {
    public static void main(String[] args) {
        int num, dig =0;
        System.out.print("Introduzca un número entero puede ser positivo o negativo (puede tener 5 cifras como máximo): ");
        num = Math.abs(Integer.parseInt(System.console().readLine()));
        if (num<10){
            dig=1;
        }
        if ((num>=10) && (num<100)){
            dig=2;
        }
        if ((num>=100) && (num<1000)){
            dig=3;
        }
        if ((num>=1000) && (num<10000)){
            dig=4;
        }
        if (num>=10000){
            dig=5;
        }
        if (dig==1){
            System.out.println("El número que has introducido solo tiene 1 dígito");
        } else{
            System.out.println("El número que has introducido tiene "+dig+" dígitos");
        }
    }
}
