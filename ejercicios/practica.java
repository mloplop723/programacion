
    import java.util.Scanner;
    public class practica {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre de la primera persona");
            String nom1 = sc.nextLine();
            System.out.println("Introduce el nombre de la segunda persona");
            String nom2 = sc.nextLine();
            System.out.println("Introduce los apellidos de la primera persona");
            String ape1 = sc.nextLine();
            System.out.println("Introduce los apellidos de la segunda persona");
            String ape2 = sc.nextLine();
            System.out.println("Introduce la edad de la primera persona");
            int edad1 = Integer.parseInt(System.console().readLine());
            System.out.println("Introduce la edad  de la segunda persona");
            int edad2 = Integer.parseInt(System.console().readLine());
            System.out.println("Introduce la altura de la primera persona");
            double altura1 = sc.nextDouble();
            System.out.println("Introduce la altura  de la segunda persona");
            double altura2 = sc.nextDouble();
            System.out.println("Introduce el peso de la primera persona");
            double peso1 = sc.nextDouble();
            System.out.println("Introduce el peso de la segunda persona");
            double peso2 = sc.nextDouble();
            sc.close();
            int longitud = Math.max(ape1.length(), ape2.length());
            longitud++;
            double imc1 = peso1/(altura1*altura1);
            double imc2 = peso2/(altura2*altura2);
            
            System.out.printf("%-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%n", "Nombre","Apellido","Edad","Altura","Peso","IMC");
            System.out.println("***************************************************************************************************");
            System.out.printf("%-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%n", nom1,ape1,edad1,altura1,peso1,imc1);
            System.out.printf("%-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%"+"-"+longitud+"s%n", nom2,ape2,edad2,altura2,peso2,imc2);
            System.out.println(" ");
            
            System.out.println("La masa corporal de "+ nom1 +" "+ ape1 + " es "+ imc1);
            if (imc1<18.5) {
                System.out.println("El peso es inferior al normal");
            } 
            if (imc1>=18.5 && imc1<=24.9) {
                System.out.println("Su peso es normal");
            }
            if (imc1>=25 && imc1<=29.9){
                System.out.println("Su peso es superior al normal");
            } 
            if (imc1>=30){
                System.out.println("Tienes obesidad");
            }
            System.out.println(" ");
            System.out.println("La masa corporal de "+ nom2 +" "+ ape2 + " es "+ imc2);
            if (imc2<18.5) {
                System.out.println("El peso es inferior al normal");
            } 
            if (imc2>=18.5 && imc2<=24.9) {
                System.out.println("Su peso es normal");
            }
            if (imc2>=25 && imc2<=29.9){
                System.out.println("Su peso es superior al normal");
            } 
            if (imc2>=30){
                System.out.println("Tienes obesidad");
            }
            System.out.println(" ");
            if (imc1>imc2){
                System.out.println(nom1 + " tiene mayor imc que "+ nom2);
            } else if (imc1<imc2){
                System.out.println(nom2 + " tiene mayor imc que "+ nom1);
            } else if (imc1==imc2){
                System.out.println(nom2 + " tienen el mismo imc "+ nom1);
            }
    }
} 
