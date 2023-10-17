public class ejercicio18 {
    public static void main(String[] args) {
        int num, prime = 0;
        System.out.print("Introduzca el número entero puede tener cinco cifras como máximo: ");
        num = Integer.parseInt(System.console().readLine());
        if (num<10){
            prime = num;
        }
        if ((num>=10) && (num<100)){
            prime = num/10;
        }
        if ((num>=100) && (num<1000)){
            prime = num/100;
        }
        if ((num>=1000) && (num<10000)){
            prime = num/1000;
        }
        if (num>=10000){
            prime = num/10000;
        }
        System.out.println("La primera cifra del número introducido es el: "+ prime);
    }
}
