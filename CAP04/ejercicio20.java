public class ejercicio20{
    public static void main(String[] args) {
        int num;
        boolean capicua = false;
        System.out.print("Introduzca el número que desee (cinco cifras como máximo): ");
        num = Integer.parseInt(System.console().readLine());
        if (num<10){
            capicua = true;
        }
        if ((num>=10) && (num<100)){
            if ((num/10) == (num%10)){
                capicua = true;
            }
        }
        if ((num>=100) && (num<1000)){
            if ((num/100) == (num%10)){
                capicua = true;
            }
        }
        if ((num>=1000) && (num<10000)){
            if (((num/1000) == (num%10)) && (((num/100)%10) == ((num/10)%10))){
                capicua = true;
            }
        }
        if (num>=10000){
            if (((num/10000) == (num%10)) && ((((num/1000)%10)) == ((num/10)%10))){
                capicua = true;
            }
        }
        if (capicua) {
            System.out.println("El número que has introducido es capicúa");
        } else {
            System.out.println("El número que has introducido no es capicúa");
        }
    }
}